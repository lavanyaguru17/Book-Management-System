package com.BookManagementSystem.BookManagementSystem.controller;
import com.BookManagementSystem.BookManagementSystem.model.Book;
import com.BookManagementSystem.BookManagementSystem.model.MyBookList;
import com.BookManagementSystem.BookManagementSystem.service.BookService;
import com.BookManagementSystem.BookManagementSystem.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
public class BookController {
    private BookService service;
    @Autowired
    public void setBookService(BookService service){
        this.service=service;
    }
    private MyBookListService myBookService;
    @Autowired
    public void setMyBookListService(MyBookListService myBookService){
        this.myBookService=myBookService;
    }
    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }
    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        List<Book>list=service.getAllBook();
        return new ModelAndView("bookList","book",list);
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        service.save(b);
        return "redirect:/available_books";
    }
    @GetMapping("/my_books")
    public String getMyBooks(Model model)
    {
        List<MyBookList>list=myBookService.getAllMyBooks();
        model.addAttribute("book",list);
        return "myBooks";
    }
    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book b=service.getBookById(id);
        MyBookList mb=new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBooks(mb);
        return "redirect:/my_books";
    }
    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id,Model model) {
        Book b=service.getBookById(id);
        model.addAttribute("book",b);
        return "bookEdit";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id")int id) {
        service.deleteById(id);
        return "redirect:/available_books";
    }
}