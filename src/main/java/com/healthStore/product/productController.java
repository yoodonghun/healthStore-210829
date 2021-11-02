package com.healthStore.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.healthStore.product.bo.ProductBO;
import com.healthStore.product.bo.ReviewBO;
import com.healthStore.product.model.Product;
import com.healthStore.product.model.Review;

@RequestMapping("/product")
@Controller
public class ProductController {

	@Autowired
	private ProductBO productBO;
	
	
	@Autowired
	private ReviewBO reviewBO;

	@RequestMapping("/main_page_view")
	public String main(Model model) {
		List<Product> productDetail = productBO.getProductDetail();
		model.addAttribute("productDetail", productDetail);
		return "template/layout";
	}

	@RequestMapping("/himssen_upperBody_view")
	public String upperView(Model model) {
		List<Product> productDetail = productBO.getProductDetail();
		model.addAttribute("productDetail", productDetail);

		return "part/upper";
	}

	@RequestMapping("/himssen_lowerBody_view")
	public String lowerView(Model model) {
		List<Product> productDetail = productBO.getProductDetail();
		model.addAttribute("productDetail", productDetail);

		return "part/lower";
	}

	@RequestMapping("/himssen_abdominal_view")
	public String abdominalView(Model model) {
		List<Product> productDetail = productBO.getProductDetail();
		model.addAttribute("productDetail", productDetail);

		return "part/abdominal";
	}

	@RequestMapping("/detail_view")
	public String detailView(
			@RequestParam(value = "productId", required =
					false) Integer productId ,
			Model model) {
		
		Product detail = productBO.getDetail(productId);
		model.addAttribute("detail", detail);
		
		List<Review> reviewList = reviewBO.getReviewList();
		model.addAttribute("reviewList", reviewList);
					
		Review reviewDetail = reviewBO.getReview(productId); 
		model.addAttribute("reviewDetail", reviewDetail);			
		
		
		
		
		return "part/detail";
	}
		
	

	
}
