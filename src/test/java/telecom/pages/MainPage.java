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

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class MainPage {
    @Step("�������� ������")
    public void CheckHeader() {
        CheckLink("������� �����","https://telecom.kz/ru/");
        CheckLink("�������","https://telecom.kz/#");
        CheckLink("� ��������","https://telecom.kz/ru/about/list");
        CheckLink("���������� � ����������","https://telecom.kz/ru/pages/11893/172452");
        CheckLink("��������","https://telecom.kz/ru/contacts/list");

        CheckLink("�������","https://shop.telecom.kz/?utm_source=websitetelecomkz&utm_medium=shopbutton&utm_campaign=referral&utm_id=telecom");
        CheckLink("��������","https://telecom.kz/ru/common/Ultra-new");
        CheckLink("�����������","https://telecom.kz/ru/common/tvplus");
        CheckLink("�������","https://telecom.kz/ru/common/mobsvyaz-altel");
        CheckLink("������","https://telecom.kz/ru/knowledge/14");
        CheckLink("����� ������","https://telecom.kz/ru/services/volte");
        CheckLink("�����������","https://telecom.kz/ru/services/verification-number");
        CheckLink("��������� ����������","https://telecom.kz/ru/services/mobile");


    }

    @Step("�������� ������")
    public void CheckFooter() {
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("��������")).scrollTo().getAttribute("href"));
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("�����������")).scrollTo().getAttribute("href"));
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("�������")).scrollTo().getAttribute("href"));
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("����� ������")).scrollTo().getAttribute("href"));
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("������")).scrollTo().getAttribute("href"));
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("������ �������")).scrollTo().getAttribute("href"));
        System.out.println("�������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(0).$(withText("�������")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Unibox")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("��������")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("���������")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("�����������")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("���������������")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Wi-Fi Target")).scrollTo().getAttribute("href"));
//        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("Gamer")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("IoT �������� �����")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("��������")).scrollTo().getAttribute("href"));
        System.out.println("������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(1).$(withText("����������")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("������� ��������")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("������� �����������")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("����������")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("����������")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("���������")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("���������� �����")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("���������� � ���������� ����������� �����")).scrollTo().getAttribute("href"));
        System.out.println("����� ����� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(2).$(withText("�������� ��� ���")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("� ��������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("� ���")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("�������� ��������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("���������� � ����������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("���������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("��������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("�������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("��������")).scrollTo().getAttribute("href"));
        System.out.println("� �������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(3).$(withText("�����")).scrollTo().getAttribute("href"));

        System.out.println(" ");

        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("���� ������")).scrollTo().getAttribute("href"));
        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("������ � ���������")).scrollTo().getAttribute("href"));
        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("����������")).scrollTo().getAttribute("href"));
        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("�������� � ������")).scrollTo().getAttribute("href"));
        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("��������� �������")).scrollTo().getAttribute("href"));
        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("������� ������� ��� �� � ��")).scrollTo().getAttribute("href"));
        System.out.println("������ � ��������� "+$(byClassName("footer")).$$(byClassName("footer-list")).get(4).$(withText("���������� ������������")).scrollTo().getAttribute("href"));


    }

    @Step("�������� ������ {0}")
    public void CheckLink(String elementText, String href) {
        if ($(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
            System.out.println("ok "+$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
        } else {
            Assert.fail("������ �� �������������");
        }
    }


    @Step("�������� ������ Footer {0}")
    public void CheckLinkFooter(String elementText, String href, Integer g) {
        if ($(byClassName("footer")).$$(byClassName("footer-list")).get(g).$(withText(elementText)).scrollTo().getAttribute("href").equals(href)) {
            System.out.println("ok "+$(withText(elementText)).scrollTo().getAttribute("href").equals(href));
        } else {
            Assert.fail("������ �� �������������");
        }
    }


}
