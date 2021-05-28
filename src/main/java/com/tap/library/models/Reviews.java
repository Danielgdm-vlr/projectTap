package com.tap.library.models;

public class Reviews {
    private Integer id;
    private Integer idBook;
    private Integer idClient;
    private String reviewText;
    private Integer bookRating;

    public Reviews() {
    }

    public Reviews(Integer idBook, Integer idClient, String reviewText, Integer bookRating) {
        this.idBook = idBook;
        this.idClient = idClient;
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

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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
                ", idClient=" + idClient +
                ", reviewText='" + reviewText + '\'' +
                ", bookRating=" + bookRating +
                '}';
    }
}
