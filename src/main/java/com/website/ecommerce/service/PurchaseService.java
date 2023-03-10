package com.website.ecommerce.service;
import java.util.List;
import com.website.ecommerce.dto.ShoppingCartDTO;
import com.website.ecommerce.entity.ProductDetailsPojo;
import com.website.ecommerce.entity.PurchaseOrderPojo;
import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.request.PurchaseRequestPojo;
import com.website.ecommerce.responce.ResponcePojo;

public interface PurchaseService {

	public void addPurchaseOrder(ShoppingCartDTO shoppingCartDTO);

	public List<PurchaseOrderPojo> findAll();

	public void updateProduct(PurchaseRequestPojo purchaseRequestPojo);

	public List<PurchaseOrderPojo> findByPurchased();

	public void purchaseProductUpdate(PurchaseRequestPojo purchaseRequestPojo );

}