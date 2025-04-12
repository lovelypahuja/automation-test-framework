package tests;

import api.ProductApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductApiTest {

    @Test
    public void testSearchProduct() {
        Response res = ProductApi.searchProduct("Tshirt");
        Assert.assertEquals(res.statusCode(), 200);
        Assert.assertTrue(res.getBody().asString().contains("Tshirt"));
    }
}
