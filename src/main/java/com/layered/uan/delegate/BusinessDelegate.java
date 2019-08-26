package com.layered.uan.delegate;

import com.layered.uan.service.LookUpService;
import com.layered.uan.service.IBusinessService;

public class BusinessDelegate {
	private LookUpService lookUpService = new LookUpService();
	private IBusinessService businessService;
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		businessService = lookUpService.getService(serviceType);
		businessService.doProcessing();
	}

}
