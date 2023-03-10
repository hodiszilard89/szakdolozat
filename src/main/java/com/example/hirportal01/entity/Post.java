package com.example.hirportal01.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Post {
    private Long id;
    private Date post_date;
    private Integer likes;
    private Person likers;
    private String title;
    private String main_text;
    private String poster_path;

    public Post(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Person getLikers() {
        return likers;
    }

    public void setLikers(Person likers) {
        this.likers = likers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMain_text() {
        return main_text;
    }

    public void setMain_text(String main_text) {
        this.main_text = main_text;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
