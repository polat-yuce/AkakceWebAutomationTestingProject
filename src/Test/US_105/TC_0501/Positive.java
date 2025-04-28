package Test.US_105.TC_0501;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriverLogin {

    @Test
    public void OrderListCheck() {

        driver.findElement(By.xpath("//a[text()='Lionel']")).click();

        driver.findElement(By.xpath("//li[@class='user']/a")).click();

        WebElement text = driver.findElement(By.xpath("//*[text()='Takip listeniz şu anda boş!']"));
        Assert.assertTrue("Hatalı işlem", text.getText().equalsIgnoreCase("Takip listeniz şu anda boş!"));

        BekleKapat();
    }
}
