package Test.US_104.TC_0403;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Negative extends BaseDriver {

    @Test
    public void InvalidLoginAttemptwithIncorrectEmail(){

        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();

        driver.findElement(By.id("life")).sendKeys("gecersiz@mail.com");
        driver.findElement(By.id("lifp")).sendKeys("Leo1234@");
        driver.findElement(By.id("lfb")).click();

        MyFunc.ErrorMessage("Bu e-postaya kayıtlı bir hesap bulunamadı.");

        BekleKapat();
    }
}
