package com.demoqa.data;

public enum State {
    NCR("NCR"),
    UTTAR_PRADESH("Uttar Pradesh"),
    HARYANA("Haryana"),
    RAJASTHAN("Rajasthan");

    private String title;

    State(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}