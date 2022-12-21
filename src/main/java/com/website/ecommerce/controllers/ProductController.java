package com.website.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.responce.ResponcePojo;
import com.website.ecommerce.service.productService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private productService productService;
	
	@PostMapping("/add")
	public ResponcePojo addProduct(@RequestBody ProductDetailsPojo productDetailsPojo,ResponcePojo responcePojo) {
		productService.addproduct(productDetailsPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(productDetailsPojo);
		responcePojo.setMessage("Added the Product");
        return responcePojo;
	}
	
	@PostMapping("/delete")
	public ResponcePojo deleteProduct(@RequestBody ProductDetailsPojo productDetailsPojo,ResponcePojo responcePojo) {
		productService.deleteProduct(productDetailsPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(productDetailsPojo);
		responcePojo.setMessage("deleted the Product");
        	return	responcePojo;
	}
	
	@PostMapping("/update")
	public ResponcePojo updateProduct(@RequestBody ProductDetailsPojo productDetailsPojo,ResponcePojo responcePojo) {
		productService.updateProduct(productDetailsPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(productDetailsPojo);
		responcePojo.setMessage("Updated the Product");
		return responcePojo;
	}
	
	@PostMapping("/get")
	public List<ProductDetailsPojo>getProductdetails(){
		return productService.getProductdetails();
	}	
	
}
