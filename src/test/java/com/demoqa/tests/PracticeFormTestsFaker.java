package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.Variables.*;

public class PracticeFormTestsFaker extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void fillFormTest() {
        registrationPage
                .openPage()
                .removeBanner()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setUserNumber(userNumber)
                .setBirthDate(userBirthDay,userBirthdayMonth,userBirthdayYear)
                .setSubjects(userSubject)
                .setHobbies(userHobby)
                .setAddress(userAddress)
                .uploadFile("photo.jpeg")
                .selectState(userState)
                .selectCity(userCity)
                .submitInformation()
                .checkResult(userFullName,userEmail, userGender, userNumber,  userFullBirthday,
                        userSubject, userHobby,"photo.jpeg", userAddress, userStateCity);

    }
}
