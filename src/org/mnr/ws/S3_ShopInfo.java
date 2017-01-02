package org.mnr.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.mnr.exception.InvalidInputException;

@WebService(name="ShopInfo",portName="ShopInfoPort",serviceName="ShopInfoService",targetNamespace="https://www.mart.naveen.org")
//@SOAPBinding(style=Style.DOCUMENT)
//This is default binding. It generates seperate schema for types(input,output)
//sothat it can be validated seperately by consumers
//It is loosely coupled

@SOAPBinding(style=Style.RPC)
//No seperate schema for types. Types will be defined within the main wsdl schema itself.
//Tightly coupled so validation can't be performed
//When using RPC, we can change input,output param names in the wsdl using WebResult and WebParam annotations
public class S3_ShopInfo {
	@WebMethod(operationName="fetchShopInfo")
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput")String property) throws InvalidInputException{
		String result ="Invalid Property";
		
		if("shopName".equalsIgnoreCase(property))
			result="Mart";
		else if("since".equalsIgnoreCase(property))
			result="2013";
		else 
			throw new InvalidInputException("Invalid Input", property+" is not valid input");
		return result;
	}

}
