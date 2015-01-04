package com.snail.spider;

/**
 * 抓取接口
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午9:00:26
 * @version V1.0
 */
public interface Capture {
	/**
	 * 启动
	 * 
	 * @throws Exception
	 */
	public void launch() throws Exception;

	/**
	 * 停止
	 */
	public void stop();
}
