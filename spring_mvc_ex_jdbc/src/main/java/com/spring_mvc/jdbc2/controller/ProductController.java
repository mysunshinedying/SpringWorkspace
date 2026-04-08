package com.spring_mvc.jdbc2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc.jdbc2.Repo.ProductDAO;
import com.spring_mvc.jdbc2.VO.ProductVO;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;

	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}

	@RequestMapping("/product/productSelect")
	public String productSelect(Model model) {
		ArrayList<ProductVO> prdList = productDAO.productSelect();
		model.addAttribute("prdList", prdList);
		return "product/productSelectRes";
	}
}
