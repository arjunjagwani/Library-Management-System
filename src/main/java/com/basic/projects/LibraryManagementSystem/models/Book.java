package com.basic.projects.LibraryManagementSystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    private long id;
    private String title;
    private String author;
    private String genre;
    private boolean avail_status;

    public Book() {
    }

    public Book(long id, String title, String author, String genre, boolean avail_status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.avail_status = avail_status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvail_status() {
        return avail_status;
    }

    public void setAvail_status(boolean avail_status) {
        this.avail_status = avail_status;
    }
}
