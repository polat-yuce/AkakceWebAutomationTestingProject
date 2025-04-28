package Utlity;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriverLogin {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static Actions actions;

    static {

        driver = new ChromeDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        js=(JavascriptExecutor)driver;
        actions=new Actions(driver);

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elemanı bulma mühleti

        Login();
    }

    public static void BekleKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }

    public static void Login(){
        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();

        driver.findElement(By.id("life")).sendKeys("leomessi@gmail.com");
        driver.findElement(By.id("lifp")).sendKeys("Leo1234@");

        driver.findElement(By.id("lfb")).click();

        WebElement isim = driver.findElement(By.xpath("//a[text()='Lionel']"));

        Assert.assertTrue("Hesap açılmadı", isim.getText().equalsIgnoreCase("Lionel"));
    }
}
