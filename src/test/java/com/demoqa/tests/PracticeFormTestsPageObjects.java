package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class PracticeFormTestsPageObjects extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void fillFormTest() {
        registrationPage
                .openPage()
                .removeBanner()
                .setFirstName("John")
                .setLastName("Lennon")
                .setEmail("beatles@liverpool.com")
                .setGender("Male")
                .setUserNumber("4412345678")
                .setBirthDate("09","October","1940")
                .setSubjects("Arts")
                .setHobbies("Music")
                .setAddress("Central Park")
                .uploadFile("photo.jpeg")
                .selectState("Haryana")
                .selectCity("Karnal")
                .submitInformation()
                .checkResult("John Lennon","beatles@liverpool.com", "Male", "4412345678", "09 October,1940",
                        "Arts", "Music","photo.jpeg", "Central Park", "Haryana Karnal");

    }
}
