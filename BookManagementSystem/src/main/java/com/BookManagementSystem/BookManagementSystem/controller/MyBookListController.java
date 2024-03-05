package com.BookManagementSystem.BookManagementSystem.controller;
import com.BookManagementSystem.BookManagementSystem.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyBookListController {
    private MyBookListService service;
    @Autowired
    public void setMyBookListService(MyBookListService service){
        this.service=service;
    }
    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/my_books";
    }
}