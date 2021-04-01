package teste;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class TesteApi {
	
	@Test
	public void teste () {
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200);
		
	}

}
