package com.tap.library.model.dto;

import java.io.Serializable;

public class BookDto implements Serializable {
    private String name;
    private String genre;
    private int rating;
    private int stock;
    private String publisherName;
    private AuthorDto authorDto;

    public BookDto() {
    }

    public BookDto(String name, String genre, int rating, int stock, String publisherName, AuthorDto authorDto) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.stock = stock;
        this.publisherName = publisherName;
        this.authorDto = authorDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public AuthorDto getAuthorDto() {
        return authorDto;
    }

    public void setAuthorDto(AuthorDto authorDto) {
        this.authorDto = authorDto;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", stock=" + stock +
                ", publisherName='" + publisherName + '\'' +
                ", authorDto=" + authorDto +
                '}';
    }
}
