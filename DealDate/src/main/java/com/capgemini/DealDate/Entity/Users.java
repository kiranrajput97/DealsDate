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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="Users")
public class Users {
	@Id

	@Column(name="userId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(sequenceName = "user_sequence", allocationSize = 100, name = "user_seq")

		private Integer userId;

	   @Column(name="userName")	
		private String userName;
		
	   @Column(name="Password")
		private String Password;
		
	   @Column(name="Address")
		private String Address;
	   
	   @Column(name="city")
		private String city;
	   
		@Column(name="zipCode")
		private String zipCode;
		
		@Column(name="country")
		private String country;
		
	   @Column(name="userRole")
		private String userRole;
		
	   @Column(name="loginToken")
		private String loginToken;
		
	   @Column(name="phoneNumber")
		private Long phoneNumber;
	   
	   @OneToMany(fetch=FetchType.EAGER, targetEntity = Order.class, cascade = CascadeType.ALL)
		//@Fetch(value = FetchMode.SUBSELECT)
		@JoinColumn(name = "userId", referencedColumnName = "userId")
		private List<Order> Order;




	public Integer getUserId() {
		return userId;
	}



	

	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getPassword() {
		return Password;
	}





	public void setPassword(String password) {
		Password = password;
	}





	public String getAddress() {
		return Address;
	}





	public void setAddress(String address) {
		Address = address;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public String getZipCode() {
		return zipCode;
	}





	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}





	public String getCountry() {
		return country;
	}





	public void setCountry(String country) {
		this.country = country;
	}





	public String getUserRole() {
		return userRole;
	}





	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}





	public String getLoginToken() {
		return loginToken;
	}





	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}





	public Long getPhoneNumber() {
		return phoneNumber;
	}





	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}





	public List<Order> getOrder() {
		return Order;
	}





	public void setOrder(List<Order> order) {
		Order = order;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}









	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", Password=" + Password + ", Address=" + Address
				+ ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + ", userRole=" + userRole
				+ ", loginToken=" + loginToken + ", phoneNumber=" + phoneNumber + ", Order=" + Order + "]";
	}





	public Users(Integer userId, String userName, String password, String address, String city, String zipCode,
			String country, String userRole, String loginToken, Long phoneNumber,
			List<com.capgemini.DealDate.Entity.Order> order) {
		super();
		this.userId = userId;
		this.userName = userName;
		Password = password;
		Address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
		this.userRole = userRole;
		this.loginToken = loginToken;
		this.phoneNumber = phoneNumber;
		Order = order;
		
	}





	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	   
}
