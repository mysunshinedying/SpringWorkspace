package com.spring_mvc.mybatisEx.service;

import com.spring_mvc.mybatisEx.vo.BookVO;

import java.util.ArrayList;
import java.util.HashMap;

public interface IBookService {
    ArrayList<BookVO> listAllBooks();
    void insertBook(BookVO bookVo);
    void updateBook(BookVO bookVo);
    void deleteBook(String bookNo);
    BookVO detailViewBook(String bookNo);

    String bookNoCheck(String bookNo);
    ArrayList<BookVO> bookSearch(HashMap<String, Object> map);
}
