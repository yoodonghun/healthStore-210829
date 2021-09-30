package com.healthStore.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.healthStore.product.bo.ProductBO;
import com.healthStore.product.model.Product;
@RequestMapping("/product")
@Controller
public class ProductController {
	
	@Autowired
	private ProductBO productBO;

	@RequestMapping("/himssen_upperBody_view")
	public String upperView() {		
		
		return "part/upper";
	}
	
	@RequestMapping("/himssen_lowerBody_view")
	public String lowerView() {		
		
		return "part/lower";
	}
	
	@RequestMapping("/himssen_abdominal_view")
	public String abdominalView() {		
		
		return "part/abdominal";
	}
	
	@RequestMapping("/detail_view")
	public String detailView() {
		
		return "part/detail";
	}
	
	@RequestMapping("/productDetail")
	public String productDetail(Model model, String productName, int price, String imagePath) {
		List<Product> productDetail = productBO.getProductDetail(productName, price, imagePath);
		model.addAttribute("productDetail", productDetail);
		return "part/content";
	}
}
