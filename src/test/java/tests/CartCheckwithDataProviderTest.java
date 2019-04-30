package tests;

import Pages.ProductListPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartCheckwithDataProviderTest extends BaseTest {



    @Test(dataProvider="getAddingCartParameters")
    public void cartTestwithDataProvider(String productName, int quantity)

    {


        ProductListPage productListPage = new ProductListPage(driver);

    }


    }


