package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static config.ConfigManager.get;

public class ProductApi {

    public static Response searchProduct(String keyword) {
        return RestAssured.given()
                .baseUri(get("api.base.url"))
                .basePath("/searchProduct")
                .formParam("search_product", keyword)
                .when()
                .post();
    }
}
