import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.responseSpecification;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class TextCreateCheckTest {
    @Test
    public void DataTitleTest(){
        when().get("https://fakerapi.it/api/v1/texts?_quantity=5&_locale=tr_TR&_characters=50").then().
                statusCode(200)
                .body("total",equalTo(5))
                .body("data.title.size()",equalTo(5));


    };
    @Test
    public void DataAuthorTest(){
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=50").then().
                statusCode(200)
                .body("total",equalTo(1))
                .body("data.author.size()",equalTo(1));

    };
    @Test
    public void DataGenreTest(){
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=50").then().
                statusCode(200)
                .body("total",equalTo(1))
                .body("data.genre.size()",equalTo(1));

    };
    @Test
    public void DataContentTest(){
        when().get("https://fakerapi.it/api/v1/texts?_quantity=1&_locale=tr_TR&_characters=50").then().
                statusCode(200)
                .body("total",equalTo(1))
                .body("data.content.size()",equalTo(1));

    };
}
