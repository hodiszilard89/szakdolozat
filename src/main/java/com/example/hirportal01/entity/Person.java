package com.example.hirportal01.entity;

import javax.persistence.Entity;

@Entity
public class Person {
    private Long id;
    private Long liked_posts;
    private String first_name;
    private String sec_name;
    private String avatar_name;
    private String avatar_path;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLiked_posts() {
        return liked_posts;
    }

    public void setLiked_posts(Long liked_posts) {
        this.liked_posts = liked_posts;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSec_name() {
        return sec_name;
    }

    public void setSec_name(String sec_name) {
        this.sec_name = sec_name;
    }

    public String getAvatar_name() {
        return avatar_name;
    }

    public void setAvatar_name(String avatar_name) {
        this.avatar_name = avatar_name;
    }

    public String getAvatar_path() {
        return avatar_path;
    }

    public void setAvatar_path(String avatar_path) {
        this.avatar_path = avatar_path;
    }
}
