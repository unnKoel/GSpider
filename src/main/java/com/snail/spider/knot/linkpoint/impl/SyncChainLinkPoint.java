package com.snail.spider.knot.linkpoint.impl;

import java.util.concurrent.BlockingQueue;

import com.snail.spider.knot.linkpoint.LinkPoint;

/**
 * 同步链连接点
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 上午9:32:38
 * @version V1.0
 */
public class SyncChainLinkPoint extends LinkPoint<Object> {
	private BlockingQueue<Object> queue;

	public SyncChainLinkPoint(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	public BlockingQueue<Object> getQueue() {
		return queue;
	}

	@Override
	public Object getData() throws InterruptedException {
		return queue.take();
	}

	@Override
	public void storeData(Object obj) {
		queue.add(obj);
	}
}
