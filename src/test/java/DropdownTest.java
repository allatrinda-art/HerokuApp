import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTest {

    @Test
    public void UncheckedCheckboxTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//хром хранится в папке resources
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();//полный экран. использовать всегда
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//TODO изучить waits
        browser.get("http://the-internet.herokuapp.com/dropdown");//открывает браузер/урл
        List<WebElement> checkbox = browser.findElements(By.cssSelector("[type=checkbox]"));


    }
}
