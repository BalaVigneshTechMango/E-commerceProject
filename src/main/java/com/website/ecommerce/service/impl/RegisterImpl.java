package com.website.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.RegistrationDao;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.repository.RegistrationRepository;
import com.website.ecommerce.responce.ResponcePojo;
import com.website.ecommerce.service.RegisterService;

@Service
public class RegisterImpl implements RegisterService {

	@Autowired(required=true)
	private RegistrationDao registrationDao;

	
	public void register(RegistrationPojo registrationPojo) {
	 registrationDao.register(registrationPojo);
		
	}

	public void delete(RegistrationPojo registrationPojo) {
		registrationDao.delete(registrationPojo);
	}

	public List<RegistrationPojo> getUserDetails() {

		return registrationDao.findAll();
	}

	

}
