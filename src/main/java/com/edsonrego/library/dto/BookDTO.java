package com.edsonrego.library.dto;

import com.edsonrego.library.entities.Book;

import java.io.Serializable;

public class BookDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    private String title;
    private String author;
    private String country;
    private Integer year;

    public BookDTO() {
    }

    public BookDTO(Long id, String title, String author, String country, Integer year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.country = country;
        this.year = year;
    }

    public BookDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        country = entity.getCountry();
        year = entity.getYear();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
