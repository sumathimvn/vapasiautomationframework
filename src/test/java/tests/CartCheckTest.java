package tests;

import Pages.ProductListPage;
import Pages.ShoppingCartPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class CartCheckTest extends BaseTest {

    private String cartProductName;

    @Test(dataProvider="getAddingCartParameters")
    public void checkCartItems(String productName, String quantity) {

        ProductListPage productListPage = new ProductListPage(driver);
       // ShoppingCartPage shoppingCartPage = productListPage.selectProduct("Ruby on Rails Bag").addProductToCart("3");

        ShoppingCartPage shoppingCartPage = productListPage.selectProduct(productName).addProductToCart(quantity);

        //System.out.println("Product", +shoppinCartPage(Product) "is added with quantity",+shoppingCartPage(addProductToCart));

        System.out.println("Product is available in shopping cart");

        int numberOfProductsInCart = shoppingCartPage.getNoOfProducts();
        System.out.println("Total number of products added in cart:" + numberOfProductsInCart);
        assertEquals(1, numberOfProductsInCart);

        //System.out.println("Productname added in Cart:"+ shoppingCartPage.ProductNameInCartCheck(cartProductName));



    }

    @DataProvider(name="getAddingCartParameters")
    public Object[][] getAddingCartParameters(){

        return new Object[][]

                {
                        {"Ruby on Rails Bag", "3"},
                        {"Ruby on Rails Tote", "1"}

                };

    }

}