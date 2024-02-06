package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ById extends BrowserLaunch{

    @Test
    public void byid(){

        driver.get("https://www.yahoo.com");

        driver.findElement(By.id("ybar-sbq")).sendKeys("Today's News", Keys.ENTER);
        Reporter.log(driver.getTitle());
    }
}
