package com.website.ecommerce.dao;

import java.util.List;

import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.responce.ResponcePojo;

public interface RegistrationDao {
	
	public void register(RegistrationPojo registrationPojo);

	public void delete(RegistrationPojo registrationPojo);

	public List<RegistrationPojo> findAll();
	
}
