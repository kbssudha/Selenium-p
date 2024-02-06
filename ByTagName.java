package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends BrowserLaunch {
    @Test
    public void bytagname() throws InterruptedException {
        driver.get("http://www.flipkart.com");
        //driver.findElement(By.tagName("a")).click();
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("Total links = "+link.size());
        for(WebElement links:link){
            System.out.println(links.getText()+"------>"+links.getAttribute("href"));
        }
        driver.findElement(By.linkText("Grocery")).sendKeys("Aashirvad atta");
    Thread.sleep(5000);
    }
}
