package com.website.ecommerce.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductDao;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.repository.ProductRepository;
import com.website.ecommerce.request.ProductRequestPojo;

@Service
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void addproduct(ProductRequestPojo productRequestPojo) {
		ProductDetailsPojo productDetailsPojo=new ProductDetailsPojo();
		productDetailsPojo.setProductName(productRequestPojo.getProductName());
		productDetailsPojo.setProductPrice(productRequestPojo.getProductPrice());
		productDetailsPojo.setQuantity(productRequestPojo.getQuantity());
		productRepository.save(productDetailsPojo);
	}
	
	public void updateProduct( ProductRequestPojo productRequestPojo) {
		ProductDetailsPojo productDetailsPojo=new ProductDetailsPojo();
		ProductDetailsPojo updateProduct=productRepository.findById(productRequestPojo.getProductId());
		updateProduct.setProductName(productRequestPojo.getProductName());
		updateProduct.setQuantity(productRequestPojo.getQuantity());
		updateProduct.setProductPrice(productDetailsPojo.getProductPrice());
		productRepository.save(productDetailsPojo);
		
	}

	public void deleteProduct(ProductRequestPojo productRequestPojo) {
		
		ProductDetailsPojo productDetailsPojo=productRepository.findById(productRequestPojo.getProductId());
		productRepository.delete(productDetailsPojo);
	}

	public List<ProductDetailsPojo> getProductdetails() {

		return (List<ProductDetailsPojo>) productRepository.findAll();
	}
	
}
