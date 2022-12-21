package com.website.ecommerce.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.website.ecommerce.dto.ShoppingCartDTO;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.entity.PurchaseOrderPojo;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.responce.ResponcePojo;
import com.website.ecommerce.service.PurchaseService;

@RestController
@RequestMapping("/shoppingCart")
public class PurchaseController {
	@Autowired
	private PurchaseService purchaseService;

	 @PostMapping("/cart")
	 public ResponcePojo addProductItem(@RequestBody ShoppingCartDTO shoppingCartDTO,ResponcePojo responcePojo) {
	 purchaseService.addPurchaseOrder(shoppingCartDTO);
	 responcePojo.setData(shoppingCartDTO);
	 responcePojo.setIsSuccess(true);
	 responcePojo.setMessage("Add to cart");
	 return	responcePojo;
	}
	@PostMapping("/get")
	public List<PurchaseOrderPojo> getAll() {
		return purchaseService.findAll();
	}

	@PostMapping("/put")
	public ResponcePojo updateProductItem(@RequestBody ShoppingCartDTO shoppingCartDTO,PurchaseOrderPojo purchaseOrderPojo,ResponcePojo responcePojo) {
		 purchaseService.updateProduct(shoppingCartDTO,purchaseOrderPojo); 
		 return responcePojo;
	}
	@PostMapping("/purchasedProducts")
	public void purchasedProducts() {
		purchaseService.findByPurchased();
	}
	
	@PutMapping("/purchaseProduct")
	public ResponcePojo purchaseProductUpdate(@RequestBody PurchaseOrderPojo purchaseOrderPojo,ResponcePojo responcePojo ) {

		purchaseService.purchaseProductUpdate(purchaseOrderPojo);
		responcePojo.setIsSuccess(true);
		responcePojo.setData(purchaseOrderPojo);
		return responcePojo;
	

	}

}
