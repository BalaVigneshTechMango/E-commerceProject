package com.website.ecommerce.service;

import java.util.List;

import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.responce.ResponcePojo;

public interface RegisterService {

	public void register(RegistrationPojo registrationPojo);

	public void delete(RegistrationPojo registrationPojo);

	public List<RegistrationPojo> getUserDetails();

}
