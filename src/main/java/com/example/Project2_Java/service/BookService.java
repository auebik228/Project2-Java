package com.example.Project2_Java.service;

import com.example.Project2_Java.model.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Primary
public interface BookService {
     List<Book> findAllBooks();
     Book saveBook(Book book);
     Book findBookByTitle(String title);
     Book updateBook(Book book);
     void deleteBook(String title);
}