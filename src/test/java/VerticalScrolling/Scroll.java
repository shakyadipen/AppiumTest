package VerticalScrolling;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Scroll {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.APP,"D:\\Appium\\apk files/API Demos.apk");
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,dc);
        Thread.sleep(5000);
        //driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();//this will click continue
        //Thread.sleep(1000);
        //driver.findElement(By.id("android:id/button1")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive")).click();
        //Navigate
        WebElement apiLink=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]"));
        apiLink.click();
        driver.findElements(By.id("android:id/text1")).get(12).click();
        //scroll to Spinner
       //  AndroidElement list=(AndroidElement) driver.findElement(By.id("android:id/text1"));
        //WebElement listItem= driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().description(\"Switches\");"));
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"switches\").instance(0))")).click();
    }
}
