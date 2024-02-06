package Selenium_Program;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByLinkText extends BrowserLaunch{
@Test
public void bylinktext() throws InterruptedException {
    driver.get("http://www.yahoo.com");
    driver.findElement(By.linkText("Sports")).click();
    Thread.sleep(5000);
    driver.findElement(By.partialLinkText("Fin")).click();
}
}
