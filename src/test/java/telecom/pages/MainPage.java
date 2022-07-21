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
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static com.codeborne.selenide.Configuration.baseUrl;

public class MainPage {


    @Step("Проверка хедера")
    public void CheckHeader() {
        CheckLink("Частным лицам", baseUrl);
//        CheckLink("Бизнесу","https://telecom.kz/#");
        CheckLink("О компании", baseUrl + "about/list");
        CheckLink("Инвесторам и акционерам", baseUrl + "pages/11893/172452");
        CheckLink("Контакты", baseUrl + "contacts/list");

        CheckLink("Магазин", "https://shop.telecom.kz/?utm_source=websitetelecomkz&utm_medium=shopbutton&utm_campaign=referral&utm_id=telecom");
        CheckLink("Интернет", baseUrl + "common/Ultra-new");
        CheckLink("Телевидение", baseUrl + "common/tvplus");
        CheckLink("Телефон", baseUrl + "common/mobsvyaz-altel");
        CheckLink("Помощь", baseUrl + "knowledge/14");
        CheckLink("Новые услуги", baseUrl + "services/volte");
//        CheckLink("Верификация","https://telecom.kz/ru/services/verification-number");
        CheckLink("Мобильное приложение", baseUrl + "services/mobile");


    }

    @Step("Проверка футера")
    public void CheckFooter() {
        CheckLinkFooter("Интернет", baseUrl + "common/Ultra-new", 0);
        CheckLinkFooter("Телевидение", baseUrl + "common/id-tv", 0);
        CheckLinkFooter("Телефон", baseUrl + "common/vugodnaya-mobil-svyazi", 0);
        CheckLinkFooter("Новые услуги", baseUrl + "services/cctv-home", 0);
        CheckLinkFooter("Помощь", baseUrl + "knowledge/14", 0);
//        CheckLinkFooter("Личный кабинет","https://telecom.kz/customer/auth/login",0);
        CheckLinkFooter("Хостинг", "http://idhost.kz/", 0);

        System.out.println(" ");

        CheckLinkFooter("Unibox", "https://www.ismet.kz/ru/services/service-3762-unibox", 1);
        CheckLinkFooter("Интернет", "https://www.ismet.kz/ru/services/service-3349-Internetdlyaofisa", 1);
        CheckLinkFooter("Телефония", "https://www.ismet.kz/ru/services/service-3717-siptelefonija.html", 1);
        CheckLinkFooter("Телевидение", "https://www.ismet.kz/ru/services/service-3353-id_tvdljaofisa", 1);
        CheckLinkFooter("Видеонаблюдение", "https://www.ismet.kz/ru/documents/cctv", 1);
        CheckLinkFooter("Wi-Fi Target", "https://www.ismet.kz/ru/documents/wi-fi-target", 1);
        CheckLinkFooter("IoT Интернет вещей", "https://www.ismet.kz/ru/documents/IoT", 1);
        CheckLinkFooter("Блокчейн", "https://www.ismet.kz/ru/documents/blockchain", 1);
        CheckLinkFooter("Операторам", baseUrl + "operators/12219/172065", 1);

        System.out.println(" ");

        CheckLinkFooter("Новости компании", baseUrl + "news/list/1?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Новости телевидения", baseUrl + "news/list/11?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Публикации", baseUrl + "news/list/3?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Видеоархив", baseUrl + "news/list/6?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Фотоархив", baseUrl + "news/list/7?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Операторам связи", baseUrl + "news/list/9?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Оповещения о проведении технических работ", baseUrl + "news/list/12?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Контакты для СМИ", baseUrl + "pages/11853/171985", 2);

        System.out.println(" ");

        CheckLinkFooter("О компании", baseUrl + "about/list?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("О нас", baseUrl + "pages/12090/171731?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Бизнес", baseUrl + "pages/11843/160211?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Кадровая политика", baseUrl + "pages/11859/172331?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Инвесторам и акционерам", baseUrl + "pages/11893/172452?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Комплаенс", baseUrl + "pages/13695/172465?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Контакты", baseUrl + "contacts/list", 3);
        CheckLinkFooter("Закупки", baseUrl + "purchases?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Аукционы", baseUrl + "auction?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Архив", baseUrl + "pages/12463/172279?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);

        System.out.println(" ");

        CheckLinkFooter("База знаний", baseUrl + "knowledge/14?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Бланки и документы", baseUrl + "knowledge/13?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Справочник", baseUrl + "catalog/11590/171757?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Контакты и адреса", baseUrl + "pages/12263/172099?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Публичный договор", baseUrl + "publications/172460?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Договора для ИП и ЮЛ", baseUrl + "publication/172456", 4);
        CheckLinkFooter("Сертификат безопасности", baseUrl + "publication/172469", 4);

    }

    @Step("Проверка ссылки {0}")
    public void CheckLink(String elementText, String href) {
        $(withText(elementText)).shouldHave(attribute("href", href));


//        if ($(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
//            System.out.println("ok "+$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
//        } else {
//            Assert.fail("Ссылка не соответствует");
//        }
    }

    @Step("Проверка онлайн каналов связи")
    public void CheckOnlineCommunications() {
        socialContactsButtons("Call center", "tel:160");
        socialContactsButtons("Whatsapp", "https://wa.me/77080000160");
        socialContactsButtons("Telegram", "https://t.me/TelecomKZBot");
        socialContactsButtons("Business", "https://www.ismet.kz/");
        socialContactsButtons("Сервис проверки ", "/ru/communications/status");

        defectCrmPopup(); //defectCrmPopup
        defectStatus();
        pause(5000);
    }

    @Step("Проверка кнопок каналов связи {0}")
    public void socialContactsButtons(String elementText, String href) {
        $(byAttribute("href", href)).shouldHave(text(elementText));
    }

    @Step("Оформление заявки на техническую поддержку")
    public void defectCrmPopup() {
        $(byText("Техническая поддержка")).click();
        $(byId("name")).setValue("тестов тест");
        $(byId("phone_number")).setValue("87077777777");
        $(byId("email")).setValue("Test@test.test");
        $(byId("comment")).setValue("тестовая заявка, в рамках проверки функционала");

        $(byId("defectCrmPopup___BV_modal_footer_")).$$(byTagName("button")).last().click();
    }

    @Step("Сервис проверки статуса по заявлениям")
    public void defectStatus() {
        $(byText("Сервис проверки")).click();
        $(byId("communication_id")).setValue("6874488");
        $(byText("Проверить")).click();

    }


    @Step("Проверка ссылки Footer {0}")
    public void CheckLinkFooter(String elementText, String href, Integer g) {
        $(byClassName("footer")).waitUntil(visible, 15000).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().shouldHave(attribute("href", href));

//        if ($(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
//            System.out.println("ok2 "+$(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
//        } else {
//            Assert.fail("Ссылка не соответствует");
//        }
    }


}