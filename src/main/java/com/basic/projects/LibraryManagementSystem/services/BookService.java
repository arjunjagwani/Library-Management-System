package com.basic.projects.LibraryManagementSystem.services;

import com.basic.projects.LibraryManagementSystem.models.Book;
import com.basic.projects.LibraryManagementSystem.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }


    public void addNewBook(long id, String title, String author, String genre, String availStatus) {
        if (bookRepository.existsById(id)) {
            return;
        }
        Book book = new Book(id, title, author, genre, Boolean.parseBoolean(availStatus));
        bookRepository.save(book);
    }

    public Book getBookById(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void updateNewBook(long id, String title, String author, String genre, boolean availStatus) {
        Book book = bookRepository.findById(id).orElse(null);
        book.setTitle(title);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setAvail_status(availStatus);
        bookRepository.save(book);
    }

    public List<Book> searchBooks(String query) {

        if (query.matches("\\d+")) { // If the input is a number, assume it's a Book ID
            Optional<Book> book = bookRepository.findById(Long.parseLong(query));
            return book.map(Collections::singletonList).orElse(Collections.emptyList());
        } else { // Otherwise, assume it's a Title search
            return bookRepository.findByTitleContainingIgnoreCase(query);
        }
    }
}
