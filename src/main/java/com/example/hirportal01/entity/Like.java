package com.example.hirportal01.entity;

public class Like {
    private New    newId;
    private String text;
    private User   writerId;
    private String image;
    private String title;

    public Like() {
    }

    public New getNewId() {
        return newId;
    }

    public void setNewId(New newId) {
        this.newId = newId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getWriterId() {
        return writerId;
    }

    public void setWriterId(User writerId) {
        this.writerId = writerId;
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
