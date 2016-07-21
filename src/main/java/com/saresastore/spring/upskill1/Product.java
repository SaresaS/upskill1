package com.saresastore.spring.upskill1;

public class Product {
	//product variables
	public long productid;
	public String name;
	public String decription;
	public String price;
	public long userid;
	
	//method that sysout message as test
	public void speak (){
		System.out.println("It works!!!");
	}
	
	//getters and setters
	public long getProductid() {
		return productid;
	}
	
	public void setProductid(long productid) {
		this.productid = productid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDecription() {
		return decription;
	}
	
	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public long getUserid() {
		return userid;
	}
	
	public void setUserid(long userid) {
		this.userid = userid;
	}
	
}
