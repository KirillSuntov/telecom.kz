package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import telecom.testconfig.BaseSetings;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import telecom.testconfig.BaseSetings;
//import sapasoft.reg.testconfigs.BaseSetings;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static telecom.testconfig.BaseSetings.technicalWorks;

public class EsimPage {

    public void CheckBody() {
        open("");technicalWorks();
        pause(2000);
        routetoEsim();
        imgandtext();
        potentialdeal();
        supporteddevices();
        esimqr();
        esimqrbuttonsandtextcheck();

    }

    @Step("Путь на страницу esim")
    public void routetoEsim() {
        $$(byXpath("//a[@href='/ru/services/volte']")).last().click(); technicalWorks();
        $$(byXpath("//a[@href='/ru/services/e-sim']")).first().click(); technicalWorks();
    }

    @Step("Проверить изображения и текст на странице")
    public void imgandtext() {
        $$(byClassName("eSim__btn")).first().click();
        pause(4000);
        $(byText("eSIM")).getText();
        $(byText("Ваш смартфон может больше!")).getText();
        $(byText("Защита данных")).getText();
        $(byText("Больше места")).getText();
        $(byText("Моментальное переключение")).getText();
        $(byText("Больше не нужны дополнительные телефоны")).getText();
        $(byText("Список устройств поддерживающих")).getText();
        $(byText("Как оформить заказ")).getText();
        $(byText("874")).getText();
        $(byText("1")).getText();
        $(byXpath("//img[@src='img/main/esim/esim.png']")).shouldBe(visible);
        $$(byXpath("//img[@src='img/main/esim/esim_safe_data.png']")).last().shouldBe(visible);
        $$(byXpath("//img[@src='img/main/esim/esim_sim.png']")).first().shouldBe(visible);
        $$(byXpath("//img[@src='img/main/esim/esim_dual_sim.png']")).last().shouldBe(visible);
        $(byXpath("//img[@src='img/main/esim/esim_phone.png']")).shouldBe(visible);
        pause(1000);

//        FAQ

        $$(byXpath("//button[@class='collapsed']")).first().click();
        pause(2000);
        $(byText("1. Убедитесь, что Ваше устройство поддерживает eSIM")).shouldBe(visible);
        pause(1000);
        $(byText("Как активировать профиль eSIM на устройствах Apple?")).click();
        pause(500);
        refresh();
        pause(6000);

    }

    @Step("Кнопки для переноса на пс и функционал ПС")
    public void potentialdeal() {
        $$(byClassName("eSim__btn")).last().click();
        pause(2000);
        $(byXpath("//input[@id='phone_number']")).setValue("7751494255");
//        $$(byXpath("//button[@type='button']")).last().click();
//        $(byText("Вам отправлено смс. Введите код из смс")).shouldBe(visible);
        pause(3000);
        $(byXpath("//i[@class='material-icons rotate-minus-45']")).click();
    }

    @Step("Проверка поддержки устройства")
    public void supporteddevices() {
//  Кейс: устройство поддерживает eSim

        $(byClassName("custom-select")).selectOptionByValue("altel");
        pause(2000);
        $$(byClassName("custom-select")).last().selectOptionByValue("iPhone XS");
        pause(2000);
        $(byText("Проверить")).click();
        pause(1000);
        $(byClassName("eSim__modal__success")).shouldHave(text("Поздравляем,"));
        $(byText("понятно")).click();
        pause(2000);


//  Кейс: устройство не поддерживает eSim
        $(byClassName("custom-select")).selectOptionByValue("activ");
        pause(2000);
        $$(byClassName("custom-select")).last().selectOptionByValue("other");
        pause(2000);
        $(byText("Проверить")).click();
        pause(1000);
        $(byClassName("eSim__modal__failed")).shouldHave(text("к сожалению,"));
        pause(2000);
        $(byText("понятно")).click();
        pause(2000);
    }

    @Step("Переход на страницу eSIM QR")
    public void esimqr() {
        $(byText("Подключить")).click();
        pause(2000);
        $(byText("eSIM")).getText();
    }

    @Step("Проверка кнопок, изображений и текста")
    public void esimqrbuttonsandtextcheck() {
        $(byClassName("eSimQR__button")).shouldBe(visible);
        pause(1000);
        $$(byClassName("eSimQR__button")).last().click();
        $(byClassName("eSimQR__header__svg")).shouldBe(visible);
        $(byText("ИНСТРУКЦИЯ ПОДКЛЮЧЕНИЯ eSim")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone1.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone2.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone3.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone4.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone5.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone6.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/esim/phone7.png']")).shouldBe(visible);
        $(byClassName("eSimQR__price__total")).shouldBe(visible);
    }
}
