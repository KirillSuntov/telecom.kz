package telecom.pages;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class DiscRequestRedButton {

    public void CheckBody() {
        lkserviceexist();
        potdealCreateLK();
        successullyCreatedPS();
    }

    @Step("Проверка наличия подключенной услуги")
    public void lkserviceexist() {
        $$(byText("VIP iD Net")).first().shouldBe(visible);
        $$(byClassName("kt-my-services__title")).first().shouldHave(text("VIP iD Net"));
    }

    @Step("Создание ПС на отк. услуги")
    public void potdealCreateLK() {
        $(byText("Подать заявку на отключение услуги")).click();
        pause(1000);
        $(byClassName("modal-title")).shouldBe(visible);
        $(byClassName("just_select__head")).click();
        $$(byText("VIP iD Net")).last().click();
        $(byId("phone_number")).clear();
        pause(500);
        $(byId("phone_number")).click();
        $(byId("phone_number")).sendKeys("7751494255");
        pause(1000);
        $(byText("Оставить заявку")).click();
    }

    @Step("Наличие окна об успешно созданной заявке")
    public void successullyCreatedPS() {
        $(byClassName("modal-title")).shouldBe(visible);
        $(byText("Номер заявки:")).shouldBe(visible);
        pause(1000);
        $$(byText("OK")).last().click();
        $(byText("Номер заявки:")).shouldNotBe(visible);
        pause(2000);
    }
}
