package com.LibraryCT.tests;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class G01_308SelectStatus extends TestBase {
    @Test
    public void UserStatus(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"librarian46@library","Sdet2022*");
        Utilities.BrowserUtil.waitFor(2);
        //click user button
        driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]")).click();
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.id("user_status")).click();
        List<WebElement> statusDropDown = driver.findElements(By.xpath("//select[@id='user_status']/option"));
        assertEquals(statusDropDown.size(), 2);
    }
}
