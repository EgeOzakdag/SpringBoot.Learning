package com.SpringBoot.Learning.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Learning.Business.ICityService;
import com.SpringBoot.Learning.Entities.City;


@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;
	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/City")
	public List<City> getAll(){
		
		return this.cityService.getAll();
	}
	

}
