package telecom.pages;

import telecom.testconfig.BaseSetings;

public class Adm extends BaseSetings {
    public void logInLk2(String login, String password){
        new Auth().logInLk2(login, password);
    }

    public void logInLk1(String login, String password){
        new Auth().logInLk1(login, password);
    }



    public LKPage lkPage (){
        LKPage lkPage = new LKPage();
        return lkPage;
    }

    public MainPage mainPage (){
        MainPage mainPage = new MainPage();
        return mainPage;
    }

}
