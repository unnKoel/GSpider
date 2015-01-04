package com.snail.spider.knot.impl;

import com.snail.spider.knot.Knot;
import com.snail.spider.knot.task.taskcollection.impl.TaskMap;

/**
 * Map任务集节
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午8:01:38
 * @version V1.0
 */
public abstract class MapTaskKnot<T> extends Knot<T> {
	public MapTaskKnot() {
		taskCollection = new TaskMap();
	}
}
