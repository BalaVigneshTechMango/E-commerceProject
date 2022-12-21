package com.website.ecommerce.dto;

public class ShoppingCartDTO {

    private int productId;
    private int userId;
	private Integer stock;
    private String status;
    
    public int getUserId() {
  		return userId;
  	}
  	public void setUserId(int userId) {
  		this.userId = userId;
  	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	
}
