package com.website.ecommerce.dao;


import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.request.RegisterRequestPojo;

public interface RegistrationDao {
	
	public void register(RegisterRequestPojo registerRequestPojo,RegistrationPojo registrationPojo);

}
