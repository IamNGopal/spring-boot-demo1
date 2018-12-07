package com.springbootdemo;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UtilBean {
	
	@Transactional
	public String appendString(String s1) {
		return " Hi "+ s1;
	}
}
