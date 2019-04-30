package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleTest {

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");

    }

   @BeforeMethod
    public void Beforemethod(){

        System.out.println("Before Method");
   }

    @Test
    public void Printcheck(){

        System.out.println("Print check");
       // SoftAssert()
    }
    @AfterMethod
    public void AfterMethod(){

        System.out.println("After Method");
    }
}

