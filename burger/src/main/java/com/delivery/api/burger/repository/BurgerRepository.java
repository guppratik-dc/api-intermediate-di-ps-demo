package com.delivery.api.burger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.api.burger.entity.Burger;

public interface BurgerRepository extends JpaRepository<Burger, Integer>{ 
	
	Burger findByBurgerId(Integer burgerId);

}
