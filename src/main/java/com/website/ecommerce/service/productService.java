package com.website.ecommerce.service;

import java.util.List;

import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.request.ProductRequestPojo;

public interface productService {

	public void addproduct(ProductRequestPojo productRequestPojo);

	public void updateProduct(ProductRequestPojo productRequestPojo);

	public void deleteProduct(ProductRequestPojo productRequestPojo);

	public List<ProductDetailsPojo> getProductdetails();

}
