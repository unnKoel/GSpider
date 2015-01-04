package com.snail.spider.selector;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * css风格的选择器。包装了Jsoup。<br>
 */
public class CssSelector extends Selector {

	private String selectorText;

	public CssSelector(String selectorText) {
		this.selectorText = selectorText;
	}

	@Override
	public String first(String text) {
		Document doc = Jsoup.parse(text);
		Elements elements = doc.select(selectorText);
		if (CollectionUtils.isNotEmpty(elements)) {
			return null;
		}
		return elements.get(0).outerHtml();
	}

	@Override
	public List<String> selectList(String text) {
		List<String> strings = new ArrayList<String>();
		Document doc = Jsoup.parse(text);
		Elements elements = doc.select(selectorText);
		if (CollectionUtils.isNotEmpty(elements)) {
			for (Element element : elements) {
				strings.add(element.outerHtml());
			}
		}
		return strings;
	}

	@Override
	public String last(String text) {
		Document doc = Jsoup.parse(text);
		Elements elements = doc.select(selectorText);
		if (CollectionUtils.isNotEmpty(elements)) {
			return null;
		}
		int i = elements.size();
		return elements.get(i - 1).outerHtml();
	}
}
