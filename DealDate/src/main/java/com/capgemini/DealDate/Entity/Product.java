package com.capgemini.DealDate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ProductInfo")
public class Product {

	@Id
	@Column(name="productId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
	@SequenceGenerator(sequenceName = "product_sequence", allocationSize = 10, name = "product_seq")
	private Integer productId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productDescription")
	private String productDescription;
	
	@Column(name="productPrice")
	private Integer productPrice;
	
	@Column(name="productCategory")
	private String productCategory;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productCategory=" + productCategory + "]";
	}

	public Product(Integer productId, String productName, String productDescription, Integer productPrice,
			String productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
