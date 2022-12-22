package com.website.ecommerce.dao;

import java.util.List;
import com.website.ecommerce.dto.ShoppingCartDTO;
import com.website.ecommerce.entity.PurchaseOrderPojo;
import com.website.ecommerce.request.PurchaseRequestPojo;

public interface PurchaseDao {
	
	public void addPurchaseOrder(ShoppingCartDTO shoppingCartDTO);

	public List<PurchaseOrderPojo> findAll();

	public void updateProduct(PurchaseRequestPojo purchaseRequestPojo);

	public List<PurchaseOrderPojo> findByPurchased();

	public void purchaseProductUpdate(PurchaseRequestPojo purchaseRequestPojo);

}
