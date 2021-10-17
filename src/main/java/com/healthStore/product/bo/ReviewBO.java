package com.healthStore.product.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthStore.product.dao.ReviewDAO;
import com.healthStore.product.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	public int insertReview(Integer productId, String writer, double grade, String review, ReviewDAO productDAO) {
		return reviewDAO.insertReview(productId, writer, grade, review);
	}
	
	public List<Review> getReviewList(Integer productId){
		return reviewDAO.selectReviewList(productId);
	}
			
	
	public Review getReview(Integer productId){
		return reviewDAO.selectReview(productId);
	}
	
	

	

	
}
