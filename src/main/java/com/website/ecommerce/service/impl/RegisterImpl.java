package com.website.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.website.ecommerce.dao.RegistrationDao;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.request.RegisterRequestPojo;
import com.website.ecommerce.service.RegisterService;

@Service
public class RegisterImpl implements RegisterService {

	@Autowired(required=true)
	private RegistrationDao registrationDao;

	
	public void register(RegisterRequestPojo registerRequestPojo,RegistrationPojo registrationPojo) {
	 registrationDao.register(registerRequestPojo,registrationPojo);
		
	}

	

}
