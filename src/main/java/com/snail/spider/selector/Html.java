package com.snail.spider.selector;

import java.util.ArrayList;
import java.util.List;

public class Html implements Selectable {

	private List<String> strings;

	public Html(List<String> strings) {
		this.strings = strings;
	}

	public Html(String text) {
		List<String> results = new ArrayList<String>();
		results.add(text);
		this.strings = results;
	}

	public Selectable xpath(String xpath) {
		XpathSelector xpathSelector = SelectorFactory.newXpathSelector(xpath);
		return selectList(xpathSelector, strings);
	}

	protected Selectable first(Selector selector, List<String> strings) {
		List<String> results = new ArrayList<String>();
		for (String string : strings) {
			String result = selector.first(string);
			if (result != null) {
				results.add(result);
			}
		}
		return new Html(results);
	}

	protected Selectable selectList(Selector selector, List<String> strings) {
		List<String> results = new ArrayList<String>();
		for (String string : strings) {
			List<String> result = selector.selectList(string);
			results.addAll(result);
		}
		return new Html(results);
	}

	public Selectable $(String selector) {
		CssSelector cssSelector = new CssSelector(selector);
		return selectList(cssSelector, strings);
	}

	public Selectable links() {
		XpathSelector xpathSelector = SelectorFactory.newXpathSelector("//a/@href");
		return selectList(xpathSelector, strings);
	}

	public Selectable regex(String regex) {
		RegexSelector regexSelector = SelectorFactory.newRegexSelector(regex);
		return selectList(regexSelector, strings);
	}

	public String toText() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < strings.size(); i++) {
			buffer.append(strings.get(i));
			buffer.append("\r\n");
		}
		return buffer.toString();
	}

	public List<String> all() {
		return strings;
	}
}
