package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {


    WebDriver driver;

    public ProductDetailsPage(WebDriver driver){

        this.driver = driver;
    }

    public ShoppingCartPage addProductToCart( String qty)
    {

        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys(qty);
        driver.findElement(By.id("add-to-cart-button")).click();

        return new ShoppingCartPage(driver);

    }

}
