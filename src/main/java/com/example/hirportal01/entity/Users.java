package com.example.hirportal01.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long  Id;
    @OneToMany(mappedBy = "users")
    private List<LawMapperTable> lawMapperTable;

    @OneToMany(mappedBy = "users")
    private List<LikeMapperTable> likeMapperTable;
    private String chatName;
    private String firstName;
    private String secName;

    public Users() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<LawMapperTable> getLawTable() {
        return lawMapperTable;
    }

    public void setLawTable(List<LawMapperTable> lawMapperTable) {
        this.lawMapperTable = lawMapperTable;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public List<LawMapperTable> getLawMapperTable() {
        return lawMapperTable;
    }

    public void setLawMapperTable(List<LawMapperTable> lawMapperTable) {
        this.lawMapperTable = lawMapperTable;
    }

    public List<LikeMapperTable> getLikeMapperTable() {
        return likeMapperTable;
    }

    public void setLikeMapperTable(List<LikeMapperTable> likeMapperTable) {
        this.likeMapperTable = likeMapperTable;
    }
}
