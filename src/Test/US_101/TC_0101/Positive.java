package Test.US_101.TC_0101;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Positive extends BaseDriverLogin {

    @Test
    public void Successfulaccountcreationscenario() {

        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("(//a[text()='Hesap Aç'])[1]")).click();

        driver.findElement(By.id("rnufn")).sendKeys("Lionel");
        driver.findElement(By.id("rnufs")).sendKeys("Messi");
        driver.findElement(By.id("rnufe1")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("rnufe2")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("rnufp1")).sendKeys("Leo1234@");
        driver.findElement(By.id("rnufp2")).sendKeys("Leo1234@");

        driver.findElement(By.id("rngm")).click();

        WebElement il = driver.findElement(By.id("locpr"));
        WebElement ilce = driver.findElement(By.id("locds"));

        Select Ankara = new Select(il);
        Select Beypazari = new Select(ilce);

        Ankara.selectByVisibleText("Ankara");
        Beypazari.selectByVisibleText("Beypazarı");

        WebElement gun=driver.findElement(By.id("bd"));
        WebElement ay=driver.findElement(By.id("bm"));
        WebElement yil=driver.findElement(By.id("by"));

        Select day=new Select(gun);
        Select month=new Select(ay);
        Select year=new Select(yil);

        day.selectByIndex(3);
        month.selectByIndex(1);
        year.selectByIndex(20);

        driver.findElement(By.id("rnufpca")).click();
        driver.findElement(By.id("rnufnee")).click();

        driver.findElement(By.id("rfb")).click();

        WebElement isim=driver.findElement(By.xpath("//a[text()='Lionel']"));

        Assert.assertTrue("Hesap açılmadı",isim.getText().equalsIgnoreCase("Lionel"));

        BekleKapat();

    }
}
