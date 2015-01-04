package com.snail.spider.knot.task.typetask;

import java.io.Serializable;
import java.util.Properties;

import com.snail.spider.knot.task.operation.OperatePackage;
import com.snail.spider.knot.task.operation.Operation;

/**
 * 请求页面
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-29 下午7:30:27
 * @version V1.0
 */
public class Page implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String url; // URL地址
	private String params; // 请求参数 （name=value&name=value形式）
	private String pageCharset; // 页面编码
	private String requestType; // 请求类型(get/post)
	private Properties properties; // 请求属性
	private Operation<OperatePackage<Page, String, Object>> operation; // 页面操作

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getPageCharset() {
		return pageCharset;
	}

	public void setPageCharset(String pageCharset) {
		this.pageCharset = pageCharset;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Operation<OperatePackage<Page, String, Object>> getOperation() {
		return operation;
	}

	public void setOperation(Operation<OperatePackage<Page, String, Object>> operation) {
		this.operation = operation;
	}
}
