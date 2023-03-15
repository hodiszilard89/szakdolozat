package com.example.hirportal01.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  Id;
    @Column(columnDefinition = "TEXT")
    private String text;
    @OneToMany
    private List<Users> writer;

    @OneToMany
    private List<LikeMapperTable> likeMapperTable;

    private String image;
    private String title;
    public News() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Users> getWriter() {
        return writer;
    }

    public void setWriter(List<Users> writer) {
        this.writer = writer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LikeMapperTable> getLikeMapperTable() {
        return likeMapperTable;
    }

    public void setLikeMapperTable(List<LikeMapperTable> likeMapperTable) {
        this.likeMapperTable = likeMapperTable;
    }
}
