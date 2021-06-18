package com.tap.library.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "genre")
    private String genre;

    @Basic
    @Column(name  = "rating")
    private double rating;

    @Basic
    @Column(name = "stock")
    private Integer stock;

    @Basic
    @Column(name = "publisher")
    private String publisherName;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "idAuthor", referencedColumnName = "id")
    private AuthorEntity authorEntity;

    @Basic
    @Column(name= "photo_categories")
    private String photo_categories;

    @Basic
    @Column(name="photo_books")
    private String photo_books;

    public BookEntity() {
    }

    public BookEntity(String name, String genre, Double rating, Integer stock, String publisherName,String photo_categories, String photo_books) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.stock = stock;
        this.publisherName = publisherName;
        this.photo_categories=photo_categories;
        this.photo_books=photo_books;
    }

    public Integer getId() {
        return id;
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

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public AuthorEntity getAuthorEntity() {
        return authorEntity;
    }

    public void setAuthorEntity(AuthorEntity authorEntity) {
        this.authorEntity = authorEntity;
    }

    public String getPhoto_categories() { return photo_categories;}

    public void setPhoto_categories(String photo_categories) {this.photo_categories = photo_categories;}

    public String getPhoto_books() { return photo_books;}

    public void setPhoto_books(String photo_books) { this.photo_books = photo_books;}

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", stock=" + stock +
                ", publisherName='" + publisherName + '\'' +
                ", authorEntity=" + authorEntity +
                ", photo_categories=" + photo_categories + '\'' +
                ", photo_books=" + photo_books +
                '}';
    }
}
