import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ChackboxesTest {

    @Test
    public void UncheckedCheckboxTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//хром хранится в папке resources
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();//полный экран. использовать всегда
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//TODO изучить waits
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");//открывает браузер/урл
        WebElement checkbox = browser.findElement(By.xpath("By.cssSelector(“[type=checkbox]"));

        //чекбоксы
        assertFalse(checkbox.isSelected());

    }

}
