package CalculatorAutomate;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability("appPackage","com.coloros.calculator");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,dc);
        Thread.sleep(5000);
        //driver.quit();
        driver.findElement(By.id("com.coloros.calculator:id/digit_7")).click();//click 7
        driver.findElement(By.id("com.coloros.calculator:id/op_add")).click();
        driver.findElement(By.id("com.coloros.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
        Thread.sleep(2000);
        String result=driver.findElement(By.id("com.coloros.calculator:id/result")).getText();
        if(result.equals("15")){
            System.out.println("Calculator Addition Successfull");
        }
        else{
            System.out.println("Calculator Adddition Malfunctioned");
        }
        Thread.sleep(8000);
        driver.quit();
    }
}
