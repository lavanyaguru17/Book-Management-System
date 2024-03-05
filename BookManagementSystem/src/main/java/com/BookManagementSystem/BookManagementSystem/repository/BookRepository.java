package com.BookManagementSystem.BookManagementSystem.repository;
import com.BookManagementSystem.BookManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {
}