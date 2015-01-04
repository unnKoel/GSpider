package com.snail.spider.knot.task.receiver.impl;

import java.util.HashMap;
import java.util.Map;

import com.snail.spider.knot.task.receiver.ResultReceiver;

/**
 * map结构收集器
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午7:54:13
 * @version V1.0
 */
public abstract class MapResultReceiver<E, T> implements ResultReceiver<E, T> {
	protected Map<E, T> operateResult = new HashMap<E, T>();
}
