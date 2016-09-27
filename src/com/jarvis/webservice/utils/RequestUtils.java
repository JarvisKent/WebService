package com.jarvis.webservice.utils;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class RequestUtils {
	/**
	 * ����WebService����
	 * @param url		wsdl��ַ
	 * @param method	Ҫ���õķ�����
	 * @param param		����
	 * @param listener	�������ý��
	 */
	public void SendToWebService(String url,String method,String[] param,SendMessageListener listener){
		JaxWsDynamicClientFactory factory  = JaxWsDynamicClientFactory.newInstance();
		Client client = (Client) factory.createClient(url);
		Object[] result;
		try {
			result = client.invoke(method, param);
			listener.success(result);
		} catch (Exception e) {
			listener.failed(e);
		}
	}
}
