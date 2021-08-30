package com.healthStore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.healthStore.common.EncryptUtils;
import com.healthStore.user.bo.UserBO;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserBO userBO;
	
    @RequestMapping("/sign_up_view")
    public String signUp(Model model) {
    	model.addAttribute("viewName", "user/sign_up");
    	
    	return "user/sign_up";
    }
    
    @RequestMapping("/sign_up_for_submit")
	public String signUpForSubmit(
			@RequestParam("loginId") String loginId,
			@RequestParam("password") String password,
			@RequestParam("name") String name,
	        @RequestParam("email") String email) {
		
		
		String encryptPassword = EncryptUtils.md5(email);
		
		userBO.insertUser(loginId, encryptPassword, name, email);
		
		return "redirect:/user/sign_up_view";
	}
    
    @RequestMapping("/sign_in_view")
	public String signInView(Model model) {
		model.addAttribute("viewName", "user/sign_in");
		
		return "user/sign_in";
	}
    
}
