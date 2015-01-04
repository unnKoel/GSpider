package com.snail.spider.knot.task.receiver;

/**
 * 收集器接口
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午7:43:04
 * @version V1.0
 */
public interface ResultReceiver<E, T> {

	public void putData(E key, T data); // 存入数据

	public T getTask(E key); // 获取数据
}
