import io.restassured.mapper.ObjectMapper;
import io.restassured.response.ValidatableResponse;
import org.codehaus.groovy.control.io.StringReaderSource;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;


import static io.restassured.RestAssured.when;

import static org.hamcrest.Matchers.*;

public class TextCreateCharacterCheckTest {
    @Test
    public void CharacterNAContentTest() {
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=").then()
                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.content", notNullValue());


    }

    @Test
    public void CharacterZeroContentTest() {
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=0").then()
                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.content", notNullValue());


    }


    @Test
    public void CharacterTwoHundredContentTest() throws IOException {
String a1 = new String();
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=200").then()

                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.content",anything());
        System.out.println(a1);



    }
    @Test
    public void CharacterFiveHundredContentTest() throws IOException {
        String a1 = new String();
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=500").then()

                .statusCode(200)
                .body("total", equalTo(1))
                .body("data.content",anything());
        System.out.println(a1);



    }


}
