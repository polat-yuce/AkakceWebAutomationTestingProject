package Utlity;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utlity.BaseDriver.wait;

public class MyFunc {

    public static void Bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public static void ErrorMessage(String text) {
        WebElement errorMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='alertX t2']/p")));

        Assert.assertTrue("Hatalı işlem", errorMessage.getText().toLowerCase().equalsIgnoreCase(text));
    }

}
