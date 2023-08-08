package com.demoqa.data;

public enum UttarPradeshCity {
        AGRA("Agra"),
        LUCKNOW("Lucknow"),
        MERRUT("Merrut");
        private String title;
        UttarPradeshCity(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
    }
