package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static telecom.testconfig.BaseSetings.pause;

public class ReplaceSimPage {
    public void CheckAll() {
        checkbutton();
        checkgoal();
        checkinstruction();
        checkimage();
        replaceSIM();
    }

    @Step("Проверка наличия кнопок на странице 'Мои услуги'")
    public void checkbutton() {

        $(withText("Keremet Mobile 3")).shouldBe(visible);//ожидаем прогрузку услуг
        if ( $$(byClassName("kt-my-services__options_button")).size()<8) {
            Assert.fail("Кнопки не отобразились");
        }

    }

    @Step("Проверка блока 'Для чего нужна замена SIM-карты?'")
    public void checkgoal() {

        $$(byClassName("kt-my-services__options_button")).last().click();
        $(withText("Замена SIM-карты")).shouldBe(visible);//ожидаем прогрузку страницы замены SIM-карт
        pause(4000);
        $(byXpath("//*[@class='replace-sim-block__collapse-faq collapsed']")).shouldBe(visible).click();
        if ($$(byXpath("//*[@class='list']/li")).size() < 4) {
            Assert.fail("Пункты блока 'Замена SIM-карты требуется в случаях:' не отобразились");
        }

    }

    @Step("Проверка инструкции замены SIM-карты")
    public void checkinstruction() {

        $(withText("Для успешной замены sim карты:")).shouldBe(visible);
        if ($$(byXpath("//*[@class='replace-sim-block__desc']/ol/li")).size() < 3) {
            Assert.fail("Пункты блока 'Для успешной замены sim карты:' не отобразились");
        }
        $(byClassName("replace-sim-block__info")).shouldHave(text("100 ₸"));

    }

    @Step("Проверка содержимого изображения SIM-карты")
    public void checkimage() {

        $$(byClassName("replace-sim-card")).get(1).shouldBe(visible);
        $(byXpath("(//*[@class='replace-sim-card__top'])[2]")).shouldBe(visible);
        $(byXpath("(//*[@class='replace-sim-card__bottom'])[2]")).shouldBe(visible);
        $(byXpath("(//*[@class='replace-sim-card__sim'])[2]")).shouldBe(visible);
        $(byXpath("(//*[@class='replace-sim-card__desc'])[2]")).shouldBe(visible);

    }

    @Step("Проверка замены SIM-карты")
    public void replaceSIM() {

        $(byXpath("//*[@class='ui-form__group']/button")).shouldHave(disabled);
        $(byId("sim_code")).setValue("11111111111111111111");
        $(byXpath("//*[@class='ui-button ui-button--primary']")).click();
        $(byClassName("kt-my-services__roaming__modalBody")).shouldBe(visible);
        $(byClassName("kt-my-services__roaming__modalFooterButton")).click();
        pause(3000);

        if ( $$(byClassName("kt-my-services__roaming__modalBody")).size()>0.1) {
            Assert.fail("Модалка 'Некорректно введен номер SIM-карты.' не закрылась");
        }

    }

}
