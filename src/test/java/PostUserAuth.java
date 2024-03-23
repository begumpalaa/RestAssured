import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.GetUsersResponse;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PostUserAuth {
    public static void main(String[] args) {

        // İstek yapılacak URL
        String url = "https://demoqa.com/Account/v1/Authorized";


        Map<String, Object> header = new HashMap<>();
        //header.put("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImJlZ3VtIiwicGFzc3dvcmQiOiJUZXN0MTIzNDU2ISIsImlhdCI6MTcxMTE5MTI0MH0.siGgnxWiTGb5HO_BTQMbfwbC_--r2r7f0Cz2thPdUXM");
        header.put("Accept","application/json");


        String requestBody = "{\"userName\": \"begum\",\n" +
                "  \"password\": \"Test123456!\"}";

        String contentType = ContentType.JSON.toString();

        // 4. POST isteğini gönderin
        Response response = RestAssured.given()
                .contentType(contentType)
                .headers(header)
                .body(requestBody)
                .when().log().all()
                .post(url);

        // 5. Yanıtı işleyin ve doğrulamalar yapın
        response.then().log().body();

        assertThat(response.statusCode()).isEqualTo(200);
        AuthTokenHolder.TOKEN = response.then().extract().path("token");

    }
}
