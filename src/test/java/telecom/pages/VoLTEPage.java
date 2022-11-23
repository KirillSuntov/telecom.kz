package telecom.pages;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class VoLTEPage {
    public void CheckBody() {
        refresh();
        Configuration.browserSize = "1300x1080";
        open("");
        routetotheVolte();
        textcontentVolteCheck();
        imagecontentVolteCheck();
        VoLTEDevicesList();
        collapselistsCheck();
    }

    @Step("Путь на страницу VolTE")
    public void routetotheVolte() {
        $$(byClassName("main-menu__navigation-link")).last().click();
        pause(500);
        $("title").shouldHave(attribute("text",
                "VoLTE – технология улучшения качественной связи!"));
    }

    @Step("Проверка текста на странице")
    public void textcontentVolteCheck() {
        $(byText("Услышать можно всё!")).shouldBe(visible);
        $(byText("Технология VoLTE доступна для абонентов Казахтелеком только на сети ALTEL"))
                .shouldBe(visible);
        $(byText("Что такое технология")).shouldBe(visible);
        $$(byText("Голос звучит чисто")).last().shouldBe(visible);
        $(byText("Два в одном")).shouldBe(visible);
        $(byText("Молниеносный дозвон")).shouldBe(visible);
        $(byText("И никакой доплаты")).shouldBe(visible);
        $(byText("Дополнительная информация")).shouldBe(visible);
        $(byText("Производители, поддерживающие")).shouldBe(visible);
    }

    @Step("Проверка изображений на странице")
    public void imagecontentVolteCheck() {
        $(By.className("volte__header")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/microphone.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/phone.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/storm.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/like.png']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/phone-icon.svg']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/double-phone-icon.svg']")).shouldBe(visible);
        $(byXpath("//img[@src='/img/main/volte/phone-plus-icon.svg']")).shouldBe(visible);
        $$(byXpath("//img[@src='/img/main/volte/huawei_logo.svg']")).first().shouldBe(visible);
        $$(byXpath("//img[@src='/img/main/volte/samsung_logo.svg']")).first().shouldBe(visible);
        $$(byXpath("//img[@src='/img/main/volte/oppo_logo.svg']")).first().shouldBe(visible);
        pause(1000);
    }

    @Step("Список моделей поддреживающих VoLTE")
    public void VoLTEDevicesList() {
//      SAMSUNG
        $$(byText("посмотреть список моделей")).first().click();
        pause(1000);
        $$(byClassName("volte__faq__title")).get(6).click();
        pause(500);
        $(byText("Galaxy A71 (SM-A715F/DS) Galaxy A31 (SM-A315F/DS)")).shouldBe(visible);
        $$(byClassName("volte__faq__title")).get(6).click();
        pause(500);

//      HUAWEI
        $$(byClassName("volte__faq__title")).get(7).click();
        pause(500);
        $$(byText("Huawei P40 (ANA-NX9-1)")).last().shouldBe(visible);
        $$(byClassName("volte__faq__title")).get(7).click();
        pause(500);

//      OPPO
        $$(byClassName("volte__faq__title")).get(8).click();
        pause(500);
        $$(byText("Oppo A16 (86459105)")).last().shouldBe(visible);
        $$(byClassName("volte__faq__title")).get(8).click();
        pause(500);

//      Проверка кнопок закрытия
        $(byText("Закрыть")).click();
        $(byXpath("//img[@src='img/main/volte/close.svg']")).shouldNotBe(visible);
        pause(500);
        $$(byText("посмотреть список моделей")).first().click();
        pause(1000);
        $(byXpath("//img[@src='img/main/volte/close.svg']")).shouldBe(visible);
        $(byXpath("//img[@src='img/main/volte/close.svg']")).click();
        $(byXpath("//img[@src='img/main/volte/close.svg']")).shouldNotBe(visible);
        pause(500);
    }

    @Step("Проверка раскрывающихся списков")
    public void collapselistsCheck() {
        $$(byClassName("volte__questions__title")).get(1).click();
        pause(500);
        $(byText("Набор USSD команды")).shouldBe(visible);
        pause(500);
        $$(byClassName("volte__questions__title")).get(1).click();

        $(byText("Как активировать VoLTE?")).click();
        pause(500);
        $(byText("Смартфон присутствует на сайте в списке поддерживаемых устройств. Также придет SMS-уведомление;"))
                .shouldBe(visible);
        $(byText("Как активировать VoLTE?")).click();
    }
}
