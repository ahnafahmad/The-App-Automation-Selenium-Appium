import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Setup {

    AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:platformName", "Android");
    cap.setCapability("appium:platformVersion", "12.0");
        cap.setCapability("appium:appPackage", "com.appiumpro.the_app");
        cap.setCapability("appium:appActivity", "com.appiumpro.the_app.MainActivity");
        cap.setCapability("appium:app", "E:\\Softwares\\TheApp.apk");
        cap.setCapability("appium:automationName", "UiAutomator2");


//        cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

//    @AfterTest
    public void closeApp(){
        driver.quit();
    }

}
