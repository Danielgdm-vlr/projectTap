package com.tap.library.models;

import javax.persistence.*;

@Entity
public class Books {

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
    @Column(name = "stoc")
    private Integer stoc;

    @Basic
    @Column(name = "publisher")
    private String publisherName;

    @Basic
    @Column(name = "idAuthor")
    private String idAuthor;

    public Books() {
    }

    public Books(String name, String genre, Integer stoc, String publisherName) {
        this.name = name;
        this.genre = genre;
        this.stoc = stoc;
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

    public Integer getStoc() {
        return stoc;
    }

    public void setStoc(Integer stoc) {
        this.stoc = stoc;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", stoc=" + stoc +
                ", publisherName='" + publisherName + '\'' +
                ", idAuthor='" + idAuthor + '\'' +
                '}';
    }
}
