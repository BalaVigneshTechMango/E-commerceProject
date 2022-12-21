package com.website.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.website.ecommerce.entity.PurchaseOrderPojo;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseOrderPojo,Integer>{
    	PurchaseOrderPojo findById(int purchaseorderid);
	    List<PurchaseOrderPojo> findByStatus(String status);
	    PurchaseOrderPojo findByRegistrationPojo(int registrationPojo);
		PurchaseOrderPojo findByProductDetailsPojo(int productId);
    	
}
