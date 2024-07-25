package com.example.Project2_Java.service.impl;

import com.example.Project2_Java.model.Book;
import com.example.Project2_Java.repository.InMemoryBooksDAO;
import com.example.Project2_Java.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryBooksService implements BookService {
    private final InMemoryBooksDAO repository;
    @Override
    public List<Book> findAllBooks() {
        return repository.findAllBooks();
    }

    @Override
    public Book saveBook(Book book) {
        return repository.saveBook(book);
    }

    @Override
    public Book findBookByTitle(String title) {
        return repository.findBookByTitle(title);
    }

    @Override
    public Book updateBook(Book book) {
        return repository.updateBook(book);
    }

    @Override
    public void deleteBook(String title) {
        repository.deleteBook(title);
    }
}
