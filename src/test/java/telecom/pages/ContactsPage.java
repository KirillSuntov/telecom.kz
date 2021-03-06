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

public class ContactsPage {
    public void CheckBody() {
        open("contacts/list");
//        tabOffice();
//        tabСenter();
        tabFilials();
    }

    @Step("Проверка раздела офисы обслуживания")
    public void tabOffice() {
        tabOfficeCity("Алматы");
        tabOfficeCity("Шымкент");
        tabOfficeCity("Семей");
        tabOfficeCity("Акмолинская область");
        tabOfficeCity("Актюбинская область");
        tabOfficeCity("Алматинская область");
        tabOfficeCity("Атырауская область");
        tabOfficeCity("Восточно-Казахстанская область");
        tabOfficeCity("Жамбылская область");
        tabOfficeCity("Западно-Казахстанская область");
        tabOfficeCity("Карагандинская область");
        tabOfficeCity("Нур-Султан");
        tabOfficeCity("Костанайская область");
        tabOfficeCity("Кызылординская область");
        tabOfficeCity("Мангистауская область");
        tabOfficeCity("Павлодарская область");
        tabOfficeCity("Туркестанская область");
        tabOfficeCity("Северо-Казахстанская область");

    }

    @Step("Проверка наличия адресов по региону ({0})")
    public void tabOfficeCity(String locationName) {
        $$(byClassName("search")).filter(visible).last().setValue(locationName).pressEnter();
        pause(1000);
        System.out.println($$(byClassName("contacts__adress")).size());

        if ($$(byClassName("contacts__adress")).size() < 1) {
            Assert.fail("Адреса офисов не отобразились");
        }
    }

    @Step("Проверка раздела \"Контакт центр\"")
    public void tabСenter() {
        open("contacts/center");

        $$(byClassName("contacts__center__number")).get(0).shouldHave(text("160"));
        $$(byClassName("contacts__center__number")).get(1).shouldHave(text("165"));
        $$(byClassName("contacts__center__number")).get(2).shouldHave(text("195"));

    }

    @Step("Проверка раздела \"Контакты филиалов \"")
    public void tabFilials() {
        open("contacts/filials");
        pause(2000);
        if ($$(byClassName("contacts__filials__item")).size() < 1) {
            Assert.fail("Контакты филиалов не отобразились");
        }

    }

}
