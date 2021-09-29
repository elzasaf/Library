package com.LibraryCT.tests.G01_241BookCategories;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class G01_309BookCategories extends TestBase {
    @Test
    public void BookCategories(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"student30@library","Sdet2022*");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.id("book_categories")).click();
        List<WebElement> bookCategories = driver.findElements(By.xpath("//select[@id='book_categories']/option"));
        assertEquals(bookCategories.size(), 21);
    }
}
