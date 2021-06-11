package com.tap.library.model.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "request")
public class RequestEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    private UserEntity userEntity;

    @OneToOne
    @JoinColumn(name = "idBook", referencedColumnName = "id")
    private BookEntity bookEntity;

    @Basic
    @Column(name = "startDate")
    private Date startDate;

    @Basic
    @Column(name = "endDate")
    private Date endDate;

    public RequestEntity() {
    }

    public RequestEntity(UserEntity userEntity, BookEntity bookEntity, Date startDate) {
        this.userEntity = userEntity;
        this.bookEntity = bookEntity;
        this.startDate = startDate;
    }

    public RequestEntity(UserEntity userEntity, BookEntity bookEntity, Date startDate, Date endDate) {
        this.userEntity = userEntity;
        this.bookEntity = bookEntity;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
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
        return "RequestEntity{" +
                "id=" + id +
                ", userEntity=" + userEntity +
                ", bookEntity=" + bookEntity +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
