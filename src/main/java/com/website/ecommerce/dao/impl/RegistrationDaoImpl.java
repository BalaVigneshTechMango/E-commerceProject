package com.website.ecommerce.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.RegistrationDao;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.repository.RegistrationRepository;
import com.website.ecommerce.responce.ResponcePojo;

@Service
public class RegistrationDaoImpl implements RegistrationDao{
	
	@Autowired(required=true)
	private RegistrationRepository registrationRepository;
    
	@Override
	public void register(RegistrationPojo registrationPojo) {
	   
	 
		  registrationRepository.save(registrationPojo); 
		 
		}
					
	   	 
	
	@Override
	public void delete(RegistrationPojo registrationPojo) {
//		registrationPojo.getUserId();
		registrationRepository.delete(registrationPojo);
	}
	
	@Override
	public List<RegistrationPojo> findAll() {

	 return	registrationRepository.findAll();	
		
	}

	
}
