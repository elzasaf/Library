package com.LibraryCT.tests.G01_241BookCategories;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class G01_310SelectDrama extends TestBase {
    @Test
    public void SelectDrama(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"student30@library","Sdet2022*");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.id("book_categories")).click();
        WebElement bookCategories = driver.findElement(By.id("book_categories"));
        Select SelectDrama=new Select(bookCategories);
        SelectDrama.selectByVisibleText("Drama");
        WebElement drama = driver.findElement(By.xpath("//select[@id='book_categories']/option[text()='Drama']"));
        assertTrue(drama.isSelected());
    }
}
