package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }

    public void acceptCookies(){
        click(Locators.acceptCookiesButton);
    }

    /**search a product given a product*/
    public void searchProduct(String product){
        type(Locators.searchBar, product);
    }
}
