package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

  WebDriver driver;

  public ProductListPage(WebDriver driver){

      this.driver = driver;
  }


    public ProductDetailsPage selectProduct(String item)
    {

        driver.findElement(By.linkText(item)).click();

        return new ProductDetailsPage(driver);
    }



}
