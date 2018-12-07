package com.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service1 {
	
	@Autowired
	Service2 service2;
	
	public void doSomething(){
		service2.setSname("Hello");
		System.out.println("sname==> "+service2.sname);
		System.out.println("getSname==>"+service2.getSname());
	}
}
