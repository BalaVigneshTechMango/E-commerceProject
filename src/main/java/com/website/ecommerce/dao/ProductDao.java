package com.website.ecommerce.dao;

import java.util.List;
import com.website.ecommerce.entity.ProductDetailsPojo;

public interface ProductDao {

	public void addproduct(ProductDetailsPojo productDetailsPojo);

	public void updateProduct(ProductDetailsPojo productDetailsPojo);

	public void deleteProduct(ProductDetailsPojo productDetailsPojo);

	public List<ProductDetailsPojo> getProductdetails();

	
	
}
