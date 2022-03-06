package locators;

import org.openqa.selenium.By;

public class Locators {
    /**
     * Class that contains the locators
     * */
    public static By searchBar = By.xpath("//input[@id='cb1-edit']");
    public static By acceptCookiesButton = By.xpath("//button[text()='Entendido']");
    public static By memoryRAMOption = By.xpath("//ul/li/button[@aria-label='3 GB']");
    public static By productLink = By.xpath("(//a[contains(@title, 'Apple')])[2]");
    public static By addCartButton = By.xpath("//form[@id='buybox-form']//div[@class='ui-pdp-actions__container']//span[text()='Agregar al carrito'][1]");
}