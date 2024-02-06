package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXPath extends BrowserLaunch{
    @Test
    public void xpath() throws InterruptedException {
        driver.get("http://www.google.com");
        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).
                sendKeys("Temples in Tamilnadu", Keys.ENTER);
    }
}
