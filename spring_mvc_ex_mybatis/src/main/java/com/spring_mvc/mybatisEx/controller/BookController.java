package com.spring_mvc.mybatisEx.controller;

import com.spring_mvc.mybatisEx.service.BookService;
import com.spring_mvc.mybatisEx.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class BookController {
    @Autowired
    BookService service;

    @RequestMapping("/")
    public String viewIndex() {
        return "index";
    }

    //도서 전체 조회
    @RequestMapping("/book/listAllBooks")
    public String listAllBooks(Model model){
        ArrayList<BookVO> bookList = service.listAllBooks();
        model.addAttribute("bookList", bookList);
        return "/book/bookListView";
    }

    //도서 등록 양식
    @RequestMapping("/book/newBookForm")
    public String viewBookForm(){
        return "/book/newBookForm";
    }

    //도서 등록
    @RequestMapping("/book/insertBook")
    public String insertBook(BookVO vo){
        service.insertBook(vo);
        return "redirect:/book/listAllBooks";
    }

    //도서 상세 조회
    @RequestMapping("/book/detailViewBook/{bookNo}")
    public String detailViewBook(@PathVariable String bookNo, Model model){
        BookVO book = service.detailViewBook(bookNo);
        model.addAttribute("book", book);

        return "book/bookDetailView";
    }

    //도서 수정 폼
    @RequestMapping("/book/updateBookForm/{bookNo}")
    public String bookUpdateForm(@PathVariable String bookNo, Model model){
        BookVO book = service.detailViewBook(bookNo);
        model.addAttribute("book", book);

        return "book/updateBookForm";
    }

    //도서 수정
    @RequestMapping("/book/updateBook")
    public String updateBook(BookVO vo){
        service.updateBook(vo);
        return "redirect:/book/listAllBooks";
    }

    //도서 삭제
    @RequestMapping("/book/deleteBook/{bookNo}")
    public String deleteBook(@PathVariable String bookNo){
        service.deleteBook(bookNo);
        return "redirect:/book/listAllBooks";
    }

    @ResponseBody
    @RequestMapping("/book/bookNoCheck")
    public String bookNoCheck(@RequestParam("bookNo") String bookNo) {
        return service.bookNoCheck(bookNo);
    }

    @ResponseBody
    @RequestMapping("/book/bookNoCheck1/{bookNo}")
    public String bookNoCheck1(@PathVariable String bookNo) {
        return service.bookNoCheck(bookNo);
    }

    @ResponseBody
    @RequestMapping("/book/bookNoCheck2/{bookNo}")
    public String bookNoCheck2(@PathVariable String bookNo) {
        return service.bookNoCheck(bookNo);
    }

    @ResponseBody
    @RequestMapping("/book/bookNoCheck3")
    public String bookNoCheck3(@RequestBody String bookNo) {
        return service.bookNoCheck(bookNo);
    }

    @ResponseBody
    @RequestMapping("/book/bookNoCheck4/{bookNo}")
    public String bookNoCheck4(@PathVariable String bookNo) {
        return service.bookNoCheck(bookNo);
    }

    @ResponseBody
    @RequestMapping("/book/bookNoCheck5")
    public String bookNoCheck5(@RequestBody HashMap<String, String> map) {
        String bookNo = map.get("bookNo");
        return service.bookNoCheck(bookNo);
    }

    @RequestMapping("/book/bookSearchForm1")
    public String viewBookSearchForm1(){
        return "book/bookSearchForm1";
    }

    @RequestMapping("/book/bookSearchForm2")
    public String viewBookSearchForm2(){
        return "book/bookSearchForm2";
    }

    @RequestMapping("/book/bookSearchForm3")
    public String viewBookSearchForm3(){
        return "book/bookSearchForm3";
    }

    @ResponseBody
    @RequestMapping("/book/bookSearch1")
    public ArrayList<BookVO> bookSearch1(@RequestParam HashMap<String, Object> param, Model model){
        return service.bookSearch(param);
    }

    @RequestMapping("/book/bookSearch2")
    public String bookSearch2(@RequestParam HashMap<String, Object> param, Model model) {
        ArrayList<BookVO> bookList = service.bookSearch(param);
        model.addAttribute("bookList", bookList);
        return "book/bookSearchResultView";
    }
}
