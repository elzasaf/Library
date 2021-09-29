package com.LibraryCT.tests;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class G01_305AddNewBook extends TestBase {
    @Test
    public void AddNewBook()  {
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"librarian46@library","Sdet2022*");
        driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[3]/a/span[1]")).click();
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"books\"]/div[1]/div[1]/span/a")).click();
        Utilities.BrowserUtil.waitFor(2);
        String name="The power of now";
        driver.findElement(By.name("name")).sendKeys(name);
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.name("year")).sendKeys("1997");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.name("isbn")).sendKeys("9781458770943");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"add_book_form\"]/div[1]/div/div[2]/div[1]/div/input")).sendKeys(" Eckhart Tolle");
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"add_book_form\"]/div[2]/button[2]")).click();
        Utilities.BrowserUtil.waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"tbl_books_filter\"]/label/input")).sendKeys(name);
        Utilities.BrowserUtil.waitFor(2);
        WebElement NewName = driver.findElement(By.xpath("//*[@id=\"tbl_books\"]/tbody/tr[1]/td[3]"));
        assertEquals(NewName.getText(),name);


    }

}
