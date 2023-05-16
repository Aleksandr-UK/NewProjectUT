package UT.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

public class TestInit {

    ChromeOptions options = new ChromeOptions();
    public WebDriver driver = new ChromeDriver(options);


    // put here false if you want to see browser
    boolean headless = false;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        if (headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }


    }


    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
    public void openUrl(String site) {
        driver.get(site);

    }
    
    public synchronized static String generateUniqueEmail(String email) {
        String newEmail = "";
        String[] array = email.split("@");
        try {
            Thread.sleep((long)((Math.random()*1000)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        newEmail = array[0] + "+" + new Date().getTime() + "@" + array[1];
        return newEmail;
    }

    private String userEmail;

    }

