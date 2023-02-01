package com.SpringBoot.Learning.DataAccess;

import java.util.List;

import com.SpringBoot.Learning.Entities.City;


public interface ICityDal {

	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	
	
	
	
	
	
}
