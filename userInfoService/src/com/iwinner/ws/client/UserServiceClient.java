package com.iwinner.ws.client;

import java.net.URL;

import com.iwinner.ws.service.UserInfoDTO;
import com.iwinner.ws.service.WsUserServiceImplServiceLocator;
import com.iwinner.ws.service.WsUserServiceImplSoapBindingStub;

public class UserServiceClient {

	public static void main(String[] args) {

		try {
			WsUserServiceImplSoapBindingStub stub = (WsUserServiceImplSoapBindingStub) new WsUserServiceImplServiceLocator()
					.getWsUserServiceImpl(new URL(
							"http://localhost:3636/WService/services/WsUserServiceImpl?wsdl"));

			UserInfoDTO userInfoDTO = stub.userDeatilsByUsername("test");

			System.out.println(userInfoDTO.getCreateDate()+" "+userInfoDTO.getUsername()+"  "+userInfoDTO.getPassword());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}