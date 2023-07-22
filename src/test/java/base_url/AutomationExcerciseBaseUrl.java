package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class AutomationExcerciseBaseUrl {
    public static RequestSpecification spec;

    @Before
    public static void setUp(){

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("https://automationexercise.com/").
                build();
    }
}
