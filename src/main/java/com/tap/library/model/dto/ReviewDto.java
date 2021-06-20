package com.tap.library.model.dto;

import com.tap.library.model.entities.BookEntity;

public class ReviewDto {
    private BookDto bookDto;
    private UserDto userDto;
    private String reviewText;
    private double bookRating;

    public ReviewDto() {
    }

    public ReviewDto(BookDto bookDto, UserDto userDto, String reviewText, double bookRating) {
        this.bookDto = bookDto;
        this.userDto = userDto;
        this.reviewText = reviewText;
        this.bookRating = bookRating;
    }

    public BookDto getBookDto() {
        return bookDto;
    }

    public void setBookDto(BookDto bookDto) {
        this.bookDto = bookDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public double getBookRating() {
        return bookRating;
    }

    public void setBookRating(double bookRating) {
        this.bookRating = bookRating;
    }

    @Override
    public String toString() {
        return "ReviewDto{" +
                "bookDto=" + bookDto +
                ", userDto=" + userDto +
                ", reviewText='" + reviewText + '\'' +
                ", bookRating=" + bookRating +
                '}';
    }
}
