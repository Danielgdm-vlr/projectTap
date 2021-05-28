package com.tap.library.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Requests {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Basic
    @Column(name = "idClient")
    private Integer idClient;

    @Basic
    @Column(name = "cnpGuest")
    private String cnp;

    @Basic
    @Column(name = "idBook")
    private Integer bookName;

    @Basic
    @Column(name = "startDate")
    private Date startDate;

    @Basic
    @Column(name = "endDate")
    private Date endDate;

    public Requests() {
    }

    public Requests(Integer bookName, Date startDate, Date endDate) {
        this.bookName = bookName;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Integer getId() {
        return id;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Integer getBookName() {
        return bookName;
    }

    public void setBookName(Integer bookName) {
        this.bookName = bookName;
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
        return "Requests{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", cnp='" + cnp + '\'' +
                ", bookName=" + bookName +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
