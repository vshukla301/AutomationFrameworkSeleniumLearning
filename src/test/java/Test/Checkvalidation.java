package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Checkvalidation {
    public static void main(String[] args) {
        String title="Facebook – log in or sign up";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        Assert.assertEquals(driver.getTitle(), title);
        Assert.assertTrue(false);
    }


}
