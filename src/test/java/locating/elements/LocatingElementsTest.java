package locating.elements;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LocatingElementsTest {
    @Test
    public void elementsQuiz1()
    {
        //Telling the system where to find chromedriver. On Windows you also need to add .exe
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        //1. Instantiate the driver
        WebDriver driver = new ChromeDriver();
        //2. navigate to the URL
        driver.get("https://www.saucedemo.com/");
        //3. Find element //4. check the state
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        //5. take action //6. record the result
        assertTrue(element.isDisplayed());
        //7. quit the driver
        driver.quit();
    }
}
