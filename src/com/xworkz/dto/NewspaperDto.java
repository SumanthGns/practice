package com.xworkz.dto;

import java.io.Serializable;

public class NewspaperDto implements Serializable {
	
	int price;
	double cost;
	String publisher;
	
	public NewspaperDto () {
		
		
	}
	public NewspaperDto (int price,double cost,String publisher ) {
		this.price=price;
		this.cost=cost;
		this.publisher=publisher;
		
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString() {
		return "NewspaperDto[price="+price+", cost= "+cost+" ,publisher= "+publisher+"]";
	}
	
	

}
