package Test.US_107.TC_0701;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Positive extends BaseDriverLogin {

    @Test
    public void DeleteAccount() {
        driver.findElement(By.xpath("//a[text()='Lionel']")).click();

        WebElement deleete = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));

        js.executeScript("arguments[0].click();", deleete);

        driver.findElement(By.cssSelector("input[id=p]")).sendKeys("Leo1234@");

        driver.findElement(By.cssSelector("input[id='u']")).click();

        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("*[text()='Hesabın silindi.']")), "Mevcut şifrenizi doğru girdiğinizden emin olun."));
        WebElement alertMessage = driver.findElement(By.xpath("*[text()='Hesabın silindi.']"));
        Assert.assertTrue(alertMessage.getText().contains("Hesabın silindi."));

    }
}
