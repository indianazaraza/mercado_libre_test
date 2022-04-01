package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Class that initializes all page classes
 * */
public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    /**types given a text into an element given a locator*/
    public void type(String locator, String text){
        driver.findElement(By.xpath(locator)).sendKeys(Keys.chord(text, Keys.ENTER));
    }

    /**clicks on an element given a locator*/
    public void click(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    /**get title current page*/
    public String getTitle(){
        return driver.getTitle();
    }
}
