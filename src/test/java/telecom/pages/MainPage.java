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


    @Step("Проверка хедера на русском языке")
    public void CheckHeaderRu() {
        CheckLink("Частным лицам", "");
//        CheckLink("Бизнесу","https://telecom.kz/#");
        CheckLink("О компании", "about/list");
        CheckLink("Инвесторам и акционерам", "pages/11893/172452");
        CheckLink("Контакты", "contacts/list");

        CheckLinkOut("Магазин", "https://shop.telecom.kz/?utm_source=websitetelecomkz&utm_medium=shopbutton&utm_campaign=referral&utm_id=telecom");
//        CheckLink("Интернет", "common/Ultra-new");
        CheckLink("Телевидение", "common/tvplus");
        CheckLink("Телефон", "common/mobsvyaz-altel");
        CheckLink("Помощь", "knowledge/14");
        CheckLink("Новые услуги", "services/volte");
//        CheckLink("Верификация","https://telecom.kz/ru/services/verification-number");

        CheckLink("Мобильное приложение", "services/mobile");
    }

    @Step("Проверка хедера на казахском языке")
    public void CheckHeaderKk() {
        open("kk/");
//        CheckLink("Жеке тұлғаларға", "");
        CheckLinkKk("Компания туралы", "about/list");
        CheckLinkKk("Инвесторларға, акционерлерге ", "pages/11893/172452");
        CheckLinkKk("Байланыс", "contacts/list");
        CheckLinkKk("Дүкен", "https://shop.telecom.kz/?utm_source=websitetelecomkz&utm_medium=shopbutton&utm_campaign=referral&utm_id=telecom");
        CheckLinkKk("Интернет", "common/Ultra-new");
        CheckLinkKk("Теледидар", "common/tvplus");
        CheckLinkKk("Телефон", "common/mobsvyaz-altel");
        CheckLinkKk("Көмек", "knowledge/14");
        CheckLinkKk("Басқа қызметтер", "services/volte");
        CheckLinkKk("Мобильді қолданба", "services/mobile");
    }

    @Step("Проверка футера на русском языке")
    public void CheckFooterRu() {
        CheckLinkFooter("Интернет", "common/idnet", 0);
        CheckLinkFooter("Телевидение", "common/id-tv", 0);
        CheckLinkFooter("Телефон", "common/vugodnaya-mobil-svyazi", 0);
        CheckLinkFooter("Новые услуги", "services/cctv-home", 0);
        CheckLinkFooter("Помощь", "knowledge/14", 0);
//        CheckLinkFooter("Личный кабинет","https://telecom.kz/customer/auth/login",0);
        CheckLinkFooterOut("Хостинг", "http://idhost.kz/", 0);

        System.out.println(" ");
        CheckLinkFooterOut("Unibox", "https://www.ismet.kz/ru/services/service-3762-unibox", 1);
       CheckLinkFooterOut("Интернет", "https://www.ismet.kz/ru/services/service-3349-Internetdlyaofisa", 1);
       CheckLinkFooterOut("Телефония", "https://www.ismet.kz/ru/services/service-3717-siptelefonija.html", 1);
       CheckLinkFooterOut("Телевидение", "https://www.ismet.kz/ru/services/service-3353-id_tvdljaofisa", 1);
       CheckLinkFooterOut("Видеонаблюдение", "https://www.ismet.kz/ru/documents/cctv", 1);
       CheckLinkFooterOut("Wi-Fi Target", "https://www.ismet.kz/ru/documents/wi-fi-target", 1);
       CheckLinkFooterOut("IoT Интернет вещей", "https://www.ismet.kz/ru/documents/IoT", 1);
       CheckLinkFooterOut("Блокчейн", "https://www.ismet.kz/ru/documents/blockchain", 1);
        CheckLinkFooter("Операторам", "operators/12219/172065", 1);

        System.out.println(" ");

        CheckLinkFooter("Новости компании", "news/list/1?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Новости телевидения", "news/list/11?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Публикации", "news/list/3?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Видеоархив", "news/list/6?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Фотоархив", "news/list/7?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Операторам связи", "news/list/9?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Оповещения о проведении технических работ", "news/list/12?utm_source=footer&utm_medium=org&utm_campaign=newlink", 2);
        CheckLinkFooter("Контакты для СМИ", "pages/11853/171985", 2);

        System.out.println(" ");

        CheckLinkFooter("О компании", "about/list?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("О нас", "pages/12090/171731?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Бизнес", "pages/11843/160211?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Кадровая политика", "pages/11859/172331?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Инвесторам и акционерам", "pages/11893/172452?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Комплаенс", "pages/13695/172465?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Контакты", "contacts/list", 3);
        CheckLinkFooter("Закупки", "purchases?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Аукционы", "auction?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);
        CheckLinkFooter("Архив", "pages/12463/172279?utm_source=footer&utm_medium=org&utm_campaign=newlink", 3);

        System.out.println(" ");

        CheckLinkFooter("База знаний", "knowledge/14?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Бланки и документы", "knowledge/13?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Справочник", "catalog/11590/171757?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Контакты и адреса", "pages/12263/172099?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Публичный договор", "publications/172460?utm_source=footer&utm_medium=org&utm_campaign=newlink", 4);
        CheckLinkFooter("Договора для ИП и ЮЛ", "publication/172456", 4);
        CheckLinkFooter("Сертификат безопасности", "publication/172469", 4);

    }


    @Step("Проверка футера на казахском языке")
    public void CheckFooterKk() {
        open("kk/");
            CheckLinkKk("Интернет", "common/Ultra-new");
            CheckLinkKk("Теледидар", "common/id-tv");
            CheckLinkKk("Телефон", "common/vugodnaya-mobil-svyazi");
            CheckLinkKk("Жаңа қызметтер", "services/cctv-home");
            CheckLinkKk("Көмек", "knowledge/14");
//        CheckLinkKk("Личный кабинет","https://telecom.kz/customer/auth/login",0);
            CheckLinkKk("Хостинг", "http://idhost.kz/");

            System.out.println(" ");
            CheckLinkKk("Unibox", "https://www.ismet.kz/kk/services/service-3762-unibox");
            CheckLinkKk("Интернет", "https://www.ismet.kz/kk/services/service-3349-Internetdlyaofisa");
            CheckLinkKk("Телефония", "https://www.ismet.kz/kk/services/service-3717-siptelefonija.html");
            CheckLinkKk("Теледидар ", "https://www.ismet.kz/kk/services/service-3353-id_tvdljaofisa");
            CheckLinkKk("Видеонаблюдение", "https://www.ismet.kz/kk/documents/cctv");
            CheckLinkKk("Wi-Fi Target", "https://www.ismet.kz/kk/documents/wi-fi-target");
            CheckLinkKk("IoT Интернет заттары ", "https://www.ismet.kz/kk/documents/IoT");
            CheckLinkKk("Блокчейн", "https://www.ismet.kz/kk/documents/blockchain");
            CheckLinkKk("Операторларға ", "operators/12219/172065");

            System.out.println(" ");

            CheckLinkKk("Компанияның жаңалықтары", "news/list/1?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("ТВ Жаңалықтары ", "news/list/11?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Мақалалар", "news/list/3?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Видеомұрағат", "news/list/6?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Фотомұрағат", "news/list/7?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Операторлар", "news/list/9?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Техникалық жұмыстарды өткізу", "news/list/12?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Бақ үшін байланыс", "pages/11853/171985");

            System.out.println(" ");

            CheckLinkKk("Компания туралы", "about/list?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Біз туралы", "pages/12090/171731?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Кәсіпкерлік", "pages/11843/160211?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Кадрлық саясат", "pages/11859/172331?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Инвесторларға, акционерлерге ", "pages/11893/172452?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Комплаенс", "pages/13695/172465?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Байланыстар", "contacts/list");
            CheckLinkKk("Сатып алулар", "purchases?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Аукциондар", "auction?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Мұрағат", "pages/12463/172279?utm_source=footer&utm_medium=org&utm_campaign=newlink");

            System.out.println(" ");

            CheckLinkKk("Білім қоры", "knowledge/14?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Құжаттар", "knowledge/13?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Анықтамалық", "catalog/11590/171757?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Байланыстар", "pages/12263/172099?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("Жария шарт", "publications/172460?utm_source=footer&utm_medium=org&utm_campaign=newlink");
            CheckLinkKk("ЖК және ЗТ үшін шарттар", "publication/172456");
            CheckLinkKk("Қауіпсіздік сертификаты" , "publication/172469");


    }

    @Step("Проверка ссылки {0}")
    public void CheckLink(String elementText, String href) {
        $(withText(elementText)).scrollTo();
        $(withText(elementText)).shouldHave(attribute("href", baseUrl+"ru/" +href));
    }

    @Step("Проверка ссылки {0}")
    public void CheckLinkKk(String elementText, String href) {
        pause(200);
    }

    @Step("Проверка ссылки {0}")
    public void CheckLinkOut(String elementText, String href) {
        $(withText(elementText)).scrollTo();
        $(withText(elementText)).shouldHave(attribute("href", href));
    }



    @Step("Проверка онлайн каналов связи")
    public void CheckOnlineCommunications() {
        socialContactsButtons("Call center", "tel:160");
        socialContactsButtons("Whatsapp", "https://wa.me/77080000160");
        socialContactsButtons("Telegram", "https://t.me/TelecomKZBot");
        socialContactsButtons("Business", "https://www.ismet.kz/");
//        socialContactsButtons("Сервис проверки ", "/ru/communications/status");

        defectCrmPopup(); //defectCrmPopup
//        defectStatus(); //капча
        pause(5000);
    }

    @Step("Проверка кнопок каналов связи {0}")
    public void socialContactsButtons(String elementText, String href) {
        $(byAttribute("href", href)).scrollTo();
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
        $(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().shouldHave(attribute("href", baseUrl+"ru/" +href));
    }

    @Step("Проверка ссылки Footer {0}") //
    public void CheckLinkFooterOut(String elementText, String href, Integer g) {
        $(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().shouldHave(attribute("href", href));
    }

}