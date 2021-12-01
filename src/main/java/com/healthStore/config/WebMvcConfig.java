package com.healthStore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.healthStore.interceptor.PermissionInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

	@Autowired 
	private PermissionInterceptor interceptor;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/saveImages/**") 
		.addResourceLocations("file:////home/ec2-user/imageFile/saveImages/"); 
	}
	
	@Override 
	public void addInterceptors(InterceptorRegistry registry) { 
		registry.addInterceptor(interceptor) 
		.addPathPatterns("/**") 
		.excludePathPatterns("/user/sign_out", "/static/**", "/error"); 
	}
}
