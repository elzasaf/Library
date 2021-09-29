package com.LibraryCT.tests;

import com.LibraryCT.tests.util.TestBase;
import com.LibraryCT.tests.util.Utilities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class G01_306Logout extends TestBase {
    @Test
            public void LibrarianLogout(){
        driver.get("https://library2.cybertekschool.com/login.html");
        Utilities.login(driver,"librarian46@library","Sdet2022*");
        Utilities.logout(driver);
        assertTrue(driver.getTitle().equals("Login - Library"));


    }

}
