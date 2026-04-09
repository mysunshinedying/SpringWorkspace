package com.spring_mvc.mybatisEx.controller;

import com.spring_mvc.mybatisEx.service.BookService;
import com.spring_mvc.mybatisEx.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class BookRestController {
    @Autowired
    BookService service;

    @RequestMapping("/book/bookSearch3")
    public ArrayList<BookVO> bookSearch3(@RequestParam HashMap<String, Object> param, Model model) {
        ArrayList<BookVO> bookList = service.bookSearch(param);
        model.addAttribute("bookList", bookList);
        return bookList;
    }
}
