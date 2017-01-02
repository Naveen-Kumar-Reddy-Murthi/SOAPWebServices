package org.mnr.ws;

import java.util.Collection;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.mnr.model.Product;
@WebService(
		 name="MartCatelogV2",
		 targetNamespace="http://www.mart.naveen.org"
				)
public interface SoapService {

	@WebMethod
	public abstract Set<String> getProductCategories();
	
	@WebMethod  
	public abstract Set<String> getProducts(String category);
	
	@WebMethod
//	@WebResult(name="Product") 
	public abstract Collection<Product> getProductsV2(String category);
	
	@WebMethod
	public abstract boolean addProduct(String category, String product);

}