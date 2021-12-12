package user_Farmer.resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import user_Farmer.model.Farmer;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class FarmerResourceTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    private Object HttpStatus;
    private Object FirstFarmer;

    @Test
    void givenfindAllfarmer_GetfindAllfarmerEndpoint_ShouldReturnfarmerList(){
        String baseurl = "http://localhost:" + port + "/findAllfarmer";
        ResponseEntity<Farmer[]> response = restTemplate.getForEntity(baseurl, Farmer[].class);
    }

    private void assertThat(org.springframework.http.HttpStatus response) {
    }
    @Test
    void givenNewfarmer_PostaddfarmerEndpoint_ShouldAddNewfarmer(){
        String baseurl = "http://localhost:" + port + "/addfarmer";
        ResponseEntity<Farmer[]> response = restTemplate.postForEntity(baseurl, FirstFarmer, Farmer[].class);

    }
    @Test
    void givenDeletefarmer_DeleteExistingfarmerEndpoint_ShouldDeleteExistingfarmer(){
        String baseurl = "http://localhost:" + port + "/delete/{farmerid}";
    }
    @Test
    void givenfindfarmerbyid_GetfarmerbyidEndpoint_ShouldReturndetailsofthatparticularfarmer(){
        String baseurl = "http://localhost:" + port + "/findfarmer/{farmerid}";
    }
    @Test
    void givenupdatebyid_GetupdatebyidEndpoint_ShouldReturnfarmerupdatedwithid(){
        String baseurl = "http://localhost:" + port + "/update/{id}";
    }
    @Test
    void giveneditbyid_GeteditbyidEndpoint_ShouldReturnfarmereditedwithid(){
        String baseurl = "http://localhost:" + port + "/edit/{id}";
    }



}