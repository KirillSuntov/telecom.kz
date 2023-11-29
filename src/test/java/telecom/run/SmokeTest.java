package telecom.run;

import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import telecom.pages.Adm;
import telecom.testconfig.BaseSetings;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class SmokeTest extends BaseSetings {

    @Test
    @DisplayName("Доступность портала")//
    public void checMainPage() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
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


//    # Unregister Push Token
//# mutation {
//#     pushNotifications {
//#         unregisterToken(customerId: 291234, platform: "ios", deviceId: "123123") {
//#             result
//#         }
//#     }
//# }


//# Register Token
//# mutation {
//#   pushNotifications {
//#     registerToken(
//                    #       token: "dpYmJBv3YERHh5JuJ2m5dd:APA91bEVsfP3Ir9TQ9Yqc5Pa3LX4H37-_jF8xAIQAuJr204Gyhv7mT1v7a385A-fNxrad-tDGMx_HSOSsESdEJBTPu7vZfAGFACb_qhGHnLFFtDtjpVwA00lV3k4sweDhvOAfzL4QnXd"
//#       customerId: 291234
//#       platform: "ios"
//#       deviceId: "123123"
//#     ) {
//#       token
//#       platform
//#       deviceId
//#       customerId
//#     }
//#   }
//# }

//# GetNotificationsSetting
//# {
//#   pushNotifications {
//#     getNotificationSetting(customerId: 291234, deviceId: "123123") {
//#       customerId
//#       deviceId
//#       status
//#     }
//#   }
//# }
//
//# UpdateNotificationSetting
//# mutation {
//#   pushNotifications {
//#     updateNotificationSetting(customerId: 291234, deviceId: "123123", status: -1) {
//#       customerId
//#       deviceId
//#       status
//#     }
//#   }
//# }
//
//# GetUnreadNotificationsCount
//# {
//#     pushNotifications {
//#         unreadNotificationsCount(customerId: 291234, deviceId: "123123") {
//#             count
//#         }
//#     }
//# }
//
//# UpdateNotificationsStatus
//# mutation {
//#   pushNotifications {
//#     updateNotificationsStatus(
//                    #       notificationIds: [10]
//#       status: 2
//#       deviceId: "123123"
//#       customerId: 291234
//#     ) {
//#       result
//#     }
//#   }
//# }
//
//#
    @Test
    @DisplayName("Проверка главной страницы")
    public void checkMain() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.mainPage().CheckHeaderRu();
        adm.mainPage().CheckFooterRu();
        adm.mainPage().CheckHeaderKk();
        adm.mainPage().CheckFooterKk();
    }


    @Test
    @DisplayName("Проверка страницы мобильного приложения")
    public void checkMobile() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.mobilePage().CheckBody();
    }

    @Test
    @DisplayName("Проверка страницы детализации")
    public void checkDetails() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.logInLk2(login, password);
//        adm.lkPage().CheckLk1();
//
        adm.detailsPage().CheckDetails();

    }

    @Test
    @DisplayName("Проверка детализированного баланса")
    public void detailedBalance() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.detailedBalance().PostPayCheck();
        pause(30000);
        adm.logInLk2(login2, password2);
        adm.detailedBalance().PrePayCheck();
    }


    @Test
    @DisplayName("Проверка страницы \"Видеонаблюдение в подъезде\"")
    public void checkCctv() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.cctvhomePage().CheckBody();
    }

    @Test
    @DisplayName("Проверка возможности оплаты через неавторизованную зону (без подтверждения оплаты)")
    public void payPage() {
        Adm adm = new Adm();
        adm.paymentPage().Payment();
    }
//
//    @Test
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
        open("ru/");technicalWorks();
        adm.mainPage().CheckOnlineCommunications();
    }

    @Test
    @DisplayName("Проверка технической возможности подключения")
    public void checkTechnicalCheck() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.technicalCheckPage().CheckBody();
        pause(1000);
    }


    @Test
    @DisplayName("Проверка страницы клиенсткого оборудования")
    public void checkClientEquip() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.clientEquipPage().CheckBody();
        pause(1000);
    }

    @Test
    @DisplayName("Проверка страницы контакты")
    public void checkContacts() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
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

//    @Test
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
        open("ru/");technicalWorks();
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
    @DisplayName("Проверка замены SIM-карты")
    public void replaceSimPage() {
        Adm adm = new Adm();
        adm.logInLk2(login, password);
        adm.replaceSimPage().CheckAll();

    }

    @Test
    @DisplayName("Процесс онбординга до проверки документов")
    public void onboardingPage() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.onboardingPage().CheckAll();

    }

    @Test
    @DisplayName("Проверка подключения FWA")
    public void fwaltePage() {
        Adm adm = new Adm();
        open("ru/");technicalWorks();
        adm.fwaltePage().CheckAll();

    }

    @Test
    @DisplayName("Процесс автооплаты")
    public void autopaymentPage() {
        Adm adm = new Adm();
        adm.autoPaymentPage().CreateAutoPayment();
        adm.autoPaymentPage().UpdateAutoPayment();
        adm.autoPaymentPage().DeleteAutoPayment();
    }

}


