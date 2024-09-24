package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bs;

    @GetMapping("/")
    public void insertForm() {

    }

    @PostMapping("/book/insert")
    public String insertSubmit(Book b) {
        bs.insert(b);
        return "redirect:/book/list";
    }

    @GetMapping("/book/list")
    public void list(Model model) {
        model.addAttribute("list",  bs.findAll());
    }
}
