package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/demo")
public class JenkinsController {
	// 新增案例
		@RequestMapping("/test")
		public String save(String data) {
			return "This is jenkins test by"+data;
		}
}
