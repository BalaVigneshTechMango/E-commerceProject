package com.website.ecommerce.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductDao;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.repository.ProductRepository;
import com.website.ecommerce.service.productService;

@Service
public class ProductServiceImpl implements productService {

	@Autowired
	private ProductDao productDao;

	public void addproduct(ProductDetailsPojo productDetailsPojo) {
		productDao.addproduct(productDetailsPojo);
	}

	public void updateProduct(ProductDetailsPojo productDetailsPojo) {
		productDao.updateProduct(productDetailsPojo);
	}

	public void deleteProduct(ProductDetailsPojo productDetailsPojo) {
		productDao.deleteProduct(productDetailsPojo);
	}

	public List<ProductDetailsPojo> getProductdetails() {

		return productDao.getProductdetails();
	}

}
