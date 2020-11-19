import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestHW {



@Test
    public void test(){
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://healthunify.com/bmicalculator/");

    driver.findElement(By.name("wg")).sendKeys("eawed");

    driver.close();
    }
}
//я прост пока не совсем могу понять, как эти тесты сделать. Сделал тот же что и с 4-ой лекции