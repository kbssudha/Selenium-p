package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ByClass extends BrowserLaunch {
    @Test
    public void byclass(){
        driver.get("http://www.google.com");
        driver.findElement(By.className("gLFyf")).sendKeys("Nature Image", Keys.ENTER);
        Reporter.log(driver.getTitle());
    }
}
