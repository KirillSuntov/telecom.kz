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

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
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
        CheckLink("Верификация","https://telecom.kz/ru/services/verification-number");
        CheckLink("Мобильное приложение","https://telecom.kz/ru/services/mobile") ;


    }

    @Step("Проверка футера")
    public void CheckFooter() {
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Интернет")).scrollTo().getAttribute("href"));
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Телевидение")).scrollTo().getAttribute("href"));
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Телефон")).scrollTo().getAttribute("href"));
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Новые услуги")).scrollTo().getAttribute("href"));
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Помощь")).scrollTo().getAttribute("href"));
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Личный кабинет")).scrollTo().getAttribute("href"));
        System.out.println("Интернет "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("Хостинг")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Unibox")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Интернет")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Телефония")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Телевидение")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Видеонаблюдение")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Wi-Fi Target")).scrollTo().getAttribute("href"));
//        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Gamer")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("IoT Интернет вещей")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Блокчейн")).scrollTo().getAttribute("href"));
        System.out.println("Бизнесу "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Операторам")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Новости компании")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Новости телевидения")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Публикации")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Видеоархив")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Фотоархив")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Операторам связи")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Оповещения о проведении технических работ")).scrollTo().getAttribute("href"));
        System.out.println("Пресс центр "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("Контакты для СМИ")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("О компании")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("О нас")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Бизнес")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Кадровая политика")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Инвесторам и акционерам")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Комплаенс")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Контакты")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Закупки")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Аукционы")).scrollTo().getAttribute("href"));
        System.out.println("О компании "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("Архив")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("База знаний")).scrollTo().getAttribute("href"));
        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("Бланки и документы")).scrollTo().getAttribute("href"));
        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("Справочник")).scrollTo().getAttribute("href"));
        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("Контакты и адреса")).scrollTo().getAttribute("href"));
        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("Публичный договор")).scrollTo().getAttribute("href"));
        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("Типовой договор для ЮЛ и ИП")).scrollTo().getAttribute("href"));
        System.out.println("Помощь и поддержка "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("Сертификат безопасности")).scrollTo().getAttribute("href"));


    }

    @Step("Проверка ссылки {0}")
    public void CheckLink(String elementText, String href) {
        if ($(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
            System.out.println("ok "+$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
        } else {
            Assert.fail("Ссылка не соответствует");
        }
    }


    @Step("Проверка ссылки Footer {0}")
    public void CheckLinkFooter(String elementText, String href, Integer g) {
        if ($(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
            System.out.println("ok "+$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
        } else {
            Assert.fail("Ссылка не соответствует");
        }
    }


}
