package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    SelenideElement
    userName = $("#userName"),
    userEmail = $("#userEmail"),
    userCurrentAddress = $("#currentAddress"),
    userPermanentAddress =$("#permanentAddress"),
    submitButton = $("#submit"),
    nameOutput = $("#output #name"),
    emailOutput = $("#output #email"),
    currentAddressOutput = $("#output #currentAddress"),
    permanentAddressOutput = $("#output #permanentAddress");

    public TextBoxPage openPage(){
        open("/text-box");
        return this;
    }
    public TextBoxPage setUserName(String value){
        userName.setValue(value);
        return this;
    }
    public TextBoxPage setEmail(String value){
        userEmail.setValue(value);
        return this;
    }
    public TextBoxPage setCurrentAddress(String value){
        userCurrentAddress.setValue(value);
        return this;
    }
    public TextBoxPage setPermanentAddress(String value){
        userPermanentAddress.setValue(value);
        return this;
    }
    public TextBoxPage submitInformation(){
       submitButton.click();
        return this;
    }
    public TextBoxPage check(String name, String email, String currentAddress, String permanentAddress){
        nameOutput.shouldHave(text(name));
        emailOutput.shouldHave(text(email));
        currentAddressOutput.shouldHave(text(currentAddress));
        permanentAddressOutput.shouldHave(text(permanentAddress));
        return this;
    }
}

