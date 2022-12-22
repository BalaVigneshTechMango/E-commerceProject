package com.website.ecommerce.service;

import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.request.RegisterRequestPojo;


public interface RegisterService {

	public void register(RegisterRequestPojo registerRequestPojo,RegistrationPojo registrationPojo);



}
