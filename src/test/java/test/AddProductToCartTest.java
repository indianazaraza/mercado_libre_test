package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.HomePage;
import pages.ProductListPage;
import pages.ProductViewPage;

/**
 * Class that contains the test
 * */
public class AddProductToCartTest extends BaseTest{
    /**test search product*/
    @Test
    public void testSearchProduct(){
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        homePage.searchProduct("iphone");
    }

    /**test choose a product*/
    @Test(dependsOnMethods = "testSearchProduct")
    public void testChooseProduct(){
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.filterProductByMemoryOption();
        String textExpected = "Iphone";
        Assert.assertTrue(productListPage.getTitleProductListPage().contains(textExpected));
        productListPage.chooseProduct();
    }

    /**test add a product to cart*/
    @Test(dependsOnMethods = "testChooseProduct")
    public void testAddProductToCart(){
        ProductViewPage productViewPage = new ProductViewPage(driver);
        productViewPage.addToCart();
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        String textExpected = "¡Hola! Para agregar al carrito";
        Assert.assertTrue(addToCartPage.getTitleAddToCartPage().contains(textExpected));
    }
}
