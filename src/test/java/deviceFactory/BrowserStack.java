package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack implements IDevice{
    public static String userName = "jobs13";
    public static String accessKey = "y8SKWaUXcz5RFAfC7yEE";

    @Override
    public AppiumDriver create() throws MalformedURLException {

           DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("device", "Google Pixel 3");
            caps.setCapability("os_version", "9.0");
            caps.setCapability("project", "proyecto notas");
            caps.setCapability("build", "My First Build");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            caps.setCapability("app", "bs://db1ef7c3aac2c2ee7eb97a3ae2a3629cc74a4f4d");

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

            /* Write your Custom code here */

            //driver.quit();
            return driver;

    }
}
