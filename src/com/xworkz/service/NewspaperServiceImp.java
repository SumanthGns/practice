package com.xworkz.service;

import com.xworkz.dto.NewspaperDto;
import com.xworkz.dto.NewspaperRepository;

public class NewspaperServiceImp implements NewspaperService {

	private NewspaperRepository repo;

	public NewspaperServiceImp(NewspaperRepository repo) {
		this.repo = repo;

	}

	@Override
	public void validation(NewspaperDto dto1)  {
		if (dto1 != null) {
			repo.save(dto1);

		}

	}
}