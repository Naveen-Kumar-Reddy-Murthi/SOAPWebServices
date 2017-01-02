package org.mnr.ws;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.mnr.model.Product;
import org.mnr.ws.businessimpl.BIServiceImpl;
/**
 * 
 * This annotation tells the app server that this class is a soap web service. App server 
   generates the wsdl and testing ui automatically. Here glassfish app server is used.
   Using the following annotation's properties, we can change the wsdl configuartion
 *
 */


@WebService(
 name="MartCatelog",//normally service is picked from class name, That can be changed using this property, used for portType and bindingName
 portName="MartCatelogPort",//changes the portName in the wsdl
 serviceName="MartCatelogService",//changes the wsdl name, if not specified it will be same as class name
 targetNamespace="http://www.mart.naveen.org"//changes the targetNameSpace in the wsdl. If not specified, package name reverse order is considered
		)

public class S2_ProductCatalog {
	
	BIServiceImpl service;
	
	public S2_ProductCatalog() {
		service	= new	BIServiceImpl();
	}
	@WebMethod(operationName="FetchProductTypes")
	//Specifies the app server that this is a web service method
	//By default, all the public methods in a class annotated with @WebService are webservice methods
	public Set<String> getProductCategories(){
//		Set<String> productList	= new HashSet<String>();
//		productList.add("Books");
//		productList.add("Movies");
//		productList.add("Shows");
//		return productList;
		return service.getProductCategories();
	}
	
	@WebMethod/*(exclude=true)*///exclude property makes the webmethod unexposed i.e., makes it private
	public Set<String> getProducts(String category){
		return service.getProductList(category);
	}
	
	public Collection<Product> getProductsV2(String category){
		return service.getProductsV2(category);
	}
	@WebMethod/*(exclude=true)*/
	public boolean addProduct(String category, String product){
		return service.addProduct(category, product);
	}

}
