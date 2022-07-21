package telecom.pages;

import telecom.testconfig.BaseSetings;

public class Adm extends BaseSetings {
    public void logInLk2(String login, String password){
        new Auth().logInLk2(login, password);
    }

    public void logInLk1(String login, String password){
        new Auth().logInLk1(login, password);
    }



    public LKPage lkPage(){
        LKPage lkPage = new LKPage();
        return lkPage;
    }

    public MainPage mainPage(){
        MainPage mainPage = new MainPage();
        return mainPage;
    }

    public MobilePage mobilePage(){
        MobilePage mobilePage = new MobilePage();
        return mobilePage;
    }

    public DetailsPage detailsPage(){
        DetailsPage detailsPage = new DetailsPage();
        return detailsPage;
    }

    public CctvhomePage cctvhomePage(){
        CctvhomePage cctvhomePage = new CctvhomePage();
        return cctvhomePage;
    }

    public PaymentPage paymentPage(){
        PaymentPage paymentPage = new PaymentPage();
        return paymentPage;
    }

    public TechnicalCheckPage technicalCheckPage(){
        TechnicalCheckPage technicalCheckPage = new TechnicalCheckPage();
        return technicalCheckPage;
    }

    public ClientEquipPage clientEquipPage(){
        ClientEquipPage clientEquipPage = new ClientEquipPage();
        return clientEquipPage;
    }

    public ContactsPage contactsPage(){
        ContactsPage contactsPage = new ContactsPage();
        return contactsPage;
    }

    public AppealPage appealPage(){
        AppealPage appealPage = new AppealPage();
        return appealPage;
    }
}
