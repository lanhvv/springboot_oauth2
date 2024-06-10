package com.example.demo.controller;

import com.example.demo.entity.Book;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private final SessionFactory sessionFactory;

    BookController(EntityManagerFactory entityManagerFactory) {
        if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }


    @GetMapping("/book")
    public List<Book> get() {
        var books = sessionFactory.fromTransaction(session -> {
            return session.createSelectionQuery("from Book", Book.class)
                    .getResultList();
        });
        return books.isEmpty() ? new ArrayList<>() : books;
    }
}
