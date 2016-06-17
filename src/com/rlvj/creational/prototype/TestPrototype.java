package com.rlvj.creational.prototype;

import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Franchise original = new Franchise();
		original.loadProducts();

		Franchise first = (Franchise) original.clone();
		Franchise second = (Franchise) original.clone();
		
		List<String> lstFirst = first.getProducts();
		lstFirst.add("Product 4");
		
		List<String> lstSecond = second.getProducts();
		lstSecond.remove("Product 1");
		
		System.out.println("Original:" + original.getProducts());
		System.out.println("First:" + lstFirst);
		System.out.println("Second:" + lstSecond);
	}

}
