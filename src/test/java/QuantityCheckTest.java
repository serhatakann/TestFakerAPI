import org.testng.annotations.Test;

import java.net.http.HttpResponse;
import java.util.Map;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class QuantityCheckTest {


    @Test
    public void SingleQuantityTest(){
        when().get("https://fakerapi.it/api/v1/companies?_quantity=1&_locale=en_US").then().
                statusCode(200)
                .body("total",equalTo(1))
                .body("data.name.size()",equalTo(1));
        
    };
    @Test
    public void TwoQuantityTest(){
        when().get("https://fakerapi.it/api/v1/companies?_quantity=2&_locale=en_US").then().
                statusCode(200)
                .body("total",equalTo(2))
                .body("data.name.size()",equalTo(2));

    };




}
