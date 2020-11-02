package com.capgemini.DealDate.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Cart_Item")
public class CartItem {

	@Id
	@Column(name="cartId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
	@SequenceGenerator(sequenceName = "cart_sequence", allocationSize = 1000, name = "cart_seq")
	private Integer cartId;
	
	@Column(name="cartItemPrice")
	private Integer cartItemPrice;
	
	@Column(name="quantity")
	private Integer quantity;
	
	   @OneToMany(fetch=FetchType.EAGER, targetEntity = Order.class, cascade = CascadeType.ALL)
		//@Fetch(value = FetchMode.SUBSELECT)
		@JoinColumn(name = "cartId", referencedColumnName = "cartId")
		private List<Order> Order;
	   
	   
//	   
//	   @OneToMany(fetch=FetchType.EAGER, targetEntity = Product.class, cascade = CascadeType.ALL)
//		//@Fetch(value = FetchMode.SUBSELECT)
//		@JoinColumn(name = "cartId", referencedColumnName = "cartId")
//		private List<Product> product;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getCartItemPrice() {
		return cartItemPrice;
	}

	public void setCartItemPrice(Integer cartItemPrice) {
		this.cartItemPrice = cartItemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public List<Order> getOrder() {
		return Order;
	}

	public void setOrder(List<Order> order) {
		Order = order;
	}
	
	
//
//	public List<Product> getProduct() {
//		return product;
//	}
//
//	public void setProduct(List<Product> product) {
//		this.product = product;
//	}

	
	
	
	

	public CartItem(Integer cartId, Integer cartItemPrice, Integer quantity,
			List<com.capgemini.DealDate.Entity.Order> order) {
		super();
		this.cartId = cartId;
		this.cartItemPrice = cartItemPrice;
		this.quantity = quantity;
		Order = order;
		
	}

	

	@Override
	public String toString() {
		return "CartItem [cartId=" + cartId + ", cartItemPrice=" + cartItemPrice + ", quantity=" + quantity + ", Order="
				+ Order + "]";
	}

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	   
}
