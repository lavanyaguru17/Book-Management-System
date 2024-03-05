package com.BookManagementSystem.BookManagementSystem.service;
import com.BookManagementSystem.BookManagementSystem.model.MyBookList;
import com.BookManagementSystem.BookManagementSystem.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MyBookListService {
    private MyBookRepository mybook;
    @Autowired
    public void setMyBookRepository(MyBookRepository mybook){
        this.mybook=mybook;
    }
    public void saveMyBooks(MyBookList book) {
        mybook.save(book);
    }
    public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }
    public void deleteById(int id) {
        mybook.deleteById(id);
    }
}