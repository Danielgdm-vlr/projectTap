package com.tap.library.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class AuthorEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Basic
    @Column(name = "fullName")
    private String fullName;

    @Basic
    @Column(name = "info")
    private String info;

//    @OneToOne(mappedBy = "authorEntity")
//    @JsonBackReference
//    private BookEntity bookEntity;

    public AuthorEntity() {
    }

    public AuthorEntity(String fullName) {
        this.fullName = fullName;
    }

    public AuthorEntity(String fullName, String info) {
        this.fullName = fullName;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//    public BookEntity getBookEntity() {
//        return bookEntity;
//    }
//
//    public void setBookEntity(BookEntity bookEntity) {
//        this.bookEntity = bookEntity;
//    }

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", info='" + info + '\'' +
//                ", bookEntity=" + bookEntity +
                '}';
    }
}
