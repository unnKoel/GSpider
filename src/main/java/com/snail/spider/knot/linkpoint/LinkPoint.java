package com.snail.spider.knot.linkpoint;

/**
 * 连接节点
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午8:13:57
 * @version V1.0
 */
public abstract class LinkPoint<T> {
	protected Integer lPointIndex; // 连接点序号

	public Integer getLPointIndex() {
		return lPointIndex;
	}

	public abstract T getData() throws InterruptedException; // 取数据接口

	public abstract void storeData(T obj); // 存数据
}
