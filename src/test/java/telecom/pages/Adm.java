package telecom.pages;

import telecom.testconfig.BaseSetings;

public class Adm extends BaseSetings {
    public void logInLk2(String login, String password){
        new Auth().logInLk2(login, password);
    }

    public void logInLk1(String login, String password){
        new Auth().logInLk1(login, password);
    }

    public static void realnikitalogInlk2(String realnikitalogin, String realnikitapassword){
        new Auth().cctvlogInlk2(realnikitalogin, realnikitapassword); }



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

    public ResetPage resetPage(){
        ResetPage resetPage = new ResetPage();
        return resetPage;
    }
    public SmsLogPage smsLogPage(){
        SmsLogPage smsLogPage = new SmsLogPage();
        return smsLogPage;
    }
    public VasPage vasPage(){
        VasPage vasPage = new VasPage();
        return vasPage;
    }

    public EsimPage esimPage(){
        EsimPage esimPage = new EsimPage();
        return esimPage;
    }

//    public CCTVFunctional cctvFun(){
//        CCTVFunctional cctvFun = new CCTVFunctional();
//        return cctvFun;
//    }
    public DiscRequestRedButton discrequestButton(){
        DiscRequestRedButton discrequestButton = new DiscRequestRedButton();
        return discrequestButton;
    }

    public static VoLTEPage voLTEPage(){
        VoLTEPage voLTEPage = new VoLTEPage();
        return voLTEPage;
    }


}
