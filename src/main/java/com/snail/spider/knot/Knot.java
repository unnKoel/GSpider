package com.snail.spider.knot;

import com.snail.spider.Capture;
import com.snail.spider.knot.linkpoint.LinkPoint;
import com.snail.spider.knot.task.Task;
import com.snail.spider.knot.task.Task_Key;
import com.snail.spider.knot.task.taskcollection.TaskCollection;

/**
 * 抓取节抽象类
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-21 下午9:52:45
 * @version V1.0
 */
public abstract class Knot<T> implements Capture {
	protected TaskCollection<Task_Key, Task> taskCollection; // 任务
	protected LinkPoint<T> frontLinkPoint; // 前连接点
	protected LinkPoint<T> backLinkPoint; // 后连接点

	public void launch() throws Exception {
		while (true) {
			T data = frontLinkPoint.getData(); // 从前库取出数据
			Task_Key tKey = newKey(data); // 生成任务键
			Task task = taskCollection.getTask(tKey); // 取得任务
			task.doTask(); // 执行
		}
	}

	public abstract Task_Key newKey(T data);

	public TaskCollection<Task_Key, Task> getTaskCollection() {
		return taskCollection;
	}

	public void setTaskCollection(TaskCollection<Task_Key, Task> taskCollection) {
		this.taskCollection = taskCollection;
	}

	public LinkPoint<T> getFrontLinkPoint() {
		return frontLinkPoint;
	}

	public void setFrontLinkPoint(LinkPoint<T> frontLinkPoint) {
		this.frontLinkPoint = frontLinkPoint;
	}

	public LinkPoint<T> getBackLinkPoint() {
		return backLinkPoint;
	}

	public void setBackLinkPoint(LinkPoint<T> backLinkPoint) {
		this.backLinkPoint = backLinkPoint;
	}
}
