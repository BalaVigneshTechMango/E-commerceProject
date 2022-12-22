package com.website.ecommerce.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductDao;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.repository.ProductRepository;
import com.website.ecommerce.request.ProductRequestPojo;
import com.website.ecommerce.service.productService;

@Service
public class ProductServiceImpl implements productService {

	@Autowired
	private ProductDao productDao;

	public void addproduct( ProductRequestPojo productRequestPojo) {
		productDao.addproduct(productRequestPojo);
	}

	public void updateProduct(ProductRequestPojo productRequestPojo) {
		productDao.updateProduct(productRequestPojo);
	}

	public void deleteProduct(ProductRequestPojo productRequestPojo) {
		productDao.deleteProduct(productRequestPojo);
	}

	public List<ProductDetailsPojo> getProductdetails() {

		return productDao.getProductdetails();
	}

}
