package com.jarvis.webservice.utils;

public interface SendMessageListener {
	/**
	 * ����webservice�ɹ��ӿڣ�����һ��object����
	 * @param result
	 */
	public void success(Object[] result);
	public void failed(Exception e);
}
