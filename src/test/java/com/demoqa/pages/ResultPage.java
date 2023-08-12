package com.demoqa.pages;

import com.demoqa.pages.components.TableToCheck;

public class ResultPage {

    TableToCheck table = new TableToCheck();

    public void checkResult(String name, String email, String gender, String phone, String birthDate, String subject,
                            String hobby, String fileName, String address, String stateCity){
        table.compareTableResult(name, email, gender, phone, birthDate, subject, hobby, fileName, address, stateCity);
    }
}
