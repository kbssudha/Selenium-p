package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends BrowserLaunch{
    @Test
    public void byname(){

        driver.get("https://www.flipkart.com");

        driver.findElement(By.name("q")).sendKeys("Today's deal", Keys.ENTER);

    }

}
