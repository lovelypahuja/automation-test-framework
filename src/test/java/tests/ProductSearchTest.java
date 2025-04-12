package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class ProductSearchTest extends BaseTest {

    @Test
    public void searchProductTest() {
        HomePage home = new HomePage(driver);
        home.goToProductsPage();

        ProductsPage product = new ProductsPage(driver);
        product.searchProduct("Jeans");

        // TODO: Assert product exists in result list
    }
}
