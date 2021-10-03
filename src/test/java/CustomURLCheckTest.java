import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CustomURLCheckTest {
    @Test
    public void CustomURLNameCheck() {

        when().get("https://fakerapi.it/api/v1/custom?_quantity=1&name=name&lmd=dateTime&phoneNumber=phone&description=text").then()
                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.name.size()", equalTo(1));




    }
    @Test
    public void CustomURLTimeCheck() {

        when().get("https://fakerapi.it/api/v1/custom?_quantity=1&name=name&lmd=dateTime&phoneNumber=phone&description=text").then()
                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.lmd.size()",equalTo(1))
                .body("data.lmd.date.size()",equalTo(1))
                .body("data.lmd.timezone_type.size()",equalTo(1))
                .body("data.lmd.timezone.size()",equalTo(1));


    }
    @Test
    public void CustomURLPhoneCheck() {

        when().get("https://fakerapi.it/api/v1/custom?_quantity=1&name=name&lmd=dateTime&phoneNumber=phone&description=text").then()
                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.phoneNumber.size()", equalTo(1));


    }
    @Test
    public void CustomURLDescriptionCheck() {

        when().get("https://fakerapi.it/api/v1/custom?_quantity=1&name=name&lmd=dateTime&phoneNumber=phone&description=text").then()
                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.description.size()", equalTo(1));


    }
}
