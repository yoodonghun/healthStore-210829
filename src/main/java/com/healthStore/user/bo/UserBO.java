package com.healthStore.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthStore.user.dao.UserDAO;
import com.healthStore.user.model.User;

@Service
public class UserBO {
	@Autowired
	private UserDAO userDAO;
	
   public User selectUserByUserId(String userId) {
	   
	   return userDAO.selectUserByUserId(userId);
   }
   
   public User getUserByUserIdAndPassword(String userId, String password) {
	   return userDAO.selectUserByLoginIdAndPassword(userId, password);
   }
   
   public int insertUser(String userId, String password, String name, String email) {
	   return userDAO.insertUser(userId, password, name, email); 
   }
   
}
