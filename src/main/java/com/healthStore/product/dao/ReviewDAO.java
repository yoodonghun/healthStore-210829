package com.healthStore.product.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.healthStore.product.model.Review;

@Repository
public interface ReviewDAO {
   
	public int insertReview(
			@Param("reviewId") Integer reviewId
			,@Param("writer") String writer
			,@Param("grade") double grade
			,@Param("review") String review);

	public Review selectReview(@Param("reviewId") Integer reviewId);
}
