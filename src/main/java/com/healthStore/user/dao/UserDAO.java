package com.healthStore.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.healthStore.user.model.User;

@Repository
public interface UserDAO {

	public User selectUserByUserId(String userId);
	
	 public User selectUserByLoginIdAndPassword(
			   @Param("userId") String loginId,
			   @Param("password") String password);
	   
	   public int insertUser(
			  @Param("userId") String loginId,
			  @Param("password") String password,
			  @Param("name") String name,
			  @Param("email") String email);
}
