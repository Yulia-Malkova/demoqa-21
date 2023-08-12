package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTest() {
        textBoxPage
                .openPage()
                .setUserName("Julia Malkova")
                .setEmail("jm@test.ru")
                .setCurrentAddress("Random address")
                .setPermanentAddress("Random address 2")
                .submitInformation()
                .check("Julia Malkova","jm@test.ru","Random address","Random address 2");
    }
}
