package com.example.Project2_Java.controller;

import com.example.Project2_Java.model.Book;
import com.example.Project2_Java.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/api/Books")

public class BooksController {
    private final BookService service;
    @GetMapping
    public List<Book> findAllBooks() {
        return service.findAllBooks();
    }
    @PostMapping("save_book")
    public Book saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }
    @GetMapping("/{title}")
    public Book findBookByTitle(@PathVariable String title){
        return service.findBookByTitle(title);
    }
    @PutMapping("update_student")
    public Book updateBook(Book book){
        return service.updateBook(book);
    }
    @DeleteMapping("delete_student/{title}")
    void deleteBook(@PathVariable String title){
        service.deleteBook(title);
    }
}
