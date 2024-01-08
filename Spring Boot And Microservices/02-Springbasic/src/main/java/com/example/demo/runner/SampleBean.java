package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleBean {
	
	@Bean
	public List<String> mailList(){
		return Arrays.asList("revanthsai146@gmail.com","sai@gmail.com","sidda@gmail.com","lohith@gmail.com");
	}

}
