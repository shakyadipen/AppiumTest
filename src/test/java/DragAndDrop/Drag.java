package DragAndDrop;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Drag {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.APP,"D:\\Appium\\apk files/Drag Sort.apk");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,dc);
        Thread.sleep(5000);
        //navigation
        WebElement FirstLink=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
        FirstLink.click();
        System.out.println("FirstLink Clicked Successfully");
        WebElement sourceBlock=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
        WebElement targetBlock=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(5);
        TouchAction action =new TouchAction(driver);
        //draganddrop
        action.longPress(ElementOption.element (sourceBlock)).moveTo(ElementOption.element(targetBlock)).release().perform();
        System.out.println("Element has drag and dropped successfully");
        Thread.sleep(2000);
    }
}
