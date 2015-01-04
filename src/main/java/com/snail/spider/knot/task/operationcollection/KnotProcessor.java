package com.snail.spider.knot.task.operationcollection;

/**
 * 节处理接口
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午6:25:13
 * @version V1.0
 */
public interface KnotProcessor<T> {
	public void process(T operator) throws Exception;
}
