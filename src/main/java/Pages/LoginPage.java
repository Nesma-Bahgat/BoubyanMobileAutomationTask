
package Pages;

import io.appium.java_client.android.AndroidDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LoginPage {
    
      private AndroidDriver driver;
      private WebDriverWait wait;
        
      private By userNameLocator = By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]");
      private By passwordLocator = By.xpath("//android.widget.EditText[@content-desc=\"Password input field\"]");
      private By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]");
      private By noUserDetails = By.xpath("//android.widget.TextView[@text=\"Username is required\"]");  
      private By passwordMissingMessage = By.xpath("//android.widget.TextView[@text=\"Password is required\"]");  
      private By noMatchUserMessage = By.xpath("//android.widget.TextView[@text=\"Provided credentials do not match any user in this service.\"]");  
      private By lockedUserMessage = By.xpath("//android.widget.TextView[@text=\"Sorry, this user has been locked out.\"]");  
      
      public LoginPage(AndroidDriver driver){
          this.driver = driver;
          wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      }
      
      public void enterUserName(String userName){
           driver.findElement(userNameLocator).sendKeys(userName);
      }
      
      public void enterPassword(String password){
          driver.findElement(passwordLocator).sendKeys(password);
      }
      
      public void clearUserName(){
          driver.findElement(userNameLocator).clear();
      }
      
      public void clearPassword(){
          driver.findElement(passwordLocator).clear();
      }
      
      public void clickOnLoginButton(){
          driver.findElement(loginButton).click();
      }
      
      public void checkUserNameisRequiredMessage(){
            Assert.assertEquals(driver.findElement(noUserDetails).getText(),"Username is required" );
      }
      
      public void checkPasswordIsRequiredMessage(){
           Assert.assertEquals(driver.findElement(passwordMissingMessage).getText(), "Password is required");
      }
      
      public void checkNoMatchUserMessage(){
          Assert.assertEquals(driver.findElement(noMatchUserMessage).getText(), "Provided credentials do not match any user in this service.");
      }
      
      public void checkBlockedUserMessage(){
          Assert.assertEquals(driver.findElement(lockedUserMessage).getText(), "Sorry, this user has been locked out.");
      }
}
