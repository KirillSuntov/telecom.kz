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

public class MobilePage {
    public void CheckBody() {
        $(withText("Мобильное приложение")).click();
        pause(5000);
        CheckImg("mobile__convenient","img/main/mobile/convenient_image.webp");
        CheckImg("mobile__balance","img/main/mobile/balance_image.webp");
        CheckImg("mobile__questions","img/main/mobile/questions__image.webp");


        CheckDownloadLinks(" "," ") ;

    }

    @Step("Проверка ссылок наа сторы")
    public void CheckDownloadLinks(String className, String srcUrl) {

//        System.out.println($(byId("downloadLinks")).$(byTagName("img")).getAttribute("alt"));
       $(byId("downloadLinks")).$(byTagName("img")).getAttribute("src").equals("img/main/mobile/google_play.svg");
        $(byId("downloadLinks")).$(byTagName("img")).getAttribute("alt").equals("google_play");
        if ($(byId("downloadLinks")).$(byTagName("img")).getSize().height<50){
            Assert.fail("Изображение не отображается");
        }
//        $(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().shouldHave(attribute("href", href));
        $(byId("downloadLinks")).$$(byAttribute("target","_blank")).get(0).shouldHave(attribute("href", "https://play.google.com/store/apps/details?id=kz.telecom.app"));

        $(byId("downloadLinks")).$$(byTagName("img")).get(1).getAttribute("src").equals("img/main/mobile/app_store.svg");
        $(byId("downloadLinks")).$$(byTagName("img")).get(1).getAttribute("alt").equals("app_store");
        if ($(byId("downloadLinks")).$$(byTagName("img")).get(1).getSize().height<50){
            Assert.fail("Изображение не отображается");
        }
        $(byId("downloadLinks")).$$(byAttribute("target","_blank")).get(1).shouldHave(attribute("href", "https://apps.apple.com/kz/app/telecom-kz/id1545816005"));


    }

    @Step("Проверка изображения {0}")
    public void CheckImg(String className, String srcUrl) {

        System.out.println($(byClassName(className)).$(byTagName("img")).getAttribute("src"));
        if ( $(byClassName(className)).$(byTagName("img")).getAttribute("src").equals("https://telecom.kz/"+srcUrl)){
//            System.out.println("Корректная ссылка на изображение");
        }
        else{
            Assert.fail("Изменена ссылка на изображение");
        }

        if ($(byClassName(className)).$(byTagName("img")).getSize().height>100){
//            System.out.println("Изображение отображается");
        }
        else{
            Assert.fail("Изображение не отображается");
        }

    }

}
