package telecom.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import telecom.testconfig.BaseSetings;
//import sapasoft.reg.testconfigs.BaseSetings;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class Auth extends BaseSetings {



    @Step("����������� � �� 2")
    public Auth logInLk2(String login, String password) {
        open("/");
//        $(byXpath("/html/body/div/div[2]/header/div[2]/div[2]/div/div[1]/a/span")).click();
        $(byText("����")).waitUntil(Condition.visible,15000).click();

        $(byName("phone")).waitUntil(Condition.visible,15000).setValue(login);
        $(by("type","submit")).waitUntil(Condition.visible,15000).click();
        $(byName("password")).waitUntil(Condition.visible,15000).setValue(password);
        $(by("type","submit")).waitUntil(Condition.visible,15000).click();

//        pause(5000);
        return this;
    }

    @Step("����������� � �� 1")
    public Auth logInLk1(String login, String password) {
        open("/");
//        $(byXpath("/html/body/div/div[2]/header/div[2]/div[2]/div/div[1]/a/span")).click();
        $(byText("����")).waitUntil(Condition.visible,15000).click();
        $(byText("���� �� ���������� ������")).waitUntil(Condition.visible,15000).click();

        $(byName("login")).waitUntil(Condition.visible,15000).setValue(login);
//        $(by("type","submit")).waitUntil(Condition.visible,15000).click();
        $(byName("password")).waitUntil(Condition.visible,15000).setValue(password);
        $(by("type","submit")).waitUntil(Condition.visible,15000).click();

        pause(5000);
        return this;
    }

//
//    @Step("����� �� �������")
//    public Auth logOut() {
//        $(By.xpath("//*[@class=\"ant-notification-notice-message\"]")).shouldNotBe(Condition.visible);
//        $(By.xpath("//a/span[text()=\"����� �� �������\"]")).click();
//        $(By.xpath("//a[text()=\"��\"]")).click();
//        $(By.xpath("//p[@id=\"kc-page-title\"]")).shouldHave(Condition.text("        �������� ������ �����������"));
//        return this;
//    }
//
//
//    @Step("������� ������ �����������")
//    public Auth registration() {
//        closeWebDriver();
//        open("/");
//        $(By.xpath("//footer/div[@class=\"kc-portal-back\"]/a")).click();
//
//        return this;
//    }



}
