package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class Loginpage {

    private WebDriver driver;

    @FindBy(id = "link-to-login")
            @CacheLookup
    WebElement login_link;
    @FindBy (id ="spree_user_email")
    WebElement emailid;
    @FindBy(id ="spree_user_password")
    WebElement userpassword;



    public Loginpage(WebDriver driver) {

        this.driver = driver;

    }
        public ProductListPage login(String username, String password)
        {

            driver.navigate().to("https://spree-vapasi.herokuapp.com");

            login_link.click();
            emailid.sendKeys("spree@example.com");
            userpassword.sendKeys("spree123");
            driver.findElement(By.name("commit")).click();
            PageFactory.initElements(driver, this);
            return new ProductListPage(driver);

        }


}