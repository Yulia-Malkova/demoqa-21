package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderWrapperInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            addressInput = $("#currentAddress"),
            uploadPictureInput = $("#uploadPicture"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            stateCityInput = $("#stateCity-wrapper"),
            submitButton = $("#submit");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    @Step("Убираем баннер")
    public RegistrationPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    @Step("Заполняем имя")
    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    @Step("Заполняем фамилию")
    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    @Step("Заполняем email")
    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    @Step("Выбираем пол")
    public RegistrationPage setGender(String value) {
        genderWrapperInput.$(byText(value)).click();
        return this;
    }

    @Step("Вводим номер телефона")
    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    @Step("Выбираем дату рождения")
    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    @Step("Выбираем предметы")
    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    @Step("Выбираем хобби")
    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    @Step("Вводим адрес")
    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    @Step("Загружаем файл")
    public RegistrationPage uploadFile(String classPath) {
        uploadPictureInput.uploadFromClasspath(classPath);
        return this;
    }

    @Step("Выбираем штат")
    public RegistrationPage selectState(String value) {
        stateInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }

    @Step("Выбираем город")
    public RegistrationPage selectCity(String value) {
        cityInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage submitInformation() {
        submitButton.click();
        return this;
    }
}