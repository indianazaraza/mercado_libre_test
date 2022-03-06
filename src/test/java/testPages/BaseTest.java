package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Collections;

public class BaseTest {
    /**
     * Class that initializes all page classes
     * */
    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/maca/chromedriver");
        driver = new ChromeDriver(getChromeOptions());
        driver.get("https://www.mercadolibre.com.ar/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }

    /**
     * Configure different Chrome browser options
     * */
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        /**disappear Chrome is being controlled by automated testing software */
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        return options;
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
