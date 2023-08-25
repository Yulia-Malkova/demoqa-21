package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TextBoxTests extends RemoteTestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    @Tag("remote")
    @DisplayName("Успешная регистрация при сабмите в текстовую форму")
    void fillFormTest() {
        step("Открываем страницу с простой текстовой формой", () -> {
            textBoxPage
                    .openPage();
        });
        step("Заполняем форму", () -> {
            textBoxPage
                    .setUserName("Julia Malkova")
                    .setEmail("jm@test.ru")
                    .setCurrentAddress("Random address")
                    .setPermanentAddress("Random address 2");
        });
        step("Делаем сабмит", () -> {
            textBoxPage
                    .submitInformation();
        });
        step("Проверяем записанные данные", () -> {
            textBoxPage
                    .check("Julia Malkova", "jm@test.ru", "Random address", "Random address 2");
        });
    }
}
