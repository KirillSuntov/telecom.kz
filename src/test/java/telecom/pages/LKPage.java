package telecom.pages;

import io.qameta.allure.Step;
import telecom.testconfig.BaseSetings;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import telecom.testconfig.BaseSetings;
//import sapasoft.reg.testconfigs.BaseSetings;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class LKPage extends BaseSetings {


    @Step("Проверка большой синей штуки")
    public void CheckLk1() {
        $(by("aria-controls", "bigBlue")).shouldHave(exactText("СУНЦОВ КИРИЛЛ ВЯЧЕСЛАВОВИЧ"));
        $(byClassName("bigBlueThing__verified")).shouldHave(exactText("7070310740 Верифицированный номер"));
        $(byClassName("bigBlueThing__details__tariff")).shouldHave(exactText("Тарифный план\n" +"Silver 3SM"));
        $(byClassName("bigBlueThing__details__address")).shouldHave(exactText(" Адрес подключения:\n" +
                "Нур-Султан, ул. Ж.ТАШЕНОВА, д. 8 , кв. 129"));
        System.out.println($(byClassName("bigBlueThing__details__tariff")).getText());
        System.out.println($(byClassName("bigBlueThing__details__address")).getText());


        pause(5000);

    }


}
