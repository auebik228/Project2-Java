package com.example.Project2_Java.service.impl;

import com.example.Project2_Java.model.Book;
import com.example.Project2_Java.repository.BooksRepository;
import com.example.Project2_Java.service.BookService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BooksService implements BookService {
    private final BooksRepository repository;
    @Override
    public List<Book> findAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Override
    public Book findBookByTitle(String title) {
        return repository.findBookByTitle(title);
    }

    @Override
    public Book updateBook(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(String title) {
        repository.deleteBook(title);
    }
}
