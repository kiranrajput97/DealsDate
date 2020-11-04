package com.cg.dealsdateonlinegiftshopping.dao;

import java.util.List;

import com.cg.dealsdateonlinegiftshopping.entity.User;



public interface UserDaoInterface {
	
	public User signUp(User user);
	
	Boolean delete(int id);

	 boolean findId(int id);

	User findById(int id);

	boolean findUserByEmail(String email);

	User getUserByEmail(String email);

	public List<User> retrieveData();

	boolean updateLoginStatus(User user, int id);

	boolean updateFullName(User user, int id);

	boolean updatePassword(User user, int id);

	boolean updatePhoneNumber(User user, int id);

	boolean updateUserToAdmin(User user, int id);

	boolean updateLogoutStatus(User user, String email);


}
