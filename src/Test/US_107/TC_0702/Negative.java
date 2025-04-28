package Test.US_107.TC_0702;

import Utlity.BaseDriverLogin;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Negative extends BaseDriverLogin {

    @Test
    public void AccountDeletionwithInvalidPassword() {
        driver.findElement(By.xpath("//a[text()='Lionel']")).click();

        driver.findElement(By.xpath("//a[text()='Hesabımı Sil']")).click();

        driver.findElement(By.cssSelector("input[id=p]")).sendKeys("Leo1234@");

        driver.findElement(By.cssSelector("input[id='u']")).click();

//        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[@class='alertX t2']/p")), "Mevcut şifrenizi doğru girdiğinizden emin olun."));
//        WebElement alertMessage = driver.findElement(By.xpath("//div[@class='alertX t2']/p"));
//        Assert.assertTrue(alertMessage.getText().contains("Mevcut şifrenizi doğru girdiğinizden emin olun."));
    }
}
