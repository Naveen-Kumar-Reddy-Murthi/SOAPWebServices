package org.mnr.ws;

import java.util.Set;

import javax.jws.WebResult;
import javax.jws.WebService;

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
			endpointInterface="org.mnr.ws.SoapService")

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
//	@WebResult(name="Product")
	public Set<Product> getProductsV2(String category){
		return service.getProductsV2(category);
	}
	
	@Override
	public boolean addProduct(String category, String product){
		return service.addProduct(category, product);
	}

}
