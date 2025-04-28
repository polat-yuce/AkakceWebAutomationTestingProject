package Test.US_104.TC_0404;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Negative extends BaseDriver {

    @Test
    public void FailedLoginAttemptwithEmptyNullEmailandPassword(){

        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();

        driver.findElement(By.id("lfb")).click();

        MyFunc.ErrorMessage("Lütfen e-posta adresinizi yazın.");

        BekleKapat();
    }
}
