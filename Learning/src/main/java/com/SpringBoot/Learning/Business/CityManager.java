package com.SpringBoot.Learning.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Learning.DataAccess.ICityDal;
import com.SpringBoot.Learning.Entities.City;

import jakarta.transaction.Transactional;
@Service
public class CityManager implements ICityService{
	
	private ICityDal cityDal;

	@Autowired
	public CityManager(ICityDal cityDal) {
	this.cityDal = cityDal;
}



	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return cityDal.getAll();
	}



	@Override
	public void add(City city) {
	 this.cityDal.add(city);
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
