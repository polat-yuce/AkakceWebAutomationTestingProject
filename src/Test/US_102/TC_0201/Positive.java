package Test.US_102.TC_0201;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriverLogin {

    @Test
    public void AccountVerificationCheck() {

        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();

        driver.findElement(By.id("life")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("lifp")).sendKeys("Leo1234@");

        driver.findElement(By.id("lfb")).click();

        WebElement isim = driver.findElement(By.xpath("//a[text()='Lionel']"));

        Assert.assertTrue("Hesap açılmadı", isim.getText().equalsIgnoreCase("Lionel"));

        BekleKapat();
    }
}
