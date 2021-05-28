package com.tap.library.models;

import javax.persistence.*;

@Entity
public class Authors {
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

    public Authors() {
    }

    public Authors(String fullName) {
        this.fullName = fullName;
    }

    public Authors(String fullName, String info) {
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

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
