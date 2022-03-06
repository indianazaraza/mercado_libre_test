package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {
    /**
     * Class that initializes all page classes
     * */
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void type(By locator, String text){
        /**types given a text into an element given a locator*/
        driver.findElement(locator).sendKeys(Keys.chord(text, Keys.ENTER));
    }

    public void click(By locator){
        /**clicks on an element given a locator*/
        driver.findElement(locator).click();
    }
}
