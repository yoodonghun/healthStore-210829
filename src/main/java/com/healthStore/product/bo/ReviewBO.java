package com.healthStore.product.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthStore.product.dao.ReviewDAO;
import com.healthStore.product.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	public int insertReview(Integer reviewId, String writer, double grade, String review, ReviewDAO productDAO) {
		return reviewDAO.insertReview(reviewId, writer, grade, review);
	}
			
	
	public Review getReview(Integer reviewId){
		return reviewDAO.selectReview(reviewId);
	}
	
	

	

	
}
