package com.website.ecommerce.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.website.ecommerce.dao.PurchaseDao;
import com.website.ecommerce.dto.ShoppingCartDTO;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.entity.PurchaseOrderPojo;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.responce.ResponcePojo;
import com.website.ecommerce.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;
	
	// this for add to cart
	public void addPurchaseOrder(ShoppingCartDTO shoppingCartDTO) {	
		purchaseDao.addPurchaseOrder(shoppingCartDTO);
	}

	// List of product in the cart
	public List<PurchaseOrderPojo> findAll(){
		return purchaseDao.findAll();
	}

	// Update the Cart quantity
	public void updateProduct(ShoppingCartDTO shoppingCartDTO,PurchaseOrderPojo purchaseOrderPojo){
	
		 purchaseDao.updateProduct(shoppingCartDTO,purchaseOrderPojo);
	}

	public ResponcePojo purchaseProductUpdate(PurchaseOrderPojo purchaseOrderPojo) {
	
		 return purchaseDao.purchaseProductUpdate(purchaseOrderPojo);
		 
	}

	public List<PurchaseOrderPojo> findByPurchased() {
		return purchaseDao.findByPurchased();
	}

}
