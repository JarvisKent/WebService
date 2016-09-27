package com.jarvis.webservice.client;

import com.jarvis.webservice.utils.RequestUtils;
import com.jarvis.webservice.utils.SendMessageListener;

public class Client {

	public static void main(String[] args) {
		//���Ǹ���֤�ֻ������ص�webservice��
		RequestUtils request = new RequestUtils();
		String url ="http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";
		String method = "getMobileCodeInfo";
		String[] param = new String[]{"phone number",""};
		request.SendToWebService(url,method, param, new SendMessageListener() {
			
			public void success(Object[] result) {
				System.out.println(""+result[0]);
			}
			
			public void failed(Exception e) {
				System.out.println("��������ʧ��");
			}
		});
	}
}