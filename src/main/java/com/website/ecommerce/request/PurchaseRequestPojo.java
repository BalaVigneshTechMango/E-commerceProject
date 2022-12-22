package com.website.ecommerce.request;

public class PurchaseRequestPojo {

	private int purchaseorderid;
	private Integer stock;
	private int amount;
	private String status;
	
	public int getPurchaseorderid() {
		return purchaseorderid;
	}
	public void setPurchaseorderid(int purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
    
	
	
}
