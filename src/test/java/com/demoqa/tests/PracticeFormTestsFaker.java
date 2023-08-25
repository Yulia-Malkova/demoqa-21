package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.ResultPage;
import com.demoqa.utils.Variables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PracticeFormTestsFaker extends RemoteTestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ResultPage resultPage = new ResultPage();
    Variables variables = new Variables();

    @Test
    @Tag("remote")
    @DisplayName("Успешная регистрация при сабмите в форму авторизации - с генерацией данных")
    void fillFormTest() {
        step("Открываем страницу с формой авторизации", () -> {
            registrationPage
                    .openPage()
                    .removeBanner();
        });
        step("Заполняем форму", () -> {
            registrationPage
                    .setFirstName(variables.userFirstName)
                    .setLastName(variables.userLastName)
                    .setEmail(variables.userEmail)
                    .setGender(variables.userGender)
                    .setUserNumber(variables.userNumber)
                    .setBirthDate(variables.userBirthDay, variables.userBirthdayMonth, variables.userBirthdayYear)
                    .setSubjects(variables.userSubject)
                    .setHobbies(variables.userHobby)
                    .setAddress(variables.userAddress)
                    .uploadFile("photo.jpeg")
                    .selectState(variables.userState)
                    .selectCity(variables.userCity);
        });
        step("Делаем сабмит", () -> {
            registrationPage
                    .submitInformation();
        });
        step("Проверяем сохраненные данные", () -> {
            resultPage
                    .checkResult(variables.userFullName, variables.userEmail, variables.userGender, variables.userNumber, variables.userFullBirthday,
                            variables.userSubject, variables.userHobby, "photo.jpeg", variables.userAddress, variables.userStateCity);
        });
    }
}
