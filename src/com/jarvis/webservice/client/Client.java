package com.jarvis.webservice.client;

import com.jarvis.webservice.utils.RequestUtils;
import com.jarvis.webservice.utils.RequestUtils.SendMessageListener;

public class Client {

	public static void main(String[] args) {
		//这是个验证手机归属地的webservice。
		RequestUtils request = new RequestUtils();
		String url ="http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";
		String method = "getMobileCodeInfo";
		//第一个参数为手机号，第二个默认为空
		String[] param = new String[]{"phone number",""};
		request.SendToWebService(url,method, param, new SendMessageListener() {
			
			public void success(Object[] result) {
				System.out.println(""+result[0]);
			}
		});
	}
}
