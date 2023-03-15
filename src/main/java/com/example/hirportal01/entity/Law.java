package com.example.hirportal01.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Law {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String title;

    @OneToMany(mappedBy = "law", cascade = CascadeType.ALL)
    private List<LawMapperTable> lawMapperTable;

    public Law() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LawMapperTable> getLawTable() {
        return lawMapperTable;
    }

    public void setLawTable(List<LawMapperTable> lawMapperTable) {
        this.lawMapperTable = lawMapperTable;
    }

}
