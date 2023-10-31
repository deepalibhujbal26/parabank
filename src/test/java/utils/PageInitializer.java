package utils;

import Pages.HomePage;
import Pages.RegistrationPage;

public class PageInitializer {

    public static HomePage homePage;
    public static RegistrationPage registrationPage;


    public static void initializerPageObjects() {
        homePage = new HomePage();
        registrationPage = new RegistrationPage();


    }
}
