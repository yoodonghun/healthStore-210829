package com.healthStore.post.bo;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.healthStore.common.FileManagerService;
import com.healthStore.post.dao.PostDAO;

@Service
public class PostBO {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PostDAO postDAO;
	
	@Autowired
	private FileManagerService fileManagerService;
	
	public int createPost(int productId, String loginId, String productName, Integer price, MultipartFile file) {
		String imagePath = null;
		if(file != null) {
			try {
				imagePath = fileManagerService.saveFile(productId, file); 
			} catch (IOException e) {
				logger.error("[파일업로드 에러] " + e.getMessage());
			}
		}
		
		
		return postDAO.insertPost(productId,productName, price, imagePath);
	}
}
