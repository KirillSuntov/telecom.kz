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
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class MainPage {


    @Step("Проверка хедера")
    public void CheckHeader() {
        CheckLink("Частным лицам","https://telecom.kz/ru/");
        CheckLink("Бизнесу","https://telecom.kz/#");
        CheckLink("О компании","https://telecom.kz/ru/about/list");
        CheckLink("Инвесторам и акционерам","https://telecom.kz/ru/pages/11893/172452");
        CheckLink("Контакты","https://telecom.kz/ru/contacts/list");

        CheckLink("Магазин","https://shop.telecom.kz/?utm_source=websitetelecomkz&utm_medium=shopbutton&utm_campaign=referral&utm_id=telecom");
        CheckLink("Интернет","https://telecom.kz/ru/common/Ultra-new");
        CheckLink("Телевидение","https://telecom.kz/ru/common/tvplus");
        CheckLink("Телефон","https://telecom.kz/ru/common/mobsvyaz-altel");
        CheckLink("Помощь","https://telecom.kz/ru/knowledge/14");
        CheckLink("Новые услуги","https://telecom.kz/ru/services/volte");
//        CheckLink("Верификация","https://telecom.kz/ru/services/verification-number");
        CheckLink("Мобильное приложение","https://telecom.kz/ru/services/mobile") ;


    }

    @Step("Проверка футера")
    public void CheckFooter() {
        CheckLinkFooter("Интернет","https://telecom.kz/ru/common/Ultra-new",0);
        CheckLinkFooter("Телевидение","https://telecom.kz/ru/common/id-tv",0);
        CheckLinkFooter("Телефон","https://telecom.kz/ru/common/vugodnaya-mobil-svyazi",0);
        CheckLinkFooter("Новые услуги","https://telecom.kz/ru/services/cctv-home",0);
        CheckLinkFooter("Помощь","https://telecom.kz/ru/knowledge/14",0);
        CheckLinkFooter("Личный кабинет","https://telecom.kz/customer/auth/login",0);
        CheckLinkFooter("Хостинг","http://idhost.kz/",0);

        System.out.println(" ");

        CheckLinkFooter("Unibox","https://www.ismet.kz/ru/services/service-3762-unibox",1);
        CheckLinkFooter("Интернет","https://www.ismet.kz/ru/services/service-3349-Internetdlyaofisa",1);
        CheckLinkFooter("Телефония","https://www.ismet.kz/ru/services/service-3717-siptelefonija.html",1);
        CheckLinkFooter("Телевидение","https://www.ismet.kz/ru/services/service-3353-id_tvdljaofisa",1);
        CheckLinkFooter("Видеонаблюдение","https://www.ismet.kz/ru/documents/cctv",1);
        CheckLinkFooter("Wi-Fi Target","https://www.ismet.kz/ru/documents/wi-fi-target",1);
        CheckLinkFooter("IoT Интернет вещей","https://www.ismet.kz/ru/documents/IoT",1);
        CheckLinkFooter("Блокчейн","https://www.ismet.kz/ru/documents/blockchain",1);
        CheckLinkFooter("Операторам","https://telecom.kz/ru/operators/12219/172065",1);

        System.out.println(" ");

        CheckLinkFooter("Новости компании","https://telecom.kz/ru/news/list/1?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Новости телевидения","https://telecom.kz/ru/news/list/11?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Публикации","https://telecom.kz/ru/news/list/3?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Видеоархив","https://telecom.kz/ru/news/list/6?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Фотоархив","https://telecom.kz/ru/news/list/7?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Операторам связи","https://telecom.kz/ru/news/list/9?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Оповещения о проведении технических работ","https://telecom.kz/ru/news/list/12?utm_source=footer&utm_medium=org&utm_campaign=newlink",2);
        CheckLinkFooter("Контакты для СМИ","https://telecom.kz/ru/pages/11853/171985",2);

        System.out.println(" ");

        CheckLinkFooter("О компании","https://telecom.kz/ru/about/list?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("О нас","https://telecom.kz/ru/pages/12090/171731?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Бизнес","https://telecom.kz/ru/pages/11843/160211?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Кадровая политика","https://telecom.kz/ru/pages/11859/172331?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Инвесторам и акционерам","https://telecom.kz/ru/pages/11893/172452?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Комплаенс","https://telecom.kz/ru/pages/13695/172465?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Контакты","https://telecom.kz/ru/contacts/list",3);
        CheckLinkFooter("Закупки","https://telecom.kz/ru/purchases?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Аукционы","https://telecom.kz/ru/auction?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);
        CheckLinkFooter("Архив","https://telecom.kz/ru/pages/12463/172279?utm_source=footer&utm_medium=org&utm_campaign=newlink",3);

        System.out.println(" ");

        CheckLinkFooter("База знаний","https://telecom.kz/ru/knowledge/14?utm_source=footer&utm_medium=org&utm_campaign=newlink",4);
        CheckLinkFooter("Бланки и документы","https://telecom.kz/ru/knowledge/13?utm_source=footer&utm_medium=org&utm_campaign=newlink",4);
        CheckLinkFooter("Справочник","https://telecom.kz/ru/catalog/11590/171757?utm_source=footer&utm_medium=org&utm_campaign=newlink",4);
        CheckLinkFooter("Контакты и адреса","https://telecom.kz/ru/pages/12263/172099?utm_source=footer&utm_medium=org&utm_campaign=newlink",4);
        CheckLinkFooter("Публичный договор","https://telecom.kz/ru/publications/172460?utm_source=footer&utm_medium=org&utm_campaign=newlink",4);
        CheckLinkFooter("Договора для ИП и ЮЛ","https://telecom.kz/ru/publication/172456",4);
        CheckLinkFooter("Сертификат безопасности","https://telecom.kz/ru/publication/172469",4);

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


    @Step("Проверка ссылки Footer {0}")
    public void CheckLinkFooter(String elementText, String href, Integer g) {
        $(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().shouldHave(attribute("href", href));

//        if ($(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
//            System.out.println("ok2 "+$(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
//        } else {
//            Assert.fail("Ссылка не соответствует");
//        }
    }


}