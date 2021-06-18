package com.tap.library.model.dto;

import java.io.Serializable;

public class BookDto implements Serializable {
    private String name;
    private String genre;
    private double rating;
    private int stock;
    private String publisherName;
    private AuthorDto authorDto;
    private String photo_categories;
    private String photo_books;

    public BookDto() {
    }

    public BookDto(String name, String genre, double rating, int stock, String publisherName, AuthorDto authorDto,String photo_categories,String photo_books) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.stock = stock;
        this.publisherName = publisherName;
        this.authorDto = authorDto;
        this.photo_categories=photo_categories;
        this.photo_books=photo_books;
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

    public double getRating() {
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

    public String getPhoto_categories() { return photo_categories;}

    public void setPhoto_categories(String photo_categories) {this.photo_categories = photo_categories;}

    public String getPhoto_books() { return photo_books;}

    public void setPhoto_books(String photo_books) { this.photo_books = photo_books;}

    @Override
    public String toString() {
        return "BookDto{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", stock=" + stock +
                ", publisherName='" + publisherName + '\'' +
                ", authorDto=" + authorDto +
                ", photo_categories=" + photo_categories + '\'' +
                ", photo_books=" + photo_books +
                '}';
    }
}
