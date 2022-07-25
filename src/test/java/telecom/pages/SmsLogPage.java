package telecom.pages;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.SelenideDriver;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static telecom.testconfig.BaseSetings.pause;

import org.junit.Test;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
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
    private SelenideDriver browser1;
    private SelenideDriver browser2;
    @Test
    public void CheckBody() {

        System.out.println(getsmscode(login));

    }


    @Step("Получение кода смс через админку (для сброса пароля)")
    public String getsmscode(String login) {
        //-------------------------------



//        browser1 = new SelenideDriver(new SelenideConfig().browser(browser));
        browser2 = new SelenideDriver(new SelenideConfig().browser(browser));


//        browser1.open("https://google.com");
        browser2.open("https://app.telecom.kz/camp/auth/login");

//        browser1.$(h1).shouldHave(text("Google"));
//        browser2.$(h1).shouldHave(text("Yandeks"));

//
//        Robot r = null;
//        try {
//            r = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_T);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_T);
//        switchTo().window(1);
//        open("https://app.telecom.kz/camp/auth/login");
//        switchTo().window(1); // создаем новую вкладку и переключаемся на неё
        //-------------------------------

        String row;
        String sms, smscode;
        loginAdm();
        pause(1000);
        browser2.open("https://app.telecom.kz/camp/sms-logs");
        pause(3000);

        row = browser2.$$(byAttribute("role", "row")).find(text(login)).getAttribute("aria-rowindex");
        sms = browser2.$(byAttribute("aria-rowindex", row)).$(byAttribute("aria-colindex", "4")).getText();

        smscode = sms.substring(sms.indexOf("Code") + 6, sms.indexOf("Code") + 12);

//        pause(1000);

        browser2.close();
//        switchTo().window(getWebDriver().getWindowHandle()).close(); //закрываем вкладку
//        switchTo().window(0);

        pause(1000);
        return smscode;
    }

    @Step("Авторизация в админке")
    public void loginAdm() {
        browser2.open("https://app.telecom.kz/camp/auth/login");
        browser2.$(by("type", "email")).setValue("root@telecom.kz");
        browser2.$(by("type", "password")).setValue("sn7T7TTXHmaFwySH");
        browser2.$(by("type", "submit")).click();

    }


}
