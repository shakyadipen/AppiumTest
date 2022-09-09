package PhoneCallAutomate;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DialerTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability("appPackage","com.google.android.dialer");
        dc.setCapability("appActivity","com.android.dialer.DialtactsActivity");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,dc);
        Thread.sleep(5000);
        WebElement dialer=driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab"));
        dialer.click();
        Thread.sleep(3000);
        System.out.println("The Dialer is clicked successfully");
        driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        driver.findElement(By.id("com.google.android.dialer:id/eight")).click();
        driver.findElement(By.id("com.google.android.dialer:id/six")).click();
        driver.findElement(By.id("com.google.android.dialer:id/zero")).click();
        driver.findElement(By.id("com.google.android.dialer:id/one")).click();
        driver.findElement(By.id("com.google.android.dialer:id/zero")).click();
        driver.findElement(By.id("com.google.android.dialer:id/five")).click();
        driver.findElement(By.id("com.google.android.dialer:id/four")).click();
        driver.findElement(By.id("com.google.android.dialer:id/three")).click();
        driver.findElement(By.id("com.google.android.dialer:id/one")).click();
        WebElement callButton=driver.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button"));
        callButton.click();



    }
}
