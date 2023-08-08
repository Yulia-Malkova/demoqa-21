package com.demoqa.data;

public enum HaryanaCity
{
    KARNAL("Karnal"),
    PANIPAT("Panipat");
    private String title;
    HaryanaCity(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
