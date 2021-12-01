package com.healthStore.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class PermissionInterceptor implements HandlerInterceptor{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
		
	
	@Override
	public void postHandle(HttpServletRequest request, 
			    HttpServletResponse response, 
			    Object handler, 
			    ModelAndView modelAndView) throws Exception {
		
		
		String uri = request.getRequestURI();
		logger.info(uri);
	}
	
	@Override
	public void afterCompletion(
	        HttpServletRequest request, 
	        HttpServletResponse response, 
	        Object handler,
	        Exception ex) throws Exception {
		
		
		String uri = request.getRequestURI();
		logger.info(uri);
	}
}
