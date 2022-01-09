package org.school.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Book {
    @Id
    @GeneratedValue
    @Column(name="bookId")
    private UUID id;

    private  String title;

    private String author;

    private  String publishingHouse;

    private LocalDate publishingDate;

    private int pages;

    private boolean available;

    public Book() {
    }

    public Book(UUID id, String title, String author, String publishingHouse, LocalDate publishingDate, int pages, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingDate = publishingDate;
        this.pages = pages;
        this.available = available;
    }

    public Book(String title, String author, String publishingHouse, LocalDate publishingDate, int pages, boolean available) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingDate = publishingDate;
        this.pages = pages;
        this.available = available;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
