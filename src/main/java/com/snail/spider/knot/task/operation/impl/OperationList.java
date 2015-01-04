package com.snail.spider.knot.task.operation.impl;

import java.util.List;

import com.snail.spider.knot.task.operation.OperationCollection;
import com.snail.spider.knot.task.operationcollection.KnotProcessor;

/**
 * 处理列表
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-21 下午6:58:02
 * @version V1.0
 */
public class OperationList<T> implements OperationCollection<T> {
	private List<KnotProcessor<T>> processors;

	public void doOperation(T Operator) throws Exception {
		for (KnotProcessor<T> processor : processors) {
			processor.process(Operator);
		}
	}

	public List<KnotProcessor<T>> getProcessors() {
		return processors;
	}

	public void setProcessors(List<KnotProcessor<T>> processors) {
		this.processors = processors;
	}
}
