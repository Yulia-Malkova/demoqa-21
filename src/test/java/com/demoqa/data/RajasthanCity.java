package com.demoqa.data;

public enum RajasthanCity {
    JAIPUR("Jaipur"),
    JAISEMEL("Jaiselmel");
    private String title;

    RajasthanCity(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
