import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by cccce on 02/12/2017.
 */
public class DragAndDropKendoUIGrid {

    public static WebElement dragItem1;
    public static WebElement dragItem2;
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c://developer//seleniumDrivers//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/selenium-webdriver/xpath-helper/");//http://demos.telerik.com/kendo-ui/grid/index


        //Not working
        //Katalon Helper XPath Super Easy
        //driver.findElement(By.xpath("id(\"7986db78-0723-49d0-a09b-d583503c8b81\")/a[@class=\"k-link\"]")).click();

        //Swd Page Recorder na rusnaka pravi syshto

        //Working
        // WebDriver Element Locator Add On FireFox
        driver.findElement(By.xpath("//span[contains(.,'ABOUT')]")).click();////a[contains(.,'Contact Name')]

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("$(\"#grid\").kendoGrid({\n" +
                "  columns: [\n" +
                "    { field: \"name\" },\n" +
                "    { field: \"age\" }\n" +
                "  ],\n" +
                "  dataSource: [\n" +
                "      { name: \"Ceko\", age: 30 },\n" +
                "      { name: \"Zai\", age: 33 }\n" +

                "  ]\n" +
                "});\n" +
                "var grid = $(\"#grid\").data(\"kendoGrid\");\n" +
                "grid.reorderColumn(1, grid.columns[0]);");
        WebElement columnValue = driver.findElement(By.xpath("/[@id='grid']/div[3]/table/tbody/tr[1]/td[3]"));
        String text = columnValue.getText();
        Assert.assertEquals("Ceko",text);*/


        /*dragItem1 = driver.findElement(By.linkText("Contact Name"));
        System.out.println(dragItem1.getText());
        dragItem2 = driver.findElement(By.className("k-grouping-header"));
        System.out.println(dragItem2.getText());
        Thread.sleep(3000);
        dragItem1.click();
        Actions action = new Actions(driver);
        action.clickAndHold(dragItem1)
                .moveToElement(dragItem2)
                .release();
        action.build();
        action.perform();


        //elementToBeClickable(dragItem1);
        //dragAndDrop(driver, dragItem1, dragItem2);

        driver.close();
        driver.quit();
    }

    //Actions always first build() then perform() because only perform does not work in Firefox
    public static void dragAndDrop(WebDriver driver, WebElement srcElement, WebElement dstElement){

        Actions action = new Actions(driver);
        action.dragAndDrop(srcElement, dstElement);
        action.build();
        action.perform();
    }


    *//**
         * An expectation for checking an element is visible and enabled such that you
         * can click it.
         *
         * @param element the WebElement
         * @return the (same) WebElement once it is clickable (visible and enabled)
         *//*

    public static WebElement elementToBeClickable(final WebElement element) {
        return (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(element));
    }*/


    }


}








