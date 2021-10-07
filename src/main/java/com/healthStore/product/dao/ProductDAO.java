package com.healthStore.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.healthStore.product.model.Product;

@Repository
public interface ProductDAO {

	public int insertProduct(
			@Param("productId") Integer productId,
			@Param("productName") String productName,
			@Param("price") Integer price,
			@Param("imagePath") String imagePath);
	
	public List<Product> selectProductDetail(
//			@Param("productName") String productName,
//			@Param("price") int price,
//			@Param("imagePath") String imagePath);
			);
	
	public Product selectDetail(
			@Param("productId") int productId);
	
	
}
