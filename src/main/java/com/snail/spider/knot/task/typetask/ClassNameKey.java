package com.snail.spider.knot.task.typetask;

import com.snail.spider.knot.task.Task_Key;

/**
 * 以类型名称作为任务键值
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午7:24:11
 * @version V1.0
 */
public class ClassNameKey implements Task_Key {
	private String className; // 类型名

	public ClassNameKey(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ClassNameKey other = (ClassNameKey) obj;
		if (className == null) {
			if (other.className != null) return false;
		} else if (!className.equals(other.className)) return false;
		return true;
	}
}
