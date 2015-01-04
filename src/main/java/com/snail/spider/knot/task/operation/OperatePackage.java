package com.snail.spider.knot.task.operation;

import com.snail.spider.knot.task.receiver.ResultReceiver;

/**
 * 处理包
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午8:27:33
 * @version V1.0
 */
public class OperatePackage<S, E, T> {
	private S operateObj; // 处理对象
	private ResultReceiver<E, T> resultReceiver; // 结果收集器

	public OperatePackage(S operateObj, ResultReceiver<E, T> resultReceiver) {
		super();
		this.operateObj = operateObj;
		this.resultReceiver = resultReceiver;
	}

	public S getOperateObj() {
		return operateObj;
	}

	public void setOperateObj(S operateObj) {
		this.operateObj = operateObj;
	}

	public ResultReceiver<E, T> getResultReceiver() {
		return resultReceiver;
	}

	public void setResultReceiver(ResultReceiver<E, T> resultReceiver) {
		this.resultReceiver = resultReceiver;
	}
}
