package com.java.test.firstspringtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/")
	public String tesController()
	{
		List<Product> list=service.displayAll();
		for(Product p:list)
		{
			System.out.println(p.getName()+" "+p.getCost());
		}
		
		return "index";
	}
}
