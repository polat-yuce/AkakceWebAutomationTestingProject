package Test.US_101.TC_0102;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Negative extends BaseDriver {

    @Test
    public void CreationScenariowithMissingInformation() {

        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("(//a[text()='Hesap Aç'])[1]")).click();

        driver.findElement(By.id("rnufe1")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("rnufe2")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("rnufp1")).sendKeys("Leo1234@");
        driver.findElement(By.id("rnufp2")).sendKeys("Leo1234@");

        WebElement il = driver.findElement(By.id("locpr"));
        WebElement ilce = driver.findElement(By.id("locds"));

        Select Ankara = new Select(il);
        Select Beypazari = new Select(ilce);

        Ankara.selectByVisibleText("Ankara");
        Beypazari.selectByVisibleText("Beypazarı");

        driver.findElement(By.id("rnufpca")).click();
        driver.findElement(By.id("rnufnee")).click();

        driver.findElement(By.id("rfb")).click();

        WebElement errorMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='alertX t2']/p")));
        System.out.println("errorMessage.getText() = " + errorMessage.getText());

        Assert.assertTrue("Hatalı işlem", errorMessage.getText().toLowerCase().equalsIgnoreCase("Lütfen adınızı yazın"));

        BekleKapat();
    }
}
