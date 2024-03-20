package telecom.pages;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import telecom.testconfig.BaseSetings;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class DetailedBalance extends BaseSetings {
    @Step("Проверка детализации клиента с типом PostPay")
    public void PostPayCheck() {
        checkTitle("PostPay");
        checkThisMonth("PostPay");
        checkNextMonth();
        checkBalance("PostPay");
        checkPayment("https://telecom.kz/ru/payment/dabe/202311?ca=4015145");
        checkPaymentDownloading();
    }
    @Step("Проверка детализации клиента с типом PrePay")
    public void PrePayCheck() {
        checkTitle("");
        checkThisMonth("");
        checkBalance("");
        checkPayment("https://telecom.kz/ru/payment/322c/202311?ca=11430969");
        checkPaymentDownloading();
    }

    @Step("Проверка заголовка модалки 'Детали баланса'")
    public void checkTitle(String a) {

        pause(4000);
        $$(byClassName("bigBlueThing__accounts__link")).get(1).click();
        $(byXpath("(//*[@class='btn-wrapper']/button)[1]")).click();

        if (a == "PostPay") {
            $(byXpath("(//*[@class='title'])[3]")).shouldHave(text("Детали баланса"));
        } else {
            pause(3000);
            $(byXpath("(//*[@class='title'])[4]")).shouldHave(text("Детали баланса"));
        }

        $(byClassName("cards")).shouldBe(visible);

    }

    @Step("Проверка блока с детализацией за текущий месяц")
    public void checkThisMonth(String a) {

        if (a == "PostPay") {
            if ($$(byXpath("(//*[@class='card'])[1]/div")).size() < 4) {
                Assert.fail("Детализация за текущий месяц отобразилась не полностью");
            }
        } else {
            if ($$(byXpath("(//*[@class='card'])[1]/div")).size() < 5) {
                Assert.fail("Детализация за текущий месяц отобразилась не полностью");
            }
        }

    }

    @Step("Проверка блока с детализацией за следующий месяц")
    public void checkNextMonth() {

        if ($$(byXpath("(//*[@class='card'])[2]/div")).size() < 3) {
            Assert.fail("Детализация за следующий месяц отобразилась не полностью");
        }

        $(byXpath("(//*[@class='info_btn collapsed'])[2]")).shouldBe(visible);
        $(byXpath("//*[@aria-controls='descriptionMonth']")).click();
        $(byXpath("//*[@class='info_btn']")).shouldBe(visible);

    }

    @Step("Проверка блока 'Баланс'")
    public void checkBalance(String a) {


        if (a == "PostPay") {
            if ($$(byXpath("(//*[@class='card'])[3]/div")).size() < 3) {
                Assert.fail("Блок 'Баланс' отобразился не полностью");
            } else {
                if ($$(byXpath("(//*[@class='card'])[2]/div")).size() < 3) {
                    Assert.fail("Блок 'Баланс' отобразился не полностью");
                }
            }
        }

        $(byXpath("//*[@class='info_btn collapsed']")).shouldBe(visible);
        $(byXpath("//*[@aria-controls='descriptionBalance']")).click();

        if (a == "PostPay") {
            $(byXpath("(//*[@class='info_btn'])[2]")).shouldBe(visible);
            } else {
            $(byXpath("//*[@class='info_btn']")).shouldBe(visible);
        }

        $(byXpath("//*[@class='btn']")).shouldBe(visible);
        $(byClassName("close-btn")).click();
        $(byXpath("//*[@class='kt-icon kt-icon-person-with-border']")).click();
        $(byXpath("(//*[@class='kt-nav__item_with-icon'])[2]")).click();
    }


    @Step("Проверка квитанции")
    public void checkPayment(String link) {

        open(link);

        pause(3000);

        $(byXpath("//*[@class='payment-top__header']")).shouldBe(visible);

        if ($$(byXpath("//*[@class='payment-top__balance-info__item__name']")).size() < 4) {
            Assert.fail("Верхние строки отобразились не полностью");}

        if ($$(byXpath("//*[@class='payment-body__item']")).size() < 3) {
            Assert.fail("Cредние строки отобразились не полностью");}

        $(byXpath("//*[@class='payment-body__total-summa']")).shouldBe(visible);

        $(byClassName("payment-body__desktop-action")).shouldBe(visible);

        $(byId("bannerReceipt")).shouldBe(visible);

        $(byClassName("payment-body__info")).shouldBe(visible);

        if (link == "https://telecom.kz/ru/payment/322c/202311?ca=11430969") {
            $(byXpath("//*[@class='payment-body__desktop-action']/button")).shouldBe(disabled);}

        if (link == "https://telecom.kz/ru/payment/dabe/202311?ca=4015145") {
            $(byXpath("//*[@class='payment-body__desktop-action']/button")).shouldNotBe(disabled);}

    }

    @Step("Проверка скачивания квитанции")
    public void checkPaymentDownloading() {

        $(byXpath("//*[@class='payment-top__header-download']")).click();
        pause(5000);

        try {

            File f = new File("/var/lib/jenkins/workspace/Telecom_Daily_Test/build/downloads/");
            File[] files = f.listFiles();

            if (files.length > 0) {
                FileUtils.cleanDirectory(f);
            } else {
                Assert.fail("Квитанция не скачалась");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}