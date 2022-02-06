package tescoslot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TescoLowestPriceSlotBooking {
    @Test
    public void lowestPriceSlotBooking() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tesco.com/");
        driver.findElement(By.xpath("//button/span/span[text()='Accept all cookies']")).click();
        //sign in
        driver.findElement(By.xpath("//a[@title='Sign in']")).click();
        driver.findElement(By.id("email")).sendKeys("hetalthanki52@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Hetal@1985");
        driver.findElement(By.xpath("//button/span/span[text()='Sign in']")).click();

        //grosary
        //driver.findElement(By.xpath("//a/h2/span[text()='Groceries']")).click();
        driver.findElement(By.linkText("Groceries")).click();
        driver.findElement(By.xpath("//li/a/h3/span[text()='Shop groceries']")).click();
        driver.findElement(By.xpath("//li/a/span[text()='Fresh Food']")).click();
        driver.findElement(By.xpath("//li/a/span[text()='Fresh Fruit']")).click();
        driver.findElement(By.xpath("//li/a/span[text()='Apples & Pears']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Tesco Pink Lady Apple Minimum 5 Pack")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div[4]/form/div/div[2]/button/span[1]")).click();  //clicks on pear
        driver.findElement(By.xpath("//a[@class='button button-secondary small']/span")).click();
        driver.findElement(By.xpath("//a/div/h3[text()='Home Delivery']")).click();
        driver.findElement(By.name("slotTypeSelector")).click();
        driver.findElement(By.xpath("//*[@id=\"slot-matrix\"]/div[2]/div[1]/ul/li[1]/a")).click();


        //table handling
        List<WebElement> slotOfPrices = driver.findElements(By.xpath("//span[@data-auto='price-value' and @class='value']"));
        for (WebElement eachPriceSlot : slotOfPrices) {
            if (eachPriceSlot.getText().equals("1.95")) {
                eachPriceSlot.click();
                break;
            }

        }
            /*if(ie.getText()=="Unavailable")
            {




                continue;
            }

            else
            {
                values.add(Integer.parseInt(ie.getText()));
            }*/
    }
           /* Collections.sort(values);
            System.out.println("All values:"+values);*/

}

    }



