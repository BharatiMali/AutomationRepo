package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class NewSeleniumpro {
    public static void main(String[] args) throws InterruptedException, IOException {
       System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys( "bharati1811@gmail.com");
        Thread.sleep(4000);
        driver.close();

    }
}
