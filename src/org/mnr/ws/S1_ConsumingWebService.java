package org.mnr.ws;

import java.util.Scanner;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class S1_ConsumingWebService {
	
	public static void main(String...args){
		
		Scanner scanner = new Scanner(System.in);
		String ip = scanner.next();
		
		GeoIPService geoIpService = new GeoIPService();//Web service utitlity class to get actual service class
		GeoIPServiceSoap soap	= geoIpService.getGeoIPServiceSoap();// utility class meant for calling actual web service method
		GeoIP geoIp = soap.getGeoIP(ip);//actual web service call
		//GeoIo is output object
		/**This can be identified using wsdl. In wsdl, there will be a part with following entries
		 * <wsdl:service name="GeoIPService">// This is the utility class to get the object of actual web service class which contains services
		 * <wsdl:port name="GeoIPServiceSoap" binding="tns:GeoIPServiceSoap">// This is the class which has actual web service public methods

		 */
		
		System.out.println(geoIp.getCountryName());
		
	}

}
