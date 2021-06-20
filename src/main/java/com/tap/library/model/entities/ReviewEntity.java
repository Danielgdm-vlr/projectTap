package com.tap.library.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "idBook", referencedColumnName = "id")
    private BookEntity bookEntity;

    @OneToOne
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    private UserEntity userEntity;

    @Basic
    @Column(name = "reviewText")
    private String reviewText;

    @Basic
    @Column(name = "bookRating")
    private Double bookRating;

    public ReviewEntity() {
    }

    public ReviewEntity(BookEntity bookEntity, UserEntity userEntity, String reviewText, Double bookRating) {
        this.bookEntity = bookEntity;
        this.userEntity = userEntity;
        this.reviewText = reviewText;
        this.bookRating = bookRating;
    }

    public Integer getId() {
        return id;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Double getBookRating() {
        return bookRating;
    }

    public void setBookRating(Double bookRating) {
        this.bookRating = bookRating;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", idBook=" + bookEntity +
                ", idUser=" + userEntity +
                ", reviewText='" + reviewText + '\'' +
                ", bookRating=" + bookRating +
                '}';
    }
}
