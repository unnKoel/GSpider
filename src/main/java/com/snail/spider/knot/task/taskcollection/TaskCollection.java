package com.snail.spider.knot.task.taskcollection;

import com.snail.spider.knot.task.Task;
import com.snail.spider.knot.task.Task_Key;

/**
 * 任务集
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-21 下午8:38:33
 * @version V1.0
 */
public interface TaskCollection<E extends Task_Key, T extends Task> {

	public T getTask(E key); // 获取任务

	public void setTask(E key, T value); // 设置任务
}
