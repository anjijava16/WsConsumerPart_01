package NET.webserviceX.www.clientCOde;

import java.net.URL;

import NET.webserviceX.www.GlobalWeatherLocator;
import NET.webserviceX.www.GlobalWeatherSoapStub;

public class GlobalCitiesInfo {

	public static void main(String[] args) {

		try {

			GlobalWeatherSoapStub stub = (GlobalWeatherSoapStub) new GlobalWeatherLocator()
					.getGlobalWeatherSoap(new URL(
							"http://www.webservicex.net/globalweather.asmx?wsdl"));

			String res = stub.getCitiesByCountry("INDIA");
			System.out.println("Country Name is" + res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
