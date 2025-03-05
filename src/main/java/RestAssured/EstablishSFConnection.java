package RestAssured;

import static io.restassured.RestAssured.given;

public class EstablishSFConnection {

    public String connectSF() {
        return given().log().all()
                .urlEncodingEnabled(true).
                param("username","harishk4078@gmail.com")
                .param("password","Service1c9WYhCpjG2AtX7spNtSp9BOD")
                .param("client_id","3MVG9WVXk15qiz1LInrNcYflxh6ww.ng3v3CRzuCXYfTHe7cxiANPKyGOSFGVGS2WT3XRWchNr14HlDITQiLT")
                .param("client_secret","944904B288BE0A801D96ACAB987E336E1A71B600FDC1FB35D273CED6E85107A5")
                .param("grant_type","password")
                .header("Accept","application/json")
                .header("Content-type","application/x-www-form-urlencoded")
                .when().post("https://login.salesforce.com/services/oauth2/token")
                .then().log().body().extract().path("access_token");

    }
}
