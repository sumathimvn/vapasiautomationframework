package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {


    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {

        this.driver = driver;

    }


    public int getNoOfProducts() {


        List<WebElement> cartitems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));

        System.out.println("Number of rows in cart:" + cartitems.size());

        return (cartitems.size());

    }

    public boolean ProductInCartCheck(String productName) {

        if (driver.findElement(By.id("cart-detail")).findElement(By.linkText(productName)).isDisplayed())
            return true;

        else return false;


    }


       //public String ProductNameInCartCheck(String cartProductName){
        //List<WebElement> element = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));
        //String productName = element.get(0).getText();
        //System.out.println("Product added in cart"+productName);
        //return productName.contains(cartProductName);

    //}



}