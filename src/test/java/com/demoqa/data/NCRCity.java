package com.demoqa.data;

public enum NCRCity {
    DELHI("Delhi"),
    GURGAON("Gurgaon"),
    NOIDA("Noida");
    private String title;
    NCRCity(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
