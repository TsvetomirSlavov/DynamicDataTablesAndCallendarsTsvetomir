import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by cccce on 02/12/2017.
 */
public class DynamicTables {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c://developer//seleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.skyscanner.com");
        driver.findElement(By.id("js-depart-input")).click();
        System.out.println("********click Depart field");
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }


}
