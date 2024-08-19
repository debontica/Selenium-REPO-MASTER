package org.example.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lab301 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        WebDriver driver2= new ChromeDriver();
        WebDriver driver3= new FirefoxDriver();
        WebDriver driver4= new InternetExplorerDriver();
        WebDriver driver5= new SafariDriver();

    }
}
