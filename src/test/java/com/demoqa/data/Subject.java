package com.demoqa.data;

public enum Subject {
    ENGLISH("English"),
    CHEMISTRY("Chemistry"),
    COMPUTER_SCIENCE("Computer Science"),
    COMMERCE("Commerce"),
    ECONOMICS("Economics"),
    SOCIAL_STUDIES("Social Studies"),
    ARTS("Arts"),
    HISTORY("History"),
    MATHS("Maths"),
    ACCOUNTING("Accounting"),
    PHYSICS("Physics"),
    BIOLOGY("Biology"),
    HINDI("Hindi"),
    CIVICS("Civivs");

    private String title;
    Subject(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
