package com.lightszentip.sample;

import org.jsondoc.springmvc.controller.JSONDocController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.collect.Lists;

@Controller
@RequestMapping(value = "/jsondoc")
public class JSONDocController2 extends JSONDocController {
 
	public JSONDocController2() {
		setVersion("1.0");
		setBasePath("http://localhost:8080");
		setPackages(Lists.newArrayList(String.valueOf("com.lightszentip.sample")));
	}
	
	
}
