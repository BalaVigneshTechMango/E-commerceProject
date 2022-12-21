package com.website.ecommerce.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductDao;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.repository.ProductRepository;

@Service
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void addproduct(ProductDetailsPojo productDetailsPojo) {
		productRepository.save(productDetailsPojo);
	}
	
	public void updateProduct(ProductDetailsPojo productDetailsPojo) {
		productDetailsPojo.getProductId();
		productRepository.save(productDetailsPojo);
		
	}

	public void deleteProduct(ProductDetailsPojo productDetailsPojo) {
		productRepository.delete(productDetailsPojo);
	}

	public List<ProductDetailsPojo> getProductdetails() {

		return (List<ProductDetailsPojo>) productRepository.findAll();
	}
	
}
