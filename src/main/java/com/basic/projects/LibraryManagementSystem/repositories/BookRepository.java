package com.basic.projects.LibraryManagementSystem.repositories;

import com.basic.projects.LibraryManagementSystem.models.Book;
import com.basic.projects.LibraryManagementSystem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> findByTitleContainingIgnoreCase(String query);
}
