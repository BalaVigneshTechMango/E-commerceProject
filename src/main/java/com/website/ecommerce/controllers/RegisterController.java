package com.website.ecommerce.controllers;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.responce.ResponcePojo;
import com.website.ecommerce.service.RegisterService;

@RestController
@RequestMapping("/registration")
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/User")
	public ResponcePojo registerUser(@RequestBody RegistrationPojo registrationPojo,ResponcePojo responcePojo) {
		registrationPojo.setRoles("ROLE_USER");
        registerService.register(registrationPojo);
        responcePojo.setData(registrationPojo);
        responcePojo.setIsSuccess(true);
        responcePojo.setMessage("User Added");
        return responcePojo;
	}
	@PostMapping("/Seller")
	public ResponcePojo registerSeller(@RequestBody RegistrationPojo registrationPojo,ResponcePojo responcePojo) {
		registrationPojo.setRoles("ROLE_SELLER");
		registerService.register(registrationPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(registrationPojo);
		responcePojo.setMessage("seller added");
		return responcePojo;
	}
	@PostMapping("/delete")
	public ResponcePojo deleteUser(@RequestBody RegistrationPojo registrationPojo,ResponcePojo responcePojo) {
		registerService.delete(registrationPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(registrationPojo);
		responcePojo.setMessage("delected user");
		return responcePojo;
	}
	
	@PostMapping("/getRegister")
	public List<RegistrationPojo> getRegisterDetails() {
	   return registerService.getUserDetails();
         
	}
}
