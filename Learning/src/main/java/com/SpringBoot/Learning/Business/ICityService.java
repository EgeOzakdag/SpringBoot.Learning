package com.SpringBoot.Learning.Business;

import java.util.List;

import com.SpringBoot.Learning.Entities.City;



public interface ICityService {

	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	
	
	
}
