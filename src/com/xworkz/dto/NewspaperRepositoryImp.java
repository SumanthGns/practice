package com.xworkz.dto;

import java.util.Objects;

public class NewspaperRepositoryImp implements NewspaperRepository {
	
	NewspaperDto[] n1=new NewspaperDto[10];
	int position;
	
	@Override
	public void save(NewspaperDto n)  {
		for(NewspaperDto s:n1) {
		if(Objects.nonNull(s)&&n.getPublisher().equals(s.publisher)) {
			throw new RuntimeException("This Name Is Already Exist");
//			System.out.println("This Name Is Already Exist");
			}
		}
		this.n1[position]=n;
		System.out.println("newspaper " +n + "postion" +this.position);
		position++;		
	}

}
