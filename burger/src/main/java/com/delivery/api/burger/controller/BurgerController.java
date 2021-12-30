package com.delivery.api.burger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.api.burger.entity.Burger;
import com.delivery.api.burger.service.BurgerService;


@RestController
public class BurgerController {
	
	@Autowired
	private BurgerService burgerService;
	
	@PostMapping("/v1/burgers")
	  public ResponseEntity<Burger> create(@Validated @RequestBody Burger burgerDTO)  {
		Burger burger = burgerService.create(burgerDTO);
	    return ResponseEntity.status(HttpStatus.CREATED).body(burger);
	  }
	
	@GetMapping("/v1/burgers/{burgerId}")
	  public ResponseEntity<Burger> getBurgerByBurgerId(@Validated @PathVariable Integer burgerId)  {
		Burger burger = burgerService.getBurgerByBurgerId(burgerId);
	    return ResponseEntity.status(HttpStatus.OK).body(burger);
	  }

}
