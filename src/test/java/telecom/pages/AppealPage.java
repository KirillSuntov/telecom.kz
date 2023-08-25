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


public class AppealPage {

    public void CheckBody() {
//        open("customer/orders/histories/communications");


        SendAppeal("Качество сервиса");
//        SendAppeal("Вопросы по начислениям");
//        SendAppeal("Качество основных услуг");
    }

    @Step("Создание обращения с типом {0}")
    public void SendAppeal(String typeAppeal) {
//        open("customer/orders/histories/communications");
        $(byText("Мои обращения")).click();
        $(byText("Создать обращение")).click();
        $(byText(typeAppeal)).click();
        if ($(byId("service")).isDisplayed()){
            $(byId("service")).selectOption(0);
            $(byId("reason")).selectOption(0);
        }
        $(byTagName("textarea")).setValue("автоматическая тестовая заявка, звонить не требуется");
        $(by("type","submit")).click();
        pause(1000);
        $(byText("Ваше обращение успешно принято")).click();
    }

}
