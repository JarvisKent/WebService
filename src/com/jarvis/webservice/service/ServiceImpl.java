package com.jarvis.webservice.service;

import javax.jws.WebService;

import org.apache.log4j.Logger;



@WebService(endpointInterface = "com.jarvis.webservice.service.Service")
public class ServiceImpl implements Service {

	private static final Logger logger = Logger.getLogger(ServiceImpl.class);	
	
	public void test() {
		
		logger.info("test");
	}

}
