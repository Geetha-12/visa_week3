package com.visa.prj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.visa.prj.service.OrderService;

@Controller
public class ProductController {
	
	@Autowired
	private OrderService service;
	
	@RequestMapping("listProducts.do")
	public String getProducts(Model model) {
		model.addAttribute("products", service.getProducts());
		return "list.jsp";
	}

}
