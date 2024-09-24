package com.example.demo.service;

import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDAO dao;

    public void insert(Book b) {
        dao.save(b);

    }

    public List<Book> findAll() {
        return dao.findAll();
    }
}
