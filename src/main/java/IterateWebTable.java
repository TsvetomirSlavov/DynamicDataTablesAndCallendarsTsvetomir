import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by cccce on 02/13/2017.
 */
public class IterateWebTable {


        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        @Before
        public void setUp() throws Exception
        {
            System.setProperty("webdriver.gecko.driver", "c://developer//seleniumDrivers//geckodriver.exe");
            driver = new FirefoxDriver();
            baseUrl = "http://Qeworks.com";
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.get(baseUrl);
        }
        @Test
        public void test() {

            WebElement Webtable=driver.findElement(By.id("TableID")); // Replace TableID with Actual Table ID or Xpath
            List<WebElement> TotalRowCount=Webtable.findElements(By.xpath("//*[@id='TableID']/tbody/tr"));

            System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());
            // Now we will Iterate the Table and print the Values
            int RowIndex=1;
            for(WebElement rowElement:TotalRowCount)
            {
                List<WebElement> TotalColumnCount=rowElement.findElements(By.xpath("td"));
                int ColumnIndex=1;
                for(WebElement colElement:TotalColumnCount)
                {
                    System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data "+colElement.getText());
                    ColumnIndex=ColumnIndex+1;
                }
                RowIndex=RowIndex+1;
            }

        }
        @After
        public void tearDown() throws Exception {
            driver.quit();
        }

}
