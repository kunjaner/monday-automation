package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FlipKartManager {
    public static WebDriver driver;
    //private String browser="";
//hi


    public void openBrowser(){
        WebDriverManager.chromedriver ().setup ();
         driver=new ChromeDriver();

    }




    public void navigateTo(String url){
        driver.get(url);
    }
    public void maxDriver(){
        driver.manage().window().maximize();
    }
    public void impWait(){ driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS); }
    public void handleCookies(){ driver.findElement(By.cssSelector(".mCRfo9>div>div>button")).click();    }
    public void closeBrowse(){ driver.quit();
    }


}
