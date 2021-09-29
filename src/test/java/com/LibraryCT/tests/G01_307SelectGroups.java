package com.LibraryCT.tests;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class G01_307SelectGroups extends TestBase {
    @Test
    public void SelectGroups(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"librarian46@library","Sdet2022*");

        //click user button
        driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]")).click();
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.id("user_groups")).click();
        List<WebElement> groupDropDown = driver.findElements(By.xpath("//select[@id='user_groups']/option"));
        assertEquals(groupDropDown.size(), 3);


    }

}
