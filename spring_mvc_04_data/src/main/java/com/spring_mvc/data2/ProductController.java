package com.spring_mvc.data2;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_mvc.DTO.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/product/productForm")
	public String productFormView() {
		return "/product/productForm";
	}
	
	@RequestMapping("/product/productForm2")
	public String productFormView2() {
		return "/product/productForm2";
	}
	
	@RequestMapping("/product/productForm3")
	public String productFormView3() {
		return "/product/productForm3";
	}
	
	@RequestMapping("/product/productForm4")
	public String productFormView4() {
		return "/product/productForm";
	}	
	
	//-- 여기까지 각 Form들을 Mapping 처리함
	
	//getParameter()
	@RequestMapping("/product/newProduct")
	public String insertProduct(HttpServletRequest request, Model model) {
		String prdNo = request.getParameter("prdNo");
		String prdName = request.getParameter("prdName");
		String prdPrice = request.getParameter("prdPrice");
		String prdCompany = request.getParameter("prdCompany");
		String prdDate = request.getParameter("prdDate");
		String prdStock = request.getParameter("prdStock");
		
		model.addAttribute("prdNo", prdNo);
		model.addAttribute("prdName", prdName);
		model.addAttribute("prdPrice", prdPrice);
		model.addAttribute("prdCompany", prdCompany);
		model.addAttribute("prdDate", prdDate);
		model.addAttribute("prdStock", prdStock);
		
		return "/product/productResult";
	}
	
	//@RequestParam 어노테이션(생략)
	@RequestMapping("/product/newProduct2")
	public String insertProduct2(String prdNo,
								String prdName,
								int prdPrice,
								String prdCompany,
								String prdDate,
								int prdStock,
								Model model) {
		
		model.addAttribute("prdNo", prdNo);
		model.addAttribute("prdName", prdName);
		model.addAttribute("prdPrice", prdPrice);
		model.addAttribute("prdCompany", prdCompany);
		model.addAttribute("prdDate", prdDate);
		model.addAttribute("prdStock", prdStock);
		
		return "/product/productResult";
	}	
	
	//여기까지는 Result 사용
	
	//command 객체
	@RequestMapping("/product/newProduct3")
	public String insertProduct3(Product product,
								Model model) {
		
		System.out.println("상품번호: " + product.getPrdNo());
		System.out.println("상품명: " + product.getPrdName());
		System.out.println("가격: " + product.getPrdPrice());
		System.out.println("제조회사: " + product.getPrdCompany());
		System.out.println("제조일: " + product.getPrdDate());
		System.out.println("재고: " + product.getPrdStock());			
		
		return "/product/productResult3";
	}		
	
	//@ModelAttribute 어노테이션 사용
	@RequestMapping("/product/newProduct4")
	public String insertProduct4(@ModelAttribute("productInfo") Product product) {
		return "/product/productResult4";
	}
	
	// 상품 검색
	@RequestMapping("/product/productSearchForm")
	public String productSearchForm() {
		return "product/productSearchForm";
	}
	
	//HashMap으로 받기
	@RequestMapping("/product/productSearch")
	public String productSearch(@RequestParam HashMap<String, Object> param, Model model) {
		System.out.println(param.get("type"));
		System.out.println(param.get("keyword"));
		//model에 해하는 dao로 전달해서 dbms와 쿼리 실행 후 결과값을 전달받는 로직이 필요
		//비지니스 로직 처리 코드
		
		Product prd1 = new Product();
		prd1.setPrdNo("001");
		prd1.setPrdName("냉장고");
		prd1.setPrdCompany("엘지");
		
		ArrayList<Product> prdList = new ArrayList<Product>();
		prdList.add(prd1);
		
		model.addAttribute("prdList", prdList);
		
		return "product/productSearchResult";
	}
	

	

}
