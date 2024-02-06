package Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;

public class facebookLogin extends BrowserLaunch {
    @Test
    public void login() throws InterruptedException {
        driver.get("https://www.facebook.com");

        //driver.findElement(By.id("u_0_0_f8")).click();
        driver.findElement(By.xpath("//input[@name='firstname' and @placeholder aria-label='First name']")).sendKeys("Sudha", Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname' and @placeholder aria-label='Surname']")).sendKeys("Priya", Keys.ENTER);
        driver.findElement(By.id("u_0_g_pP")).sendKeys("8976534532", Keys.ENTER);
        driver.findElement(By.id("password_step_input")).sendKeys("AAAwww-444",Keys.ENTER);
        Select s1=new Select(driver.findElement(By.id("day")));
        Thread.sleep(3000);
        s1.selectByVisibleText("12");
        Select s2=new Select(driver.findElement(By.id("month")));
        Thread.sleep(3000);
        s2.selectByVisibleText("April");

        Select s3=new Select(driver.findElement(By.id("year")));
        Thread.sleep(3000);
        s3.selectByVisibleText("2000");

        //driver.findElement(By.className("_58mt")).sendKeys("female",Keys.ENTER);
        //driver.findElement(By.id("u_p_s_k3")).click();
        //Thread.sleep(5000);

    }

}
//   //tagName[contains(text(), 'value')]