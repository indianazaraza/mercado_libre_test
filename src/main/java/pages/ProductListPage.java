package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage{
    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void filterProductByMemoryOption(){
        click(Locators.memoryRAMOption);
    }

    /**choose a product from the product list*/
    public void chooseProduct(){
        click(Locators.productLink);
    }

    public String getTitleProductListPage(){
        return getTitle();
    }
}
