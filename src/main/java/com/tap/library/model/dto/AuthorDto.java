package com.tap.library.model.dto;

import java.io.Serializable;

public class AuthorDto implements Serializable {
    private String fullName;
    private String info;

    public AuthorDto() {
    }

    public AuthorDto(String fullName, String info) {
        this.fullName = fullName;
        this.info = info;
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
        return "AuthorDto{" +
                "fullName='" + fullName + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
