import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class VirtualDevice {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        dc.setCapability(MobileCapabilityType.APP,"D:\\Appium\\apk files\\Learn.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver  driver= new AndroidDriver(url,dc);
        driver.quit();//this will close the appium server


    }
}
