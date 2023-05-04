package telecom.run;

import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import telecom.pages.Adm;
import telecom.testconfig.BaseSetings;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class SmokeTest extends BaseSetings {

    @Test
    @DisplayName("Доступность портала")//
    public void checMainPage() {
        Adm adm = new Adm();
        open("ru/");
        adm.mainPage().CheckHeaderRu();
        adm.mainPage().CheckFooterRu();
        adm.mainPage().CheckHeaderKk();
        adm.mainPage().CheckFooterKk();
    }

    //
    @Test
    @DisplayName("Проверка авторизации ЛК2")
    public void checkLoginLk2() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.lkPage().CheckLk1();
    }

//    @Test
//    @DisplayName("Проверка восстановления пароля ЛК2")
//    public void checkResetPassword() {
//        Adm adm = new Adm();
//
//        adm.resetPage().reset(login, password);
//        pause(1000);
////        adm.logInLk2(login, password);
////        adm.lkPage().CheckLk1();
//    }
//
    @Test
    @DisplayName("Проверка верификации пользователя ЛК2")
    public void checkVerificationLk2() {
        Adm adm = new Adm();
        adm.resetPage().verification();
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
        open("ru/");
        adm.mainPage().CheckHeaderRu();
        adm.mainPage().CheckFooterRu();
        adm.mainPage().CheckHeaderKk();
        adm.mainPage().CheckFooterKk();
    }


    @Test
    @DisplayName("Проверка страницы мобильного приложения")
    public void checkMobile() {
        Adm adm = new Adm();
        open("ru/");
        adm.mobilePage().CheckBody();
    }

    @Test
    @DisplayName("Проверка страницы детализации")
    public void checkDetails() {
        Adm adm = new Adm();
        open("ru/");
        adm.logInLk2(login, password);
//        adm.lkPage().CheckLk1();
//
        adm.detailsPage().CheckDetails();
    }

    @Test
    @DisplayName("Проверка страницы \"Видеонаблюдение в подъезде\"")
    public void checkCctv() {
        Adm adm = new Adm();
        open("ru/");
        adm.cctvhomePage().CheckBody();
    }

    @Test
    @DisplayName("Проверка возможности оплаты через неавторизованную зону (без подтверждения оплаты)")
    public void payPage() {
        Adm adm = new Adm();
        adm.paymentPage().Payment();
    }
//
    @Test
    @DisplayName("Проверка возможности оплаты через ЛК (без подтверждения оплаты)")
    public void LKpayPage() {
        Adm adm = new Adm();
        adm.logInLk2(login, password); //
        adm.paymentPage().PaymentLK();
    }


    @Test
    @DisplayName("Проверка онлайн каналов связи")
    public void checkMainOnlineCommunications() {
        Adm adm = new Adm();
        open("ru/");
        adm.mainPage().CheckOnlineCommunications();
    }

    @Test
    @DisplayName("Проверка технической возможности подключения")
    public void checkTechnicalCheck() {
        Adm adm = new Adm();
        open("ru/");
        adm.technicalCheckPage().CheckBody();
        pause(1000);
    }


    @Test
    @DisplayName("Проверка страницы клиенсткого оборудования")
    public void checkClientEquip() {
        Adm adm = new Adm();
        open("ru/");
        adm.clientEquipPage().CheckBody();
        pause(1000);
    }

    @Test
    @DisplayName("Проверка страницы контакты")
    public void checkContacts() {
        Adm adm = new Adm();
        open("ru/");
        adm.contactsPage().CheckBody();
        pause(1000);
    }


    @Test
    @DisplayName("Проверка создания обращений")
    public void checkAppeal() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.appealPage().CheckBody();
        pause(5000);
    }

//       @Test
//    @DisplayName("Проверка подключения дополнительных услуг")
//    public void checkVas() {
//        Adm adm = new Adm();
//        adm.logInLk2(login, password); //
////           $(byCssSelector("body")).sendKeys(Keys.CONTROL + "t");
//        adm.vasPage().CheckALL();
//    }

    @Test
    @DisplayName("Проверка страницы E-sim")
    public void checkEsim() {
        Adm adm = new Adm();
        adm.esimPage().CheckBody();
        pause(2000);
    }

//    @Test
//    @DisplayName("Проверка функционала видеонаблюдения")
//    public void cctvFun() {
//        Adm adm = new Adm();
//        Adm.cctvlogInlk2(cctvlogin, cctvpassword);
//        pause(1000);
//        adm.cctvFun().CheckBody();
//
//    }
    @Test
    @DisplayName("Проверка создания заявки на отключение услуги")
    public void discrequestButton() {
        Adm adm = new Adm();
        Adm.realnikitalogInlk2(realnikitalogin, realnikitapassword);
        pause(5000);
        adm.discrequestButton().CheckBody();
    }

//    @Test
//    @DisplayName("Проверка лэндинга VoLTE")
//    public void voLTEPage() {
//        Adm adm = new Adm();
//        Adm.voLTEPage().CheckBody();
//    }

    @Test
    @DisplayName("Проверка главной страницы с эмуляцией мобильного устройства")
    public void mainPageFromMobile() {
//        Configuration.browserSize = "360x740";
        Adm adm = new Adm();
        open("ru/");
        adm.mainPageFromMobile().CheckHeaderRu();
        adm.mainPageFromMobile().CheckFooterRu();
        adm.mainPageFromMobile().CheckHeaderKk();
        adm.mainPageFromMobile().CheckFooterKk();
//        Configuration.browserSize = "1300x1080";
    }

    @Test
    @DisplayName("Проверка функционала ОВН (Внутри ЛК)")
    public void newCCTVFunctional() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.newCCTVFunctional().WholeCCTV();
    }



    @Test
    @DisplayName("Проверка подключения роуминга")
    public void roamingPage() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.roamingPage().CheckAll();

    }

    @Test
    @DisplayName("Процесс онбординга до проверки документов")
    public void onboardingPage() {
        Adm adm = new Adm();
        open("ru/");
        adm.onboardingPage().CheckAll();

    }

    @Test
    @DisplayName("Проверка подключения FWA")
    public void fwaltePage() {
        Adm adm = new Adm();
        open("ru/");
        adm.fwaltePage().CheckAll();

    }

}
