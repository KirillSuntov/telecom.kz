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


public class ClientEquipPage {
    public void CheckBody() {
//        open("common/client-equip");
        $$(byXpath("//a[@href='/ru/common/internet']")).last().click();   technicalWorks();
        pause(1000);
        $(byXpath("//a[@href='/ru/common/client-equip']")).click();   technicalWorks();
        pause(1000);
        tabCheck("ONT Модемы");
        tabCheck("ADSL Модемы");
        tabCheck("ТВ-Приставки");
        tabCheck("LTE/MI-FI");
        tabCheck("WIFI - Роутер");

    }

    @Step("Проверка вкладки {0}")
    public void tabCheck(String tabName) {

        $(byText(tabName)).click();
        $$(byClassName("rent-card__item")).filter(visible).size();
        if ($$(byClassName("rent-card__item")).filter(visible).size() < 1) {
            Assert.fail("Карточки товаров не отобразились");
        }
    }

}
