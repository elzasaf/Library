package com.LibraryCT.tests.G01_108_LoginFunction;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class G01_303InvalidLogin extends TestBase {
    @Test
    public void  InvalidLogin(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"some@gmail.com","something");
        WebElement ErrorMessage=driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]"));
        assertEquals(ErrorMessage.getText(),"Sorry, Wrong Email or Password" );
    }
}