package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.TableToCheck;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    CalendarComponent calendar = new CalendarComponent();
    TableToCheck table = new TableToCheck();
    SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            email = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            birthDate = $("#dateOfBirthInput"),
            subjectsInput =$("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            addressInput = $("#currentAddress"),
            uploadPictureInput = $("#uploadPicture"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            stateCityInput = $("#stateCity-wrapper"),
            submitButton = $("#submit");


    public RegistrationPage openPage(){
        open("/automation-practice-form");
        return this;
    }
    public RegistrationPage removeBanner(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public RegistrationPage setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }
    public RegistrationPage setLastName(String value) {
        lastName.setValue(value);
        return this;
    }
    public RegistrationPage setEmail(String value) {
        email.setValue(value);
        return this;
    }
    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;}

    public RegistrationPage setUserNumber(String value) {
            userNumber.setValue(value);
            return this;
    }
    public RegistrationPage setBirthDate(String day, String month, String year){
        birthDate.click();
        calendar.setDate(day,month,year);
        return this;
    }
    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value);
        return this;
    }
    public RegistrationPage uploadFile(String classPath) {
        uploadPictureInput.uploadFromClasspath(classPath);
        return this;
    }
    public RegistrationPage selectState(String value) {
        stateInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPage selectCity(String value) {
        cityInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPage submitInformation() {
        submitButton.click();
        return this;
    }
    public RegistrationPage checkResult(String name, String email, String gender, String phone, String birthDate, String subject,
                                        String hobby, String fileName, String address, String stateCity){
        table.compareTableResult(name, email, gender, phone, birthDate, subject, hobby, fileName, address, stateCity);
        return this;
    }

}
