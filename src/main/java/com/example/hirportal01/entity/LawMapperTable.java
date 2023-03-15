package com.example.hirportal01.entity;

import javax.persistence.*;

@Entity
public class LawMapperTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Law law;

    public LawMapperTable() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Law getLaw() {
        return law;
    }

    public void setLaw(Law law) {
        this.law = law;
    }
}
