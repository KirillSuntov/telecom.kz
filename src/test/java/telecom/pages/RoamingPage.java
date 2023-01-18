package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class RoamingPage {
    public void CheckAll() {
        checkbutton();
        checktarif();
    }

    @Step("Проверка наличия кнопок роуминга и детализации")
    public void checkbutton() {
        $(withText("Altel, Тариф \"Практичный\" с закрытым профилем")).shouldBe(visible);//ожидаем прогрузку услуг
        if ( $$(byClassName("kt-my-services__options_button")).size()<6) {
            Assert.fail("Кнопики роуминга не отобразились");
        }
    }

    @Step("Проверка отображения страници роуминга и тарифов")
    public void checktarif() {
        $$(byClassName("kt-my-services__options_button")).first().click();
        $(withText("Условия подключения роуминга")).shouldBe(visible);//ожидаем прогрузку страници роуминга
        pause(4000);
        if ($$(byClassName("kt-my-services__roaming__cardWrapper__card")).size()<4) {
            Assert.fail("Тарифные планы не отобразились");
        }
    }

    @Step("Подключение роуминга")
    public void connectRoaming() {

    }

    @Step("Отключение роуминга")
    public void disconnectRoaming() {

    }

}
