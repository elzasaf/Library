package com.LibraryCT.tests;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class G01_304AddNewUser extends TestBase {
    @Test
    public void AddNewUser(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"librarian46@library","Sdet2022*");

        //click user button
        driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]")).click();
        Utilities.BrowserUtil.waitFor(2);
        //click add user button
        driver.findElement(By.xpath("//*[@id=\"users\"]/div[1]/div[1]/span/a")).click();
        Utilities.BrowserUtil.waitFor(2);
        //fill out boxes
        String name="Will Smith";
        driver.findElement(By.name("full_name")).sendKeys(name);
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.name("password")).sendKeys("12345");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.name("email")).sendKeys("another3@gmail.com");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.id("address")).sendKeys("50 Sheridan Drive");
        Utilities.BrowserUtil.waitFor(2);
        //save changes button
        driver.findElement(By.cssSelector("div>button[type='submit']")).submit();
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"tbl_users_filter\"]/label/input")).sendKeys(name);
        Utilities.BrowserUtil.waitFor(2);
        WebElement NewName = driver.findElement(By.xpath("//*[@id=\"tbl_users\"]/tbody/tr/td[3]"));
        assertEquals(NewName.getText(),name);
    }
}
