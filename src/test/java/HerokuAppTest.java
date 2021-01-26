import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HerokuAppTest {

    @Test
    public void siteShouldBeOpened() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//хром хранится вот тут
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/");
        browser.quit();//TODO

    }
}
