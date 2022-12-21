//package com.website.ecommerce.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import com.website.ecommerce.login.APIResponse;
//import com.website.ecommerce.login.LoginRequestDto;
//import com.website.ecommerce.login.LoginService;
//
//@RestController
//@RequestMapping("/login")
//public class LoginController {
//
//	@Autowired
//	private LoginService loginService;
//
//	@PostMapping("/page")
//	public ResponseEntity<APIResponse> login(@RequestBody LoginRequestDto registration) {
//		APIResponse apiResponse = loginService.login(registration);
//		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
//	}
//
//}
