import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTest {

    @Test
    public void AddRemoveElementsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//хром хранится в папке resources
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();//полный экран. использовать всегда
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//TODO изучить waits
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");//открывает браузер/урл
        WebElement addElementButton = browser.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();         //КЛИКНУТЬ ADD ЭЛЕМЕНТ
        addElementButton.click();           //КЛИКНУТЬ ADD ЭЛЕМЕНТ
        browser.findElements(By.xpath("//button[text()='Delete']")).get(1).click();         //КЛИКНУТЬ на какую-то кнопку delete
        int numberOfButtons = browser.findElements(By.xpath("/button[text()='Delete']")).size();        //посчитать кол-во элементов delete
        assertEquals(numberOfButtons, 0, "Кнопок DELETE больше не ожидает");//TODO ? почему 1/сообщение
        browser.quit();

        /*инпуты
        addElementButton.sendKeys(Keys.ARROW_UP);*/

    }
}