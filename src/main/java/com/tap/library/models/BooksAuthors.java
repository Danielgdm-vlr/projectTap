package com.tap.library.models;

import javax.persistence.*;

@Entity
public class BooksAuthors {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Basic
    @Column(name = "idBook")
    private Integer idBook;

    @Basic
    @Column(name = "idAuthor")
    private Integer idAuthor;

    public BooksAuthors() {
    }

    public BooksAuthors(Integer idBook, Integer idAuthor) {
        this.idBook = idBook;
        this.idAuthor = idAuthor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString() {
        return "BooksAuthors{" +
                "id=" + id +
                ", idBook=" + idBook +
                ", idAuthor=" + idAuthor +
                '}';
    }
}
