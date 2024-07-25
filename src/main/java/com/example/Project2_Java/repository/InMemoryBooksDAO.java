package com.example.Project2_Java.repository;

import com.example.Project2_Java.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InMemoryBooksDAO {
    private final List<Book> books = new ArrayList<>();

    public List<Book> findAllBooks() {
        return books;
    }


    public Book saveBook(Book book) {
        books.add(book);
        return book;
    }


    public Book findBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst().
                orElse(null);
    }

    public Book updateBook(Book book) {
        var bookIndex = IntStream.range(0,books.size())
                .filter(index ->books.get(index).getTitle().equals(book.getTitle()))
                .findFirst()
                .orElse(-1);
        if (bookIndex>-1){
            books.set(bookIndex,book);
            return book;
        }
        return null;
    }


    public void deleteBook(String title) {
        var book = findBookByTitle(title);
        if (book!=null){
            books.remove(book);
        }
    }
}
