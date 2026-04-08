package com.spring_mvc.data;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@RequestMapping("/bookInfoView1")
	public String showBookInfo1(Model model) {
		model.addAttribute("subject", "스프링 프레임워크1");
		model.addAttribute("price", 20000);
		
		return "bookInfoView";
	}	
	
	@RequestMapping("/bookInfoView2")
	public ModelAndView showBookInfo2(ModelAndView mv) {
		mv.addObject("subject", "스프링 프레임워크2");
		mv.addObject("price", 25000);
		mv.setViewName("bookInfoView");
		return mv;
	}	
	
	//다중 맵핑
	@RequestMapping(value={"/book/bookInfoView3", "/book/bookInfoView4"})
	public String ShowBookInfo34(HttpServletRequest request, Model model) {
		
		if(request.getServletPath().equals("/book/bookInfoView3")) {
			model.addAttribute("subject", "스프링 프레임워크3");
			model.addAttribute("price", 28000);			
		} else if(request.getServletPath().equals("/book/bookInfoView4")) {
			model.addAttribute("subject", "스프링 프레임워크4");
			model.addAttribute("price", 29000);			
		}
		
		return "book/bookInfoView";
	}
}
