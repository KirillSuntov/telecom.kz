package telecom.pages;

import com.codeborne.selenide.Browser;
import io.qameta.allure.Step;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static telecom.testconfig.BaseSetings.pause;

import org.junit.Test;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import telecom.testconfig.BaseSetings;

//import sapasoft.reg.testconfigs.BaseSetings;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;


public class SmsLogPage extends BaseSetings {
    @Test
    public void CheckBody() {

        System.out.println(getsmscode(login));

    }


    @Step("Получение кода смс через админку (для сброса пароля)")
    public String getsmscode(String login) {
        //-------------------------------
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        switchTo().window(1);
        open("https://app.telecom.kz/camp/auth/login");
        switchTo().window(1); // создаем новую вкладку и переключаемся на неё
        //-------------------------------

        String row;
        String sms, smscode;
        loginAdm();
        pause(1000);
        open("https://app.telecom.kz/camp/sms-logs");
        pause(3000);

        row = $$(byAttribute("role", "row")).find(Condition.text(login)).getAttribute("aria-rowindex");
        sms = $(byAttribute("aria-rowindex", row)).$(byAttribute("aria-colindex", "4")).getText();

        smscode = sms.substring(sms.indexOf("Code") + 6, sms.indexOf("Code") + 12);

//        pause(1000);


        switchTo().window(getWebDriver().getWindowHandle()).close(); //закрываем вкладку
        switchTo().window(0);

        pause(1000);
        return smscode;
    }

    @Step("Авторизация в админке")
    public void loginAdm() {
        open("https://app.telecom.kz/camp/auth/login");
        $(by("type", "email")).setValue("root@telecom.kz");
        $(by("type", "password")).setValue("sn7T7TTXHmaFwySH");
        $(by("type", "submit")).click();

    }


}
