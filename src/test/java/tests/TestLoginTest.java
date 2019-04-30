package tests;


//import com.sun.tools.doclint.Messages;
import Pages.Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class TestLoginTest extends BaseTest{



    @Test
    public void testLogin() {

     Loginpage loginpage= new Loginpage(driver);
     loginpage.login("spree@example.com","spree123");

    }


}
