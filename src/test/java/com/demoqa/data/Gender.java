package com.demoqa.data;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String title;

    Gender(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;

    }
}
