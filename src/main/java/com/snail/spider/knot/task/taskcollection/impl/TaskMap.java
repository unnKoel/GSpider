package com.snail.spider.knot.task.taskcollection.impl;

import java.util.Map;

import com.snail.spider.knot.task.Task;
import com.snail.spider.knot.task.Task_Key;
import com.snail.spider.knot.task.taskcollection.TaskCollection;

/**
 * Map任务集
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-21 下午9:06:16
 * @version V1.0
 */
public class TaskMap implements TaskCollection<Task_Key, Task> {
	private Map<Task_Key, Task> taskMap;

	public Task getTask(Task_Key key) {
		return taskMap.get(key);
	}

	public void setTask(Task_Key key, Task value) {
		taskMap.put(key, value);
	}

	public Map<Task_Key, Task> getTaskMap() {
		return taskMap;
	}

	public void setTaskMap(Map<Task_Key, Task> taskMap) {
		this.taskMap = taskMap;
	}
}
