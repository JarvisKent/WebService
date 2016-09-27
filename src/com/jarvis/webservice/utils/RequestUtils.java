package com.jarvis.webservice.utils;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class RequestUtils {
	/**
	 * 调用WebService方法
	 * @param url		wsdl地址
	 * @param method	要调用的方法名
	 * @param param		参数
	 * @param listener	监听调用结果
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
