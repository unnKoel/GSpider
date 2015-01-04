package com.snail.spider.selector;

import java.util.List;

/**
 * 抽取器。<br>
 * 
 * @author lizhuo
 * @version 1.0 2013-8-8
 */
public abstract class Selector {

	public abstract String first(String text);

	public abstract List<String> selectList(String text);

	public abstract String last(String text);
}
