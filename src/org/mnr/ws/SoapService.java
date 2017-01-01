package org.mnr.ws;

import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.mnr.model.Product;
@WebService(
		 name="MartCatelogV2",
		 portName="MartCatelogPortV2",
		 serviceName="MartCatelogServiceV2",
		 targetNamespace="http://www.mart.naveen.org"
				)
public interface SoapService {

	@WebMethod
	public abstract Set<String> getProductCategories();
	
	@WebMethod
	public abstract Set<String> getProducts(String category);
	
	@WebMethod
	@WebResult(name="ProductDetails")
	public abstract Set<Product> getProductsV2(String category);
	
	@WebMethod
	public abstract boolean addProduct(String category, String product);

}