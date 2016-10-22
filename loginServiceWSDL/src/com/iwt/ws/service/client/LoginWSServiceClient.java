package com.iwt.ws.service.client;

import java.net.URL;

import com.iwinner.ws.service.LoingWSServiceImplServiceLocator;
import com.iwinner.ws.service.LoingWSServiceImplSoapBindingStub;

public class LoginWSServiceClient {

	public static void main(String[] args) {

		try {

			LoingWSServiceImplSoapBindingStub loginServiceStub = (LoingWSServiceImplSoapBindingStub) new LoingWSServiceImplServiceLocator()
					.getLoingWSServiceImpl(new URL(
							"http://iwinnertech.com/WService/services/LoingWSServiceImpl?wsdl"));

			boolean result = loginServiceStub.loginVerfication("", "");

			System.out.println("Result is " + result);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/*
	 * try{ ECSServiceSoapBindingStub binding = null;
	 * System.out.println("Intializing ..."); //binding =
	 * (ECSServiceSoapBindingStub) new
	 * ECSServiceServiceLocator().getECSService(new
	 * URL("http://172.16.128.200:2506/subscriptionInterface/services/ECSService"
	 * )); //http://10.219.1.101:2506/subscriptionInterface/services/ECSService
	 * binding = (ECSServiceSoapBindingStub) new
	 * ECSServiceServiceLocator().getECSService(new
	 * URL("http://10.219.1.101:2506/subscriptionInterface/services/ECSService"
	 * )); binding.setUsername("test"); binding.setPassword("test123");
	 * 
	 * ServiceData sd=binding.getServiceList("60122081139");
	 * System.out.println("Response:"+sd.getResponseCode()); ServiceDetails[]
	 * sdets=sd.getServiceList(); for(ServiceDetails sdet:sdets){
	 * System.out.println
	 * (sdet.getShortCode()+"-"+sdet.getKeyword()+"-"+sdet.getSubscriptionTime
	 * ()); } }catch(Exception e){ e.printStackTrace(); } }
	 */
}
