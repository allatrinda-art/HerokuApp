import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

public class CheckboxesTest {

    @Test
    public void UncheckedCheckboxTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//хром хранится в папке resources
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();//полный экран. использовать всегда
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//TODO изучить waits
        browser.get("http://the-internet.herokuapp.com/checkboxes");//открывает браузер/урл
        List<WebElement> checkbox = browser.findElements(By.cssSelector("[type=checkbox]"));
        Assert.assertFalse((checkbox.get(0).isSelected()), "Error. Checked");//чекбокс unchecked
        checkbox.get(0).click();
        Assert.assertTrue((checkbox.get(0).isSelected()), "Error. Unchecked");//чекбокс checked
        Assert.assertTrue((checkbox.get(1).isSelected()), "Error. Unchecked");//чекбокс checked
        checkbox.get(1).click();
        Assert.assertFalse((checkbox.get(1).isSelected()), "Error. Checked");//чекбокс unchecked
        browser.quit();




    }

}
