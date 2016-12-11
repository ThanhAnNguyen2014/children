package com.thanhan.models;

import javax.persistence.*;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
@Entity
@Table(name = "admin")
public class admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public admin(String username, String password, String email) {

        this.username = username;
        this.password = password;
        this.email = email;
    }

    public admin() {
    }
}
