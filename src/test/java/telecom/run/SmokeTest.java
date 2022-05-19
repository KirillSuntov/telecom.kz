package telecom.run;

import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import telecom.pages.Adm;
import telecom.testconfig.BaseSetings;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)





public class SmokeTest extends BaseSetings{


    @Test
    @DisplayName("Проверка авторизации ЛК2")
    public  void checkLoginLk2() {
        Adm adm =new Adm();
        adm.logInLk2(login, password);
        adm.lkPage().CheckLk1();


    }
    @Test
    @DisplayName("Проверка авторизации ЛК1")
    public  void checkLoginLk1() {
        Adm adm =new Adm();
        adm.logInLk1("728 3630378", "KZTelecom2020");

    }
}
