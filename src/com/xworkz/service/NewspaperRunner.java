package com.xworkz.service;

import com.xworkz.dto.*;

public class NewspaperRunner {

	public static void main(String[] args) throws IllegalAccessException {
		NewspaperRepository n=new NewspaperRepositoryImp(); 
		NewspaperServiceImp a=new NewspaperServiceImp(n);
		NewspaperDto y=new NewspaperDto(5, 100, "krish");
		NewspaperDto y1=new NewspaperDto(6, 10, "krish");
		a.validation(y);
		a.validation(y1);
		

	}

}
