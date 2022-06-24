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
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class MobilePage {
    public void CheckBody() {
        $(withText("Мобильное приложение")).click();
        pause(5000);
        CheckImg("mobile__convenient","img/main/mobile/convenient_image.webp");

    }


    public void CheckImg(String className, String srcUrl) {

        System.out.println($(byClassName(className)).$(byTagName("img")).getAttribute("src"));
        if ( $(byClassName(className)).$(byTagName("img")).getAttribute("src").equals("https://telecom.kz/"+srcUrl)){
            System.out.println("Корректная ссылка на изображение");
        }
        else{
            Assert.fail("Изменена ссылка на изображение");
        }

        if ($(byClassName(className)).$(byTagName("img")).getSize().height>100){
            System.out.println("Изображение отображается");
        }
        else{
            Assert.fail("Изображение не отображается");
        }

    }

}
