package com.LibraryCT.tests.G01_108_LoginFunction;

import com.LibraryCT.tests.util.Utilities;
import com.LibraryCT.tests.util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class G01_301LibrarianLogin extends TestBase {
@Test
    public void LibrarianLogin (){
    driver.get("https://library2.cybertekschool.com/login.html");
    assertTrue(driver.getTitle().equals("Login - Library"));
    Utilities.login(driver,"librarian46@library","Sdet2022*");
    Utilities.logout(driver);
    Utilities.login(driver,"librarian13@library","Sdet2022*" );
    List<WebElement> allModules = driver.findElements(By.className("title"));
    assertEquals(allModules.size(), 3);


    }


}



