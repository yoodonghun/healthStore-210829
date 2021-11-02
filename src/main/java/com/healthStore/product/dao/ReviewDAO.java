package com.healthStore.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.healthStore.product.model.Review;

@Repository
public interface ReviewDAO {
   
	public int insertReview(
			@Param("productId") Integer productId
			,@Param("writer") String writer
			,@Param("grade") double grade
			,@Param("review") String review);
	
	public List<Review> selectReviewList();

	public Review selectReview(@Param("productId") Integer productId);
}
