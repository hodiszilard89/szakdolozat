package com.example.hirportal01.dto;

import com.example.hirportal01.entity.LikeMapperTable;
import com.example.hirportal01.entity.Users;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class NewsDTO {
    private Long  Id;
    private String text;
    private List<Users> writer;
    private List<LikeMapperTable> likeMapperTable;
    private String image;
    private String title;

    public NewsDTO() {
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

    public List<LikeMapperTable> getLikeMapperTable() {
        return likeMapperTable;
    }

    public void setLikeMapperTable(List<LikeMapperTable> likeMapperTable) {
        this.likeMapperTable = likeMapperTable;
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
}
