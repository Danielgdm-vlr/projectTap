package com.tap.library.model.dto;

import java.sql.Date;

public class RequestDto {
    private UserDto userDto;
    private BookDto bookDto;
    private Date startDate;
    private Date endDate;

    public RequestDto() {
    }

    public RequestDto(UserDto userDto, BookDto bookDto, Date startDate, Date endDate) {
        this.userDto = userDto;
        this.bookDto = bookDto;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public BookDto getBookDto() {
        return bookDto;
    }

    public void setBookDto(BookDto bookDto) {
        this.bookDto = bookDto;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "userDto=" + userDto +
                ", bookDto=" + bookDto +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
