package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        //maximise the Browser
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Get the title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the Current Url
        System.out.println("Current url: " + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page Source" + driver.getPageSource());

        //find the Email Element
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");

        //find the Password Field Element and type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //close the Browser
        driver.close();

    }
}
