
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    
    protected AndroidDriver driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException{
        
          DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8R317MW8A"); // Replace with your device name
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            capabilities.setCapability("appPackage", "com.saucelabs.mydemoapp.rn"); // Your app package
            capabilities.setCapability("appActivity", "com.saucelabs.mydemoapp.rn.MainActivity"); // Your app activity
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

            // Connect to Appium server
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
            System.out.println("App launched successfully!");
            
            
    }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit successfully!");
        }
    }
  }

