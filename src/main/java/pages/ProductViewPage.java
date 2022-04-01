package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

public class ProductViewPage extends BasePage{
    public ProductViewPage(WebDriver driver) {
        super(driver);
    }

    /**add a product to cart*/
    public void addToCart(){
        click(Locators.addCartButton);
    }
}
