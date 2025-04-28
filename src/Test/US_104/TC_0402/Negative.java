package Test.US_104.TC_0402;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Negative extends BaseDriver {

    @Test
    public void InvalidLoginAttemptwithIncorrectPassword() {
        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();

        driver.findElement(By.id("life")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("lifp")).sendKeys("geçersizSifre@");

        driver.findElement(By.id("lfb")).click();

        MyFunc.ErrorMessage("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.");

        BekleKapat();
    }
}
