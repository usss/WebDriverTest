/**
 * Created by VNKorchagin on 25.08.2014.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://dev-web01:23001/login.html");
        WebElement loginForm = driver.findElement(By.id("loginFormB2C:loginForm:login"));
        loginForm.sendKeys("Telco1");
        WebElement passwordForm = driver.findElement(By.id("loginFormB2C:loginForm:password"));
        passwordForm.sendKeys("unix1111");
        WebElement loginButton = driver.findElement(By.id("loginFormB2C:loginForm:loginButton"));
        loginButton.click();
        /*driver.quit(); Не, хуйня, выход не нужон*/
    }
}
