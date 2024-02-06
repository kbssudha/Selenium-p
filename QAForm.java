package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class QAForm extends BrowserLaunch{
    @Test
    public void form(){
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Sudha", Keys.ENTER);
        driver.findElement(By.id("lastName")).sendKeys("Sundari", Keys.ENTER);
        driver.findElement(By.id("userEmail")).sendKeys("kbssudha@gmail.com", Keys.ENTER);
        driver.findElement(By.id("gender-radio-2")).click();


    }
}
