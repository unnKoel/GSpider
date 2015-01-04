package com.snail.spider.selector;

import java.util.List;

/**
 * @author lizhuo
 * @version 1.0 2013-8-7
 */
public interface Selectable {
	/**
	 * select list with xpath
	 * 
	 * @param xpath
	 * @return new Selectable after extract
	 */
	public Selectable xpath(String xpath);

	/**
	 * select list with css selector
	 * 
	 * @param selector
	 *            css selector expression
	 * @return new Selectable after extract
	 */
	public Selectable $(String selector);

	/**
	 * select all links
	 * 
	 * @return all links
	 */
	public Selectable links();

	/**
	 * select list with regex
	 * 
	 * @param regex
	 * @return new Selectable after extract
	 */
	public Selectable regex(String regex);

	/**
	 * single string result
	 * 
	 * @return single string result
	 */
	public String toText();

	/**
	 * multi string result
	 * 
	 * @return multi string result
	 */
	public List<String> all();

}
