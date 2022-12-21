package com.website.ecommerce.dao.impl;
import java.util.Date;
import java.util.List;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.website.ecommerce.dao.PurchaseDao;
import com.website.ecommerce.dto.ShoppingCartDTO;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.entity.PurchaseOrderPojo;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.repository.ProductRepository;
import com.website.ecommerce.repository.PurchaseRepository;
import com.website.ecommerce.repository.RegistrationRepository;
import com.website.ecommerce.responce.ResponcePojo;
@Service
public class PurchaseDaoImpl implements PurchaseDao{
	@Autowired
	private PurchaseRepository purchaseRepository;
	@Autowired
	private RegistrationRepository registrationRepository;
	@Autowired
	private ProductRepository productRepository;

	 public void addPurchaseOrder(ShoppingCartDTO shoppingCartDTO) {
		PurchaseOrderPojo purchaseOrderPojo=new PurchaseOrderPojo();
		ProductDetailsPojo productDetailsPojo=productRepository.findById(shoppingCartDTO.getProductId());
		RegistrationPojo registrationPojo = registrationRepository.findById(shoppingCartDTO.getUserId());
		purchaseOrderPojo.setProductDetailsPojo(productDetailsPojo);
		purchaseOrderPojo.setRegistrationPojo(registrationPojo);
		purchaseOrderPojo.setDate(new Date());
		purchaseOrderPojo.setStock(shoppingCartDTO.getStock());
		
		 if(productDetailsPojo.getQuantity() >= shoppingCartDTO.getStock() && shoppingCartDTO.getStock()>0 && productDetailsPojo.getQuantity()>0){
			purchaseOrderPojo.setAmount(productDetailsPojo.getProductPrice() * shoppingCartDTO.getStock());
			purchaseOrderPojo.setStatus("ADDTOCART");
		    purchaseRepository.save(purchaseOrderPojo);
		     
		}else {
                 purchaseOrderPojo.getProductDetailsPojo().getQuantity();
		}
		 
	}
	  //List of product in the cart
	 public List<PurchaseOrderPojo> findAll() {
		return purchaseRepository.findAll();
	}
	// Update the Cart quantity
	public void updateProduct(ShoppingCartDTO shoppingCartDTO,PurchaseOrderPojo purchaseOrderPojo) {
//		PurchaseOrderPojo updateItem = (PurchaseOrderPojo) purchaseRepository.findByPro_Id(purchaseOrderPojo.getProductDetailsPojo().getProductId());
//		List<PurchaseOrderPojo> update=purchaseRepository.findByReg_Id(purchaseOrderPojo.getRegistrationPojo().getUserId());
//		updateItem.setStock(shoppingCartDTO.getStock());
//		updateItem.setAmount(updateItem.getProductDetailsPojo().getProductPrice() * ((ShoppingCartDTO) update).getStock());
//		return purchaseRepository.save(updateItem);
	}

	public ResponcePojo purchaseProductUpdate( PurchaseOrderPojo purchaseOrderPojo) {
		ResponcePojo responcePojo=new ResponcePojo();
		ProductDetailsPojo productDetailsPojo =new ProductDetailsPojo();
		purchaseOrderPojo =purchaseRepository.findById(purchaseOrderPojo.getPurchaseorderid());
		
		if (purchaseOrderPojo.getStatus().equals("ADDTOCART") && purchaseOrderPojo.getProductDetailsPojo().getQuantity() >=purchaseOrderPojo.getStock()) {
		     purchaseOrderPojo.setStatus("PURCHASED");
			 purchaseRepository.save(purchaseOrderPojo);
			 responcePojo.setData(productDetailsPojo);
			 return responcePojo;
			
		}
		return responcePojo;
		
	}

	public List<PurchaseOrderPojo> findByPurchased() {
		return purchaseRepository.findByStatus("PURCHASED");
	}
	
	
}
