package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static base_url.AutomationExcerciseBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class API_AutomationExcerciseStepDefs {

    Response response;

    @Given("Kullanici request gonderir")
    public void kullanici_request_gonderir() {
        spec.pathParams("first", "api", "second", "productsList");
        response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("Kullanici gelen response datalari dogrular")
    public void kullanici_gelen_response_datalari_dogrular() {
        assertEquals(200, response.statusCode());

        List<String> brands = response.jsonPath().getList("products.brand");
        System.out.println("brands = " + brands);
        assertTrue(brands.contains("Polo"));

        List<Integer> ids = response.jsonPath().getList("products.id");
        System.out.println("ids = " + ids);

        JsonPath jsonPath = response.jsonPath();
        List<String> names = jsonPath.getList("products.findAll{it.id>40}.name");
        System.out.println("names = " + names);
    }
}
