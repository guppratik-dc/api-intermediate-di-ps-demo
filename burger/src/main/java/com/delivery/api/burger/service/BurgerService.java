package com.delivery.api.burger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.api.burger.entity.Burger;
import com.delivery.api.burger.repository.BurgerRepository;

@Service
public class BurgerService {
	
	@Autowired
	private BurgerRepository repository;
	

	public Burger create(Burger burgerDTO) {
		// TODO Auto-generated method stub
		
		Burger burger = repository.save(burgerDTO);
		
		return burger;
	}


	public Burger getBurgerByBurgerId(Integer burgerId) {
		// TODO Auto-generated method stub
		
		Burger burger = repository.findByBurgerId(burgerId);
		return burger;
	}

}
