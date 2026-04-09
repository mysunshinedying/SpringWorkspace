package com.spring_mvc.mybatisEx.service;

import com.spring_mvc.mybatisEx.model.IBookDAO;
import com.spring_mvc.mybatisEx.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class BookService implements IBookService {
    @Autowired
    @Qualifier("IBookDAO")
    IBookDAO dao;

    @Override
    public ArrayList<BookVO> listAllBooks() {
        return dao.listAllBooks();
    }

    @Override
    public void insertBook(BookVO bookVo) {
        dao.insertBook(bookVo);
    }

    @Override
    public void updateBook(BookVO bookVo) {
        dao.updateBook(bookVo);
    }

    @Override
    public void deleteBook(String bookNo) {
        dao.deleteBook(bookNo);
    }

    @Override
    public BookVO detailViewBook(String bookNo) {
        return dao.detailViewBook(bookNo);
    }

    @Override
    public String bookNoCheck(String bookNo) {
        String no = dao.bookNoCheck(bookNo);
        String result = "available";
        if (no != null) {
            result = "no_available";
        }
        return result;
    }

    @Override
    public ArrayList<BookVO> bookSearch(HashMap<String, Object> map) {
        return dao.bookSearch(map);
    }
}
