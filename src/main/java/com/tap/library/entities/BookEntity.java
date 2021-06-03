package com.tap.library.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "genre")
    private String genre;

    @Basic
    @Column(name  = "rating")
    private Integer rating;

    @Basic
    @Column(name = "stock")
    private Integer stock;

    @Basic
    @Column(name = "publisher")
    private String publisherName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAuthor", referencedColumnName = "id")
    @JsonManagedReference
    private AuthorEntity authorEntity;

    public BookEntity() {
    }

    public BookEntity(String name, String genre, Integer stock, String publisherName) {
        this.name = name;
        this.genre = genre;
        this.stock = stock;
        this.publisherName = publisherName;
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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
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
                '}';
    }
}
