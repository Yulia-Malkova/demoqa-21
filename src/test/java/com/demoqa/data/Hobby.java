package com.demoqa.data;

public enum Hobby {
    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");

    private String title;
    Hobby(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
