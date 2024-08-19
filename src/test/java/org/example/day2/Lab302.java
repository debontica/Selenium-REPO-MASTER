package org.example.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab302 {
    @Test
    public void testLoginNegativeVWO() {
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--guest");
        WebDriver driver = new EdgeDriver(option);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


        WebElement emailInputBox = driver.findElement(By.id("login-username")); // Page Locator
        emailInputBox.sendKeys("admin@admin.com"); // Page Action

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Rohit

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msg_text = error_msg.getText();
        String error_msg_attribute_dataqa = error_msg.getAttribute("data-qa");
        System.out.println(error_msg_attribute_dataqa);

        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();
    }


}

