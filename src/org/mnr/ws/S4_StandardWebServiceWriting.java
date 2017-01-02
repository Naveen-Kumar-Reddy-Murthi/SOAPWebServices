package org.mnr.ws;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.mnr.model.Product;
import org.mnr.ws.businessimpl.BIServiceImpl;
/**
 * This is the standard way of creating soap web service using interface 
 * This is considered as the best practice in service first approach
 * Following property in WebService annotation is must when following this approach
 */


@WebService(name="MartCatelogV2",
			portName="MartCatelogPortV2",
			serviceName="MartCatelogServiceV2",
			endpointInterface="org.mnr.ws.SoapService",
			targetNamespace="http://www.mart.naveen.org")
@SOAPBinding(style=Style.RPC) 
public class S4_StandardWebServiceWriting implements SoapService {
	
	BIServiceImpl service;
	
	public S4_StandardWebServiceWriting() {
		service	= new	BIServiceImpl();
	}
	
	@Override
	public Set<String> getProductCategories(){
		return service.getProductCategories();
	}
	
	@Override
	public Set<String> getProducts(String category){
		return service.getProductList(category);
	}
	
	@Override
	public Collection<Product> getProductsV2(String category){
		return service.getProductsV2(category);
	}
	
	@Override
	public boolean addProduct(String category, String product){
		return service.addProduct(category, product);
	}

}
