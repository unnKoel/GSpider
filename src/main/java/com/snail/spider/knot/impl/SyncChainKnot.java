package com.snail.spider.knot.impl;

import java.util.concurrent.LinkedBlockingQueue;

import com.snail.spider.knot.linkpoint.impl.SyncChainLinkPoint;
import com.snail.spider.knot.task.Task_Key;
import com.snail.spider.knot.task.typetask.ClassNameKey;

/**
 * 同步链爬取节
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午6:06:51
 * @version V1.0
 */
public class SyncChainKnot extends MapTaskKnot<Object> {
	public SyncChainKnot() {
		frontLinkPoint = new SyncChainLinkPoint(new LinkedBlockingQueue<Object>());
		backLinkPoint = new SyncChainLinkPoint(new LinkedBlockingQueue<Object>());
	}

	public void stop() {

	}

	public Task_Key newKey(Object data) {
		return new ClassNameKey(data.getClass().getName());
	}
}
