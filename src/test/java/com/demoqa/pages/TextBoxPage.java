package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            userCurrentAddressInput = $("#currentAddress"),
            userPermanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit"),
            nameOutput = $("#output #name"),
            emailOutput = $("#output #email"),
            currentAddressOutput = $("#output #currentAddress"),
            permanentAddressOutput = $("#output #permanentAddress");

    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    @Step("Вводим имя")
    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    @Step("Вводим email")
    public TextBoxPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    @Step("Вводим current address")
    public TextBoxPage setCurrentAddress(String value) {
        userCurrentAddressInput.setValue(value);
        return this;
    }

    @Step("Ввводим permanent address")
    public TextBoxPage setPermanentAddress(String value) {
        userPermanentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage submitInformation() {
        submitButton.click();
        return this;
    }

    public TextBoxPage check(String name, String email, String currentAddress, String permanentAddress) {
        nameOutput.shouldHave(text(name));
        emailOutput.shouldHave(text(email));
        currentAddressOutput.shouldHave(text(currentAddress));
        permanentAddressOutput.shouldHave(text(permanentAddress));
        return this;
    }
}