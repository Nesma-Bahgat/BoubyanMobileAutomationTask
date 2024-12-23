
import Pages.HomePage;
import Pages.LoginPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;


public class DemoTask extends BaseTest{
    
    @Test(priority = 1)
    @Description("Login With Empty Username and Empty password")
    public void loginWithEmptyData(){
            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            homePage.clickOnBreadcrumb();
            homePage.clickOnLoginButtonFromMenu();
            loginPage.clickOnLoginButton();
            loginPage.checkUserNameisRequiredMessage();
            System.out.println("No User Details Case");
    }
    
    @Test(priority = 2)
    @Description("Login with empty password Only and valid username")
    public void loginWithEmptyPassword(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("bob@example.com");
            loginPage.clickOnLoginButton();
            loginPage.checkPasswordIsRequiredMessage();
            loginPage.clearUserName();
            System.out.println("No Password Case");
    }
    
    @Test(priority = 3)
    @Description("Login with empty Username and valid password")
    public void loginWithEmptyUserName(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterPassword("10203040");
            loginPage.clickOnLoginButton();
            loginPage.checkUserNameisRequiredMessage();
            loginPage.clearPassword();
            System.out.println("No Username exists Case");
}
    
    @Test(priority = 4)
    @Description("Login with valid Username aand invalid password")
    public void loginwithvalidUserNameAndInvalidPassword(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("bob@example.com");
            loginPage.enterPassword("1234");
            loginPage.clickOnLoginButton();
            loginPage.checkNoMatchUserMessage();
            loginPage.clearUserName();
            loginPage.clearPassword();
            System.out.println("Valid username and invalid Password Case");
    }
    
    @Test(priority = 5)
    @Description("Login with user data does not exist in system")
    public void loginwithUserDoesNotExist(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("1@2.com");
            loginPage.enterPassword("f-o-o");
            loginPage.clickOnLoginButton();
            loginPage.checkNoMatchUserMessage();
            loginPage.clearPassword();
            loginPage.clearUserName();
            System.out.println("No User Match Case");
    }
    
    @Test(priority = 6)
    @Description("Login with user blocked from using system")
    public void loginWithBlockedUser(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("alice@example.com");
            loginPage.enterPassword("10203040");
            loginPage.clickOnLoginButton();
            loginPage.checkBlockedUserMessage();
            loginPage.clearPassword();
            loginPage.clearUserName();
            System.out.println("Blocked User Case");
    }
    
    @Test(priority = 7)
    @Description("Login with valid data")
    public void loginWithValidCredentials(){
            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("bob@example.com");
            loginPage.enterPassword("10203040");
            loginPage.clickOnLoginButton();
            homePage.checkproductHeaderIsDisplayed();
            System.out.println("User is login successfully!");
    }
    
    @Test(priority = 8)
    @Description("Logout")
    public void logOut(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBreadcrumb();
        homePage.logOut();
        System.out.println("User is logged out successfully!");
}
}

