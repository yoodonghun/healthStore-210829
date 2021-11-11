package com.healthStore.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.healthStore.product.model.Product;

@Repository
public interface ProductDAO {

	public int insertProduct(
			@Param("productName") String productName,
			@Param("price") int price,
			@Param("imagePath") String imagePath);
	
	public List<Product> selectgetProductList();
	
	public Product selectDetail(
			@Param("id") Integer id);
	
	public int insertNewProduct(
			
			@Param("productName") String productName,
			@Param("price") Integer price,
			@Param("part") String part,
			@Param("imagePath") String imagePath);

	public Product selectNewProduct(
			@Param("id") int id);
}
