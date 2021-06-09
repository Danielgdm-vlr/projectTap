package com.tap.library.model.entities;

public class ReviewEntity {
    private Integer id;
    private Integer idBook;
    private Integer idUser;
    private String reviewText;
    private Integer bookRating;

    public ReviewEntity() {
    }

    public ReviewEntity(Integer idBook, Integer idUser, String reviewText, Integer bookRating) {
        this.idBook = idBook;
        this.idUser = idUser;
        this.reviewText = reviewText;
        this.bookRating = bookRating;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Integer getBookRating() {
        return bookRating;
    }

    public void setBookRating(Integer bookRating) {
        this.bookRating = bookRating;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", idBook=" + idBook +
                ", idUser=" + idUser +
                ", reviewText='" + reviewText + '\'' +
                ", bookRating=" + bookRating +
                '}';
    }
}
