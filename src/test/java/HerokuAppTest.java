import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTest {

    @Test
    public void siteShouldBeOpened() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//хром хранится в папке resources
       //ChromeOptions options = new ChromeOptions();//optional
        //options.setHeadless(true);//optional
        WebDriver browser = new ChromeDriver();
       // System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");//для firefox
        //WebDriver browser = new FirefoxDriver();//добавляем firefox
        //browser.close();//закрывает вкладку. не стоит употреблять
        browser.manage().window().maximize();//полный экран. использовать всегда
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//TODO
        //browser.manage().window().getSize(new Dimension(1024, 768);//расширение экрана
        browser.get("http://the-internet.herokuapp.com/");//открывает браузер/урл
        //browser.findElement(By.id("1")).click();

        browser.quit();

    }
}
