package ssessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import org.junit.After;

import java.net.MalformedURLException;

public class Session {
    private static Session session = null;
    private AppiumDriver driver;

    private Session() throws MalformedURLException {
        //driver = FactoryDevice.make("browserStack").create();
        driver = FactoryDevice.make("browserStack").create();
    }

    public static Session getInstance() throws MalformedURLException {
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeSession() {
        driver.quit();
        session = null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }
    @After
    public void after(){
       this.driver.quit();
    }

}
