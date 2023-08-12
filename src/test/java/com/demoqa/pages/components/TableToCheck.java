package com.demoqa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TableToCheck {

    public void compareTableResult(String name, String email, String gender, String phone, String birthDate, String subject,
                            String hobby, String fileName, String address, String stateCity){
        $("tbody tr:nth-child(1) td:nth-child(2)").shouldHave(text(name));
        $("tbody tr:nth-child(2) td:nth-child(2)").shouldHave(text(email));
        $("tbody tr:nth-child(3) td:nth-child(2)").shouldHave(text(gender));
        $("tbody tr:nth-child(4) td:nth-child(2)").shouldHave(text(phone));
        $("tbody tr:nth-child(5) td:nth-child(2)").shouldHave(text(birthDate));
        $("tbody tr:nth-child(6) td:nth-child(2)").shouldHave(text(subject));
        $("tbody tr:nth-child(7) td:nth-child(2)").shouldHave(text(hobby));
        $("tbody tr:nth-child(8) td:nth-child(2)").shouldHave(text(fileName));
        $("tbody tr:nth-child(9) td:nth-child(2)").shouldHave(text(address));
        $("tbody tr:nth-child(10) td:nth-child(2)").shouldHave(text(stateCity));
    }
}