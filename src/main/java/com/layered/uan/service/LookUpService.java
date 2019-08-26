package com.layered.uan.service;

public class LookUpService {
	
	public IBusinessService getService(String serviceType) {
		if(serviceType.equalsIgnoreCase("first")) {
			return new FirstService();
		} else {
			return new SecondService();
		}
	}
}
