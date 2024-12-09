package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // You can add custom queries here if needed
}
