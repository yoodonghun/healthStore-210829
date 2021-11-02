package com.healthStore.post.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDAO {

	public int insertPost(
			@Param("productId") int productId,
			@Param("productName") String productName,
			@Param("price") Integer price,
			@Param("imagePath") String imagePath);

	
}
