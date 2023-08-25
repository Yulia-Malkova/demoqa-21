package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.ResultPage;
import com.demoqa.utils.Variables;
import org.junit.jupiter.api.Test;

public class PracticeFormTestsFaker extends RemoteTestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ResultPage resultPage = new ResultPage();
    Variables variables = new Variables();

    @Test
    void fillFormTest() {
        registrationPage
                .openPage()
                .removeBanner()
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
                .selectCity(variables.userCity)
                .submitInformation();

        resultPage
                .checkResult(variables.userFullName, variables.userEmail, variables.userGender, variables.userNumber,  variables.userFullBirthday,
                    variables.userSubject, variables.userHobby,"photo.jpeg", variables.userAddress, variables.userStateCity);
    }
}