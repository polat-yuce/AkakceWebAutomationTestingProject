package Test.US_103.TC_0301;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriverLogin {

    @Test
    public void LogoutSuccessfulSituation(){

        WebElement human=driver.findElement(By.cssSelector("[title='Hesabım']"));
        actions.moveToElement(human).build().perform();

        driver.findElement(By.cssSelector("a[href='#Çık']")).click();


        Assert.assertTrue("Hatalı işlem",driver.);

        BekleKapat();
    }
}
