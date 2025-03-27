package com.basic.projects.LibraryManagementSystem.controllers;

import com.basic.projects.LibraryManagementSystem.models.Book;
import com.basic.projects.LibraryManagementSystem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String getBooks(Model model){
    model.addAttribute("Books",bookService.getAllBooks());
        return "Books";
    }
    @GetMapping("/bookForm")
    public String bookForm(Model model){
        model.addAttribute("Books",new Book());
        return "book-form";
    }
    public String updateForm(Model model,@PathVariable long id){
        Book book=bookService.getBookById(id);
        model.addAttribute("Books",);
    }

    @PostMapping("/addBook")
    public String addStudents(@RequestParam Long id,@RequestParam String title,@RequestParam String author,@RequestParam String genre,@RequestParam String avail_status){

        bookService.addNewBook(id,title,author,genre,avail_status);
        return "redirect:/";

    }
    // Delete a book
    @GetMapping("/{id}/delete")
    public String deleteBook(@PathVariable long id) {

        bookService.deleteBook(id);
        return "redirect:/";
    }
}
