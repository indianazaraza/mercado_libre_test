package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{

    public AddToCartPage(WebDriver driver){
        super(driver);
    }

    public void searchProduct(String product){
        /**given a product looks for it on the page */
        click(Locators.acceptCookiesButton);
        type(Locators.searchBar, product);
    }

    public void chooseProduct(){
        /**choose the first product*/
        click(Locators.memoryRAMOption);
        click(Locators.productLink);
    }

    public void addToCart(){
        /**add a product to cart*/
        click(Locators.addCartButton);
    }

}
