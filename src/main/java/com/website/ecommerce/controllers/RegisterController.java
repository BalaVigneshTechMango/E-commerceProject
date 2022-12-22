package com.website.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.request.RegisterRequestPojo;
import com.website.ecommerce.responce.ResponcePojo;
import com.website.ecommerce.service.RegisterService;

@RestController
@RequestMapping("/registration")
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/User")
	public ResponcePojo registerUser(@RequestBody RegisterRequestPojo registerRequestPojo,RegistrationPojo registrationPojo ,ResponcePojo responcePojo) {
		registrationPojo.setRoles("USER");
        registerService.register(registerRequestPojo,registrationPojo);
        responcePojo.setData(registrationPojo);
        responcePojo.setIsSuccess(true);
        responcePojo.setMessage("User Added");
        return responcePojo;
	}
	@PostMapping("/Seller")
	public ResponcePojo registerSeller(@RequestBody RegisterRequestPojo registerRequestPojo,RegistrationPojo registrationPojo,ResponcePojo responcePojo) {
		registrationPojo.setRoles("SELLER");
		registerService.register(registerRequestPojo,registrationPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(registerRequestPojo);
		responcePojo.setMessage("seller added");
		return responcePojo;
	}

}
