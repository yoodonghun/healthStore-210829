package com.healthStore.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer{

	@Autowired 
	private PermissionInterceptor interceptor;
}
