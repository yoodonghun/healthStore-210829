package com.healthStore.post;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.healthStore.product.bo.ProductBO;

@RequestMapping("/post")
@RestController
public class PostRestController {
	
	@Autowired
	private ProductBO productBO;
	
	

	@RequestMapping("/create")
	public Map<String, Object> postCreate(
			@RequestParam(value="productName", required = false) String productName,
			@RequestParam(value = "price") Integer price,
			@RequestParam(value = "part") String part,
			@RequestPart(value = "file", required = false) MultipartFile file,
			HttpServletRequest request){
		
		
		
		HttpSession session = request.getSession();	
		//String loginId = (String) session.getAttribute("userLoginId");
		String loginId = "image";
		 
		
		Map<String, Object> result = new HashMap<>();
		int row = productBO.createPost(loginId,productName, price,part, file);
		if (row > 0) {
			result.put("result", "success");
		} else {
			result.put("result", "error");
		}
		
		return result;
	}
		
	
}