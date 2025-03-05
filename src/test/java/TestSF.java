import RestAssured.EstablishSFConnection;
import org.testng.annotations.Test;

public class TestSF {

    @Test
    public void SF_Login(){
        EstablishSFConnection sfConnection = new EstablishSFConnection();
        sfConnection.connectSF();
        System.out.println("Successfully connected");
    }

}
