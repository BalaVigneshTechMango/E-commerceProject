package com.website.ecommerce.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchaseorder")
public class PurchaseOrderPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseorderid;
	
	 @Column(name = "stock")
	 private Integer stock;

	 @Column(name = "amount")
	 private int amount;

	 @Column(name = "status")
	 private String status;

	 @Column(name = "date")
	 private Date date;
	 
	 @ManyToOne(fetch = FetchType.EAGER,targetEntity = RegistrationPojo.class)
	 @JoinColumn(name = "reg_id")
	 private RegistrationPojo registrationPojo;
		
	 @ManyToOne(fetch = FetchType.LAZY,targetEntity = ProductDetailsPojo.class)
	 @JoinColumn(name = "pro_id")
	 private ProductDetailsPojo productDetailsPojo;
	 
	 
	 public RegistrationPojo getRegistrationPojo() {
		return registrationPojo;
	}

	public void setRegistrationPojo(RegistrationPojo registrationPojo) {
		this.registrationPojo = registrationPojo;
	}

	public ProductDetailsPojo getProductDetailsPojo() {
		return productDetailsPojo;
	}

	public void setProductDetailsPojo(ProductDetailsPojo productDetailsPojo) {
		this.productDetailsPojo = productDetailsPojo;
	}


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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	 	 
	
}
