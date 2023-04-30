package BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;


public class BaseSetUp {
    public static AppiumDriver<MobileElement> driver;

    public static void setup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(UDID, "RR8M50B5JNA");
            caps.setCapability(PLATFORM_NAME, "Android");
            caps.setCapability(PLATFORM_VERSION, "11.0");
            caps.setCapability(AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(APP_PACKAGE, "com.alfamart.alfagift");
            caps.setCapability(APP_ACTIVITY, "com.alfamart.alfagift.screen.welcome.WelcomeActivity");
            caps.setCapability(NO_RESET, true);

            URL url = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver<>(url, caps);
    }

    public static void teardown() {
            driver.quit();
    }

    public static void reset() {
        driver.resetApp();
    }

    public void click(By by) {
        MobileElement element = driver.findElement(by);
        element.click();
    }

    public void input(By by, String text) {
        MobileElement element = driver.findElement(by);
        element.sendKeys(text);
    }



}
