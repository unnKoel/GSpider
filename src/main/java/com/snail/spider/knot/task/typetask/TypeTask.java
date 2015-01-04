package com.snail.spider.knot.task.typetask;

import java.util.List;

import com.snail.spider.knot.task.Task;
import com.snail.spider.knot.task.operation.OperatePackage;
import com.snail.spider.knot.task.operation.Operation;
import com.snail.spider.knot.task.receiver.impl.ObjectMapResultRec;

/**
 * 以抓取对象类型定义的任务
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午8:04:12
 * @version V1.0
 */
public class TypeTask implements Task {
	private List<Page> pages;

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public void doTask() throws Exception {
		for (Page page : pages) { // 每个页面上执行操作
			OperatePackage<Page, String, Object> operatePackage = new OperatePackage<Page, String, Object>(page,
				new ObjectMapResultRec()); // 定义处理包
			Operation<OperatePackage<Page, String, Object>> operation = page.getOperation(); // 获取页面处理集
			operation.doOperation(operatePackage); // 处理
		}
	}
}
