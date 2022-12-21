package com.website.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.entity.PurchaseOrderPojo;
@Repository
public interface ProductRepository extends JpaRepository<ProductDetailsPojo, Integer>{

	 ProductDetailsPojo findById(int productId);

}
