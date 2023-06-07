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
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static telecom.testconfig.BaseSetings.technicalWorks;

public class CctvhomePage{

    public void CheckBody() {



        open("services/cctv-home");     technicalWorks();
        pause(5000);
//        $(withText("Видеонаблюдение в подъезде")).click();
        submitButton();
//        pause(5000);

    }

    @Step("Оставить заявку на подключение")
    public  void submitButton() {
        $$(byAttribute("type","submit")).last().click();
        pause(500);
        $(By.id("phone_number")).setValue("777777787778");
//        $(By.id("initial_phone_input_submit_button")).click();
//        $$(byClassName("videowatch__buttons")).last().$(byTagName("button")).click();
//        pause(500);
//        $(byName("iin")).setValue("111111111111");
//        $(byName("identity_card_id")).setValue("222222222");
//        $(byName("local_id")).setValue("333333");
//        pause(500);
//        $$(byClassName("phone-verification__tabs")).last().$(byTagName("button")).click();
//        $(By.id("videomonitoring___BV_modal_title_")).shouldHave(text("Подключение услуги \"Видеонаблюдение\". Ошибка верификации."));
//        pause(2000);
//
    }
}
