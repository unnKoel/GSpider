package com.snail.spider.selector;

import org.htmlcleaner.*;

import java.util.ArrayList;
import java.util.List;

/**
 * xpath的选择器。包装了HtmlCleaner。<br>
 */
public class XpathSelector extends Selector {

	private String xpathStr;

	public XpathSelector(String xpathStr) {
		this.xpathStr = xpathStr;
	}

	// 返回符合要求的第一个元素
	public String first(String text) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();
		TagNode tagNode = htmlCleaner.clean(text);
		if (tagNode == null) {
			return null;
		}
		try {
			Object[] objects = tagNode.evaluateXPath(xpathStr);
			if (objects != null && objects.length >= 1) {
				if (objects[0] instanceof TagNode) {
					TagNode tagNode1 = (TagNode) objects[0];
					return htmlCleaner.getInnerHtml(tagNode1);
				} else {
					return objects[0].toString();
				}
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 返回符合要求的所有元素
	@Override
	public List<String> selectList(String text) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();
		TagNode tagNode = htmlCleaner.clean(text);
		if (tagNode == null) {
			return null;
		}
		List<String> results = new ArrayList<String>();
		try {
			Object[] objects = tagNode.evaluateXPath(xpathStr);
			if (objects != null && objects.length >= 1) {
				for (Object object : objects) {
					if (object instanceof TagNode) {
						TagNode tagNode1 = (TagNode) object;
						results.add(htmlCleaner.getInnerHtml(tagNode1));
					} else {
						results.add(object.toString());
					}
				}
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
		return results;
	}

	@Override
	public String last(String text) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();
		TagNode tagNode = htmlCleaner.clean(text);
		if (tagNode == null) {
			return null;
		}
		try {
			Object[] objects = tagNode.evaluateXPath(xpathStr);
			if (objects != null && objects.length >= 1) {
				int length = objects.length;
				if (objects[length - 1] instanceof TagNode) {
					TagNode tagNode1 = (TagNode) objects[0];
					return htmlCleaner.getInnerHtml(tagNode1);
				} else {
					return objects[0].toString();
				}
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
		return null;
	}
}
