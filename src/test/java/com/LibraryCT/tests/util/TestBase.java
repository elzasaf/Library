package com.LibraryCT.tests.util;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *This class meant to be super class
 *to provide driver set up and closing browser
 *for it's subclasses
 */
public abstract class TestBase {
    protected WebDriver driver ;

    @BeforeEach
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    @AfterEach

    public void closeBrowser(){
        driver.quit();
    }
}
