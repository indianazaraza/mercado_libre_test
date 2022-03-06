package testPages;

import org.testng.annotations.Test;
import pages.AddToCartPage;


public class AddToCartPageTest extends BaseTest{
    /**
     * Class that contains the test
     * */
    @Test
    public void testAddProductToCart(){
        /**test add a product to cart*/
        AddToCartPage orderProductPage = new AddToCartPage(driver);
        orderProductPage.searchProduct("iphone");
        orderProductPage.chooseProduct();
        orderProductPage.addToCart();
    }


}
