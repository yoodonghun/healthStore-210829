package com.healthStore.product.bo;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.healthStore.common.FileManagerService;
import com.healthStore.product.dao.ProductDAO;
import com.healthStore.product.model.Product;

@Service
public class ProductBO {

	@Autowired
	private ProductDAO productDAO;
	
	
	
	@Autowired
	private FileManagerService fileManagerService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	public int insertProduct(String productName, int price, String imagePath) {
		return productDAO.insertProduct(productName, price, imagePath);
	}


	public List<Product> getProductList() {
		return productDAO.selectgetProductList();
	}
	
	public Product getDetail(Integer id) {
		return productDAO.selectDetail(id);
	}
	
	
	
	
	public int createPost(String loginId,String productName, Integer price, String part, MultipartFile file) {
		String imagePath = null;
		if(file != null) {
			try {
				imagePath = fileManagerService.saveFile(loginId, file); 
			} catch (IOException e) {
				logger.error("[파일업로드 에러] " + e.getMessage());
			}
		}
		
		
		return productDAO.insertNewProduct(productName, price, part, imagePath);
	}
	
	public Product getProduct(int id) {
		return productDAO.selectNewProduct(id);
	}
}
