package org.mnr.ws;

import java.util.HashSet;
import java.util.Set;

import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
	Set<String> productList	= new HashSet<String>();
	public ProductCatalog() {
		productList.add("Books");
		productList.add("Movies");
		productList.add("Shows");
	}
	
	public Set<String> getProductList(){
		
		return productList;
		
	}

}
