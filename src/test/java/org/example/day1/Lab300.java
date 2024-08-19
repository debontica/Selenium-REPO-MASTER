package org.example.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab300 {

@Test
    public  void vwologin(){
    EdgeOptions options = new EdgeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--guest");
    WebDriver driver = new EdgeDriver(options);
    driver.get("https://www.google.com");
    driver.manage().window().maximize();

    //Assert.assertEquals(driver.getTitle(), "Login-VWO");
    //driver.quit();
}
}
