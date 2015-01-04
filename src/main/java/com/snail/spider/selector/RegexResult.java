package com.snail.spider.selector;

/**
 * 封装正则表达式抽取接口的类。<br>
 */
class RegexResult {

	private String[] groups;

	public static final RegexResult EMPTY_RESULT = new RegexResult();

	public RegexResult() {

	}

	public RegexResult(String[] groups) {
		this.groups = groups;
	}

	public String get(int groupId) {
		if (groups == null) {
			return null;
		}
		return groups[groupId];
	}

	public int size() {
		return groups.length;
	}
}
