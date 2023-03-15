package com.example.hirportal01.entity;
import javax.persistence.*;

@Entity
public class LikeMapperTable {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Long id;
    @ManyToOne
    private Users users;
    @ManyToOne
    private News news;

    public LikeMapperTable() {
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
