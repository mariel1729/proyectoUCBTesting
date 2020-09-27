package deviceFactory;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{

    @Override
    public AppiumDriver create() throws MalformedURLException {
        /*CONFIGURACION DE APPIUM  apk */
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","ACCIONE-BT");
        capabilities.setCapability("platformVersion","7");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");

        capabilities.setCapability("platformName","Android");

        //conexion a la pagina se gun configuraicon de appium
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );

        //ponemos en espera en 25 segundo s
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        return driver;
    }
}
