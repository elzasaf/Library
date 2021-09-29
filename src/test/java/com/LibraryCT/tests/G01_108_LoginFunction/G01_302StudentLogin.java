package com.LibraryCT.tests.G01_108_LoginFunction;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class G01_302StudentLogin extends TestBase {
    @Test
    public void Studentlogin(){
        driver.get("https://library2.cybertekschool.com/login.html");
        assertTrue(driver.getCurrentUrl().equals("https://library2.cybertekschool.com/login.html"));
        Utilities.login(driver,"student30@library","Sdet2022*");
        Utilities.logout(driver);
        Utilities.login(driver,"student31@library","Sdet2022*");
        Utilities.logout(driver);
        Utilities.login(driver,"student32@library","Sdet2022*");
        List<WebElement> allmodels = driver.findElements(By.xpath("//span[@class=\"title\"]"));
        assertEquals(allmodels.size(), 2);

    }
}
