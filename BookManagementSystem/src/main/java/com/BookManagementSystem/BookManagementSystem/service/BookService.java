package com.BookManagementSystem.BookManagementSystem.service;
import com.BookManagementSystem.BookManagementSystem.model.Book;
import com.BookManagementSystem.BookManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
    private BookRepository bRepo;
    @Autowired
    public void setBookRepository(BookRepository bRepo){
        this.bRepo=bRepo;
    }
    public void save(Book b) {
        bRepo.save(b);
    }
    public List<Book> getAllBook(){
        return bRepo.findAll();
    }
    public Book getBookById(int id) {
        return bRepo.findById(id).get();
    }
    public void deleteById(int id) {
        bRepo.deleteById(id);
    }
}