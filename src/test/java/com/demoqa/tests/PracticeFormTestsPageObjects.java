package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.ResultPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PracticeFormTestsPageObjects extends RemoteTestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ResultPage resultPage = new ResultPage();

    @Test
    @Tag("remote")
    @DisplayName("Успешная регистрация при сабмите в форму авторизации - без генерации данных")
    void fillFormTest() {
        step("Открываем страницу с формой авторизации", () -> {
            registrationPage
                    .openPage()
                    .removeBanner();
        });
        step("Заполняем форму", () -> {
            registrationPage
                    .setFirstName("John")
                    .setLastName("Lennon")
                    .setEmail("beatles@liverpool.com")
                    .setGender("Male")
                    .setUserNumber("4412345678")
                    .setBirthDate("09", "October", "1940")
                    .setSubjects("Arts")
                    .setHobbies("Music")
                    .setAddress("Central Park")
                    .uploadFile("photo.jpeg")
                    .selectState("Haryana")
                    .selectCity("Karnal");
        });
        step("Делаем сабмит", () -> {
            registrationPage
                    .submitInformation();
        });
        step("Проверяем таблицу с результатами", () -> {
            resultPage
                    .checkResult("John Lennon", "beatles@liverpool.com", "Male", "4412345678", "09 October,1940",
                            "Arts", "Music", "photo.jpeg", "Central Park", "Haryana Karnal");
        });
    }
}