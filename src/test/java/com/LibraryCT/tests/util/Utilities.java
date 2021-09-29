package com.LibraryCT.tests.util;


import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class Utilities {

    public static void login(WebDriver driver, String username, String password ){

        driver.findElement(By.id("inputEmail")).sendKeys(username);

        driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*");



        driver.findElement(By.cssSelector("button[type='submit']")).click();

        BrowserUtil.waitFor(2);
    }
    public static void logout(WebDriver driver){
        driver.findElement(By.id("navbarDropdown")).click();
        driver.findElement(By.linkText("Log Out")).click();

    }
    public static class BrowserUtil {

        /**
         * A method to pause the thread certain seconds
         * @param seconds
         */
        public static void waitFor(int seconds){

            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
