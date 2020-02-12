package com.example.demo;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

//import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleTest {

    @Test
    void testOpenGoogle() {
        Selenide.open("http://google.com");
        Selenide.$(By.xpath("//input[@name='q']")).setValue("Hello world").pressEnter();

        Selenide.$(By.partialLinkText("wikipedia")).shouldHave(text("Hello world!"));
    }



}
