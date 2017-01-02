package org.mnr.ws.businessimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.mnr.model.Product;

public class BIServiceImpl {
	Set<String> bookSet	= new LinkedHashSet<String>();
	Set<String> musicSet	= new LinkedHashSet<String>();
	Set<String> movieSet	= new LinkedHashSet<String>();
	
	
	public BIServiceImpl(){
		bookSet.add("A Song of Ice and Fire");
		bookSet.add("Gone Girl");
		bookSet.add("The Alchemist");
		
		musicSet.add("Adele");
		musicSet.add("Enrique Iglesias");
		musicSet.add("Michael Jackson");
		
		movieSet.add("Interstelar");
		movieSet.add("The Dark Knight");
		movieSet.add("Blood Diamond");
		
	}
	
	public Set<String> getProductCategories(){
		Set<String> productList	= new HashSet<String>();
		productList.add("Books");
		productList.add("Music");
		productList.add("Movies");
		return productList;
	}
	
	public Set<String> getProductList(String category){
		
		category = category.toLowerCase();
		int caseValue = 0;
		
		if(category.equals("books"))
			caseValue = 1;
		else if (category.equals("music"))
			caseValue = 2;
		else if(category.equals("movies"))
			caseValue = 3;
		else
			caseValue =-1;
		
		switch(caseValue)
		{
			case 1: return bookSet;
			case 2: return musicSet;
			case 3: return movieSet;
		}
		return bookSet;
	}
	
	public boolean addProduct(String category, String product){
		
		category = category.toLowerCase();
		int caseValue = 0;
		
		if(category.equals("books"))
			caseValue = 1;
		else if (category.equals("music"))
			caseValue = 2;
		else if(category.equals("movies"))
			caseValue = 3;
		else
			caseValue =-1;
		System.out.println(caseValue+"|"+product);
		switch(caseValue)
		{
			case 1:  bookSet.add(product);
						   break;
			case 2:  musicSet.add(product);
						   break;
			case 3: movieSet.add(product);
						   break;
			default:
				 return false;
		}
		
		return true;
		
	}

	public Collection<Product> getProductsV2(String category) {
		List<Product> productSet = new ArrayList<Product>();
		productSet.add(new Product("P1","1",22.145));
		productSet.add(new Product("P2","2",202.145));
		productSet.add(new Product("P3","3",32.145));
		return productSet;
	}
	
	

}
