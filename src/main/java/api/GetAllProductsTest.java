package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GetAllProductsTest {

    @Test
    public void verifyGetAllProducts() {
        RestAssured.baseURI = "https://automationexercise.com/api";

        Response res = RestAssured
                .given()
                .get("/productsList");

        res.prettyPrint();
        assertEquals(res.statusCode(), 200);
        assertEquals(res.jsonPath().getString("products[0].category.category"), "Tops"); // Example check
    }
}
