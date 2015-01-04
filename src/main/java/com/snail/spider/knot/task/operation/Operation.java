package com.snail.spider.knot.task.operation;

/**
 * 处理
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-23 下午4:24:48
 * @version V1.0
 */
public interface Operation<T> {
	public void doOperation(T Operator) throws Exception;
}
