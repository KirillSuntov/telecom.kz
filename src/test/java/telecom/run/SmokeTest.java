package telecom.run;

import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import telecom.pages.Adm;
import telecom.testconfig.BaseSetings;

import static com.codeborne.selenide.Selenide.open;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class SmokeTest extends BaseSetings {

    @Test
    @DisplayName("Доступность портала")
    public void checMainPage() {
        Adm adm = new Adm();
        open("/");
        adm.mainPage().CheckHeader();
        adm.mainPage().CheckFooter();
    }

    //
    @Test
    @DisplayName("Проверка авторизации ЛК2")
    public void checkLoginLk2() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.lkPage().CheckLk1();
    }

    @Test
    @DisplayName("Проверка авторизации ЛК1")
    public void checkLoginLk1() {
        Adm adm = new Adm();
        adm.logInLk1("728 3630378", "KZTelecom2020");

    }

    @Test
    @DisplayName("Проверка главной страницы")
    public void checkMain() {
        Adm adm = new Adm();
        open("/");
        adm.mainPage().CheckHeader();
        adm.mainPage().CheckFooter();
    }


    @Test
    @DisplayName("Проверка страницы мобильного приложения")
    public void checkMobile() {
        Adm adm = new Adm();
        open("/");
        adm.mobilePage().CheckBody();
    }

    @Test
    @DisplayName("Проверка страницы детализации")
    public void checkDetails() {
        Adm adm = new Adm();
        open("/");
        adm.logInLk2(login, password);
//        adm.lkPage().CheckLk1();
//
        adm.detailsPage().CheckDetails();
    }

    @Test
    @DisplayName("Проверка страницы \"Видеонаблюдение в подъезде\"")
    public void checkCctv() {
        Adm adm = new Adm();
        open("/");
        adm.cctvhomePage().CheckBody();
    }

    @Test
    @DisplayName("Проверка возможности оплаты через неавторизованную зону (без подтверждения оплаты)")
    public void payPage() {
        Adm adm = new Adm();
        adm.paymentPage().Payment();
    }

    @Test
    @DisplayName("Проверка возможности оплаты через ЛК (без подтверждения оплаты)")
    public void LKpayPage() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        pause(10000);
        adm.paymentPage().PaymentLK();
    }


    @Test
    @DisplayName("Проверка онлайн каналов связи")
    public void checkMainOnlineCommunications() {
        Adm adm = new Adm();
        open("/");
        adm.mainPage().CheckOnlineCommunications();
    }


}
