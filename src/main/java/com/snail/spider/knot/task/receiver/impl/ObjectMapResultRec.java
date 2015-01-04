package com.snail.spider.knot.task.receiver.impl;      

/**
 * 存储Object的map结果集
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午8:18:06
 * @version V1.0
 */
public class ObjectMapResultRec extends MapResultReceiver<String, Object> {

	public void putData(String key, Object data) {
		operateResult.put(key, data);
	}

	public Object getTask(String key) {
		return operateResult.get(key);
	}
}
