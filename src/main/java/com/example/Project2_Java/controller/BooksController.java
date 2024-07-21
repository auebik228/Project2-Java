package com.example.Project2_Java.controller;

import model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Books")
public class BooksController {
    @GetMapping
    public List<Book> findAllBooks() {
        return List.of(
                Book.builder()
                        .name("Example Book")
                        .creatingTime("2024-07-19")
                        .author("John Doe")
                        .genre("Fiction")
                        .publicRating(5)
                        .myRating(4)
                        .build()
        );
    }
}
