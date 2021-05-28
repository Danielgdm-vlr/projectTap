package com.tap.library.models;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic()
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "idManager")
    private Integer idManager;

    @Basic
    @Column(name = "idClient")
    private Integer idClient;


    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdManager() {
        return idManager;
    }

    public void setIdManager(Integer idManager) {
        this.idManager = idManager;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", idManager=" + idManager +
                ", idClient=" + idClient +
                '}';
    }
}
