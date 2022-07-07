package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver d1= new ChromeDriver();
        d1.get("http:\\www.facebook.com");
        d1.quit();
        System.out.println("Hello world!");
    }
}