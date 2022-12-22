package com.website.ecommerce.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.RegistrationDao;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.repository.RegistrationRepository;
import com.website.ecommerce.request.RegisterRequestPojo;

@Service
public class RegistrationDaoImpl implements RegistrationDao{
	
	 @Autowired
	 private RegistrationRepository registrationRepository;
	
	 
	 public void register(RegisterRequestPojo registerRequestPojo,RegistrationPojo registrationPojo ) {
		
		registrationPojo.setUserName(registerRequestPojo.getUserName());
		registrationPojo.setEmailId(registerRequestPojo.getEmailId());
		registrationPojo.setUserPassword(registerRequestPojo.getUserPassword());
		registrationPojo.setPhoneNumber(registerRequestPojo.getPhoneNumber());
		registrationPojo.setGender(registerRequestPojo.getGender());
		registrationPojo.setAddress(registerRequestPojo.getAddress());
		registrationRepository.save(registrationPojo);
		
		}
	   	 

	
}
