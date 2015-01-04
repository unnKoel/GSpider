package com.snail.spider;

/**
 * 爬虫
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午8:39:13
 * @version V1.0
 */
public class Creeper implements Capture {
	private Capture capture;

	public Creeper(Capture capture) {
		super();
		this.capture = capture;
	}

	public void launch() {
		// TODO Auto-generated method stub
	}

	public void stop() {
		// TODO Auto-generated method stub
		capture.stop();
	}
}
