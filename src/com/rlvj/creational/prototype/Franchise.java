package com.rlvj.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Franchise implements Cloneable {

	private List<String> products;
	
	public Franchise() {
		products = new ArrayList<String>();
	}
	
	public Franchise(List<String> products) {
		this.products = products;
	}
	
	public void loadProducts() {
		//Access database and load products of that brand
		
		products.add("Product 1");
		products.add("Product 2");
		products.add("Product 3");
	}
	
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmpProduct = new ArrayList<String>();
		for (String p : products) {
			tmpProduct.add(p);
		}
		
		return new Franchise(tmpProduct);
	}

	public List<String> getProducts() {
		return products;
	}
	
}
