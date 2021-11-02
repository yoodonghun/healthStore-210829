package com.healthStore.post;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.healthStore.post.bo.PostBO;

@RequestMapping("post")
@RestController
public class PostRestController {
	
	@Autowired
	private PostBO postBO;

	@RequestMapping("/create")
	public Map<String, String> postCreate(
			@RequestParam(value="productName", required = false) String productName,
			@RequestParam(value = "price") Integer price,
			@RequestParam(value = "file", required = false) MultipartFile file,
			HttpServletRequest request){
		
		HttpSession session = request.getSession();
		int productId = (Integer) session.getAttribute("productId");
		String loginId = (String) session.getAttribute("loginId");
		
		Map<String, String> result = new HashMap<>();
		int row = postBO.createPost(productId, loginId, productName, price, file);
		if (row > 0) {
			result.put("result", "success");
		} else {
			result.put("result", "error");
		}
		
		return result;
	}
		
	
}