package ButtonAndInput;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Button {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.APP,"D:\\Appium\\apk files/API Demos.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,dc);
        Thread.sleep(5000);
        //navigate to API demos
        WebElement apiLink=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]"));
        apiLink.click();
        System.out.println("User Clicked Api Demos");
        //Click Views
        driver.findElements(By.id("android:id/text1")).get(12).click();
        //click control
        System.out.println("User Clicked Views");
        Thread.sleep(1000);
        WebElement control=driver.findElements(By.id("android:id/text1")).get(4);
        control.click();
        System.out.println("User clicked Control Button");
        Thread.sleep(2000);
        //select light tgheme
        WebElement theme=driver.findElements(By.id("android:id/text1")).get(0);
        theme.click();
        System.out.println("User selected the theme-Light");
        Thread.sleep(1000);
        //Provide the data
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/edit")).sendKeys("Dipen Shakya");
        System.out.println("User Provide the information");
        //click first checkbox
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/check1")).click();
        System.out.println("User Selected first checkbox");
        //radio button
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/radio1")).click();
        System.out.println("User Selected first radio button");
        Thread.sleep(2000);
        //toggle button
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/toggle1")).click();
        System.out.println("User Selected first toggle button");
        //Scroll to last
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"listSeparatorTextViewStyle\").instance(0))")).click();
        //Select dropdown
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/spinner1")).click();
        System.out.println("User Selected the drop down");
        //select Earth
        //driver.switchTo().frame(0);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")).click();
        //driver.findElements(By.id("android:id/text1")).get(2).click();
        System.out.println("User Selected Earth from dropdown");


    }
}
