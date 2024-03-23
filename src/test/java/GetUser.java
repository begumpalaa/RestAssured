import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class GetUser {
    public static void main(String[] args) {

        String userUUID = "string";

        // İstek yapılacak URL
        String url = "https://demoqa.com/Account/v1/User/" + userUUID;


        // 2. İstek başlıklarını belirleyin (opsiyonel)
        String contentType = ContentType.JSON.toString();



        String token = AuthTokenHolder.TOKEN;
        Map<String, Object> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        headers.put("Authorization", "Bearer " + token);


        // 3. GET isteğini gönderin
        Response response = RestAssured.given()
                .contentType(contentType)
                .headers(headers)
                .when().log().headers()
                .get(url);

        response.then().log().all()
                .statusCode(401)
                .body("code",equalTo("1207"))
                .body("message",equalTo("User not found!"));



    }
}
