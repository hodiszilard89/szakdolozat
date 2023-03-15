package com.example.hirportal01.entity;

public class User {
    private Right  rightId;
    private String chatName;
    private String firstName;
    private String secName;

    public User() {
    }

    public Right getRightId() {
        return rightId;
    }

    public void setRightId(Right rightId) {
        this.rightId = rightId;
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
}
