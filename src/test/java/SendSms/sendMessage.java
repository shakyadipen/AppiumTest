package SendSms;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class sendMessage {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability("appPackage","com.google.android.apps.messaging");
        dc.setCapability("appActivity","com.google.android.apps.messaging.home.HomeActivity");
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,dc);
        Thread.sleep(6000);
        WebElement startChat= driver.findElement(By.id("com.google.android.apps.messaging:id/start_chat_fab"));
        Thread.sleep(2000);
        startChat.click();//this will click on start chat
        WebElement number=driver.findElement(By.id("com.google.android.apps.messaging:id/recipient_text_view"));
        number.sendKeys("9860105431");
        WebElement okay=driver.findElement(By.id("com.google.android.apps.messaging:id/contact_detail_type"));
        Thread.sleep(3000);
        okay.click();
        Thread.sleep(1000);
        WebElement createMessage=driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text"));
        createMessage.sendKeys("Sweetu, I am just trying to send message automatically with code.I love you alot dear");
        Thread.sleep(1000);
        WebElement sendMessage= driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon"));
        sendMessage.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
