package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("John");
        $("#lastName").setValue("Lennon");
        $("#userEmail").setValue("beatles@liverpool.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("4412345678");

        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").click();
        $("select.react-datepicker__month-select").selectOption("October");
        $("select.react-datepicker__year-select").click();
        $("select.react-datepicker__year-select").selectOption("1940");
        $("div.react-datepicker__day.react-datepicker__day--009").click();

        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#currentAddress").setValue("Central Park");
        $("#uploadPicture").uploadFile(new File("src/test/resources/photo.jpeg"));
        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#react-select-3-option-2").click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        $("tbody tr:nth-child(1) td:nth-child(2)").shouldHave(text("John Lennon"));
        $("tbody tr:nth-child(2) td:nth-child(2)").shouldHave(text("beatles@liverpool.com"));
        $("tbody tr:nth-child(3) td:nth-child(2)").shouldHave(text("Male"));
        $("tbody tr:nth-child(4) td:nth-child(2)").shouldHave(text("4412345678"));
        $("tbody tr:nth-child(5) td:nth-child(2)").shouldHave(text("09 October,1940"));
        $("tbody tr:nth-child(6) td:nth-child(2)").shouldHave(text("Arts"));
        $("tbody tr:nth-child(7) td:nth-child(2)").shouldHave(text("Music"));
        $("tbody tr:nth-child(8) td:nth-child(2)").shouldHave(text("photo.jpeg"));
        $("tbody tr:nth-child(9) td:nth-child(2)").shouldHave(text("Central Park"));
        $("tbody tr:nth-child(10) td:nth-child(2)").shouldHave(text("Haryana Karnal"));

    }
}
