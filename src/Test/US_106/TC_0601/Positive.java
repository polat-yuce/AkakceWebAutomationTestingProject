package Test.US_106.TC_0601;

import Utlity.BaseDriverLogin;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriverLogin {

    @Test
    public void MessageBoxCheck() {
        driver.findElement(By.xpath("//a[text()='Lionel']")).click();

        driver.findElement(By.xpath("//a[text()='Mesajlarım']")).click();

        WebElement text = driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));

        Assert.assertTrue("Hatalı işlem", text.getText().contains("bulunamadı"));


        BekleKapat();
    }
}
