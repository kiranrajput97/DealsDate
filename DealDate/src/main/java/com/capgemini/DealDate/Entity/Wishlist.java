package com.capgemini.DealDate.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Wish_list")
public class Wishlist {
	@Id
	@Column(name="wishlistId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wishlist_seq")
	@SequenceGenerator(sequenceName = "wishlist_sequence", allocationSize = 1, name = "wishlist_seq")
	private Integer wishlistId;
	
//	@Column(name="productList")
//	private List<Product> productList;

	public Integer getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}

//	public List<Product> getProductList() {
//		return productList;
//	}
//
//	public void setProductList(List<Product> productList) {
//		this.productList = productList;
//	}

	@Override
	public String toString() {
		return "Wishlist [wishlistId=" + wishlistId + "]";
	}

	public Wishlist(Integer wishlistId, List<Product> productList) {
		super();
		this.wishlistId = wishlistId;
//		this.productList = productList;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
