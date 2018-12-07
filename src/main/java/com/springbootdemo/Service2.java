package com.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Service2  extends UtilBean{
	public String sname;


	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}
