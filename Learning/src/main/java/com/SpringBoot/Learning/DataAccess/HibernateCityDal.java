package com.SpringBoot.Learning.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Learning.Entities.City;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class HibernateCityDal implements ICityDal {
	

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		Session	session= entityManager.unwrap(Session.class);
		List<City> cities= session.createQuery("FROM City",City.class).getResultList();
		return cities;
		
		
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		Session	session= entityManager.unwrap(Session.class);
		session.persist(city);
		
		
		
	}

	@Override
	@Transactional
	public void update(City city) {

		Session	session= entityManager.unwrap(Session.class);
		session.persist(city);
	}

	@Override
	public void delete(City city) {
		//session.delete(city);
		
	}

}
