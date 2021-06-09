package com.tap.library.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

//    @OneToMany(mappedBy = "authorEntity", cascade = CascadeType.ALL)
//    @JsonBackReference
//    private List<BookEntity> bookEntityList = new ArrayList<>();

    public AuthorEntity() {
    }

    public AuthorEntity(String fullName, String info) {
        this.fullName = fullName;
        this.info = info;
    }

    public AuthorEntity(Integer id, String fullName, String info) {
        this.id = id;
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

//    public List<BookEntity> getBookEntityList() {
//        return bookEntityList;
//    }
//
//    public void addBook(BookEntity bookEntity){
//        bookEntityList.add(bookEntity);
//        bookEntity.setAuthorEntity(this);
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
