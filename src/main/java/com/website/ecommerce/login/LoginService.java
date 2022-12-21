//package com.website.ecommerce.login;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.website.ecommerce.daoimpl.RegistrationRepository;
//import com.website.ecommerce.entity.RegistrationPojo;
//
//@Service
//public class LoginService { 
//
//	@Autowired
//	private RegistrationRepository registrationRepository;
//
//	public APIResponse login(LoginRequestDto registration) {
//		APIResponse apiResponse = new APIResponse();
//
//		RegistrationPojo user = registrationRepository.findByEmailIdIgnoreCaseAndUserPassword(registration.getEmailId(),
//				registration.getUserPassword());
//
//		if (user == null || !user.equals(user)) {
//			apiResponse.setData("User login failed");
//			return apiResponse;
//		} else {
//			apiResponse.setData("User Logged In");
//		}
//
//		return apiResponse;
//	}
//
//}
