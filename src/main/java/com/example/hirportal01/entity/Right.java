package com.example.hirportal01.entity;

public class Right {
    private User userId;
    private Law lawId;

    public Right() {
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Law getLawId() {
        return lawId;
    }

    public void setLawId(Law lawId) {
        this.lawId = lawId;
    }
}
