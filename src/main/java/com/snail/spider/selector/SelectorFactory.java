package com.snail.spider.selector;

import java.lang.reflect.Constructor;

/**
 * 产生selector的工厂。<br>
 */
public class SelectorFactory {

	public static RegexSelector newRegexSelector(String regex) {
		return newSelector(RegexSelector.class, regex);
	}

	public static XpathSelector newXpathSelector(String xpath) {
		return newSelector(XpathSelector.class, xpath);
	}

	private static <T extends Selector> T newSelector(Class<T> clazz, String... param) {
		try {
			if (param.length == 0) {
				Constructor<T> constructor = clazz.getConstructor();
				T selector = constructor.newInstance();
				return selector;
			} else if (param.length == 1) {
				Constructor<T> constructor = clazz.getConstructor(String.class);
				T selector = constructor.newInstance(param[0]);
				return selector;
			} else if (param.length == 2) {
				Constructor<T> constructor = clazz.getConstructor(String.class, String.class);
				T selector = constructor.newInstance(param[0], param[1]);
				return selector;
			} else {
				throw new UnsupportedOperationException();
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("init object error", e);
		}
	}

}
