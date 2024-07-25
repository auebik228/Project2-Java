package com.example.Project2_Java.repository;

import com.example.Project2_Java.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book,Long> {
    void deleteBook(String title);
    Book findBookByTitle(String title);
}
