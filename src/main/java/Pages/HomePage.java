
package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
 
    private AndroidDriver driver;
    private WebDriverWait wait;
    
    private By breadCrumb = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
    private By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    private By productsHeader = By.xpath("//android.widget.TextView[@text=\"Products\"]");
    private By logoutButton = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log out\"]");
    private By logoutpPopUpbutton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    private By logoutOKbutton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
  
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
   public void clickOnBreadcrumb(){
       wait.until(ExpectedConditions.elementToBeClickable(breadCrumb)).click();
   }
   
   public void clickOnLoginButtonFromMenu(){
       wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
   }
   
   public void logOut(){
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutpPopUpbutton)).click();   
        wait.until(ExpectedConditions.elementToBeClickable(logoutOKbutton)).click();   
   }
   
   public void checkproductHeaderIsDisplayed(){
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productsHeader)).isDisplayed());                
   }
   
}
