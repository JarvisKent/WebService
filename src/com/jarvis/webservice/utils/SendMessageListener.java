package com.jarvis.webservice.utils;

public interface SendMessageListener {
	/**
	 * 调用webservice成功接口，返回一个object数组
	 * @param result
	 */
	public void success(Object[] result);
	public void failed(Exception e);
}
