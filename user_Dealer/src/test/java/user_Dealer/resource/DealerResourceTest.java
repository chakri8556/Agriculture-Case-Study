package user_Dealer.resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import user_Dealer.model.Dealer;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
    @SpringBootTest(webEnvironment = RANDOM_PORT)
    class DealerResourceTest {

        @LocalServerPort
        private int port;

        @Autowired
        private TestRestTemplate restTemplate;
        private Object HttpStatus;
        private Object FirstFarmer;

        @Test
        void givenfindAlldealer_GetfindAlldealerEndpoint_ShouldReturndealerList(){
            String baseurl = "http://localhost:" + port + "/findAlldealer";
            ResponseEntity<Dealer[]> response = restTemplate.getForEntity(baseurl, Dealer[].class);
        }

        private void assertThat(org.springframework.http.HttpStatus response) {
        }
        @Test
        void givenNewdealer_PostadddealerEndpoint_ShouldAddNewdealer(){
            String baseurl = "http://localhost:" + port + "/adddealer";
            ResponseEntity<Dealer[]> response = restTemplate.postForEntity(baseurl, FirstFarmer, Dealer[].class);

        }
        @Test
        void givenDeletedealer_DeleteExistingdealerEndpoint_ShouldDeleteExistingdealer(){
            String baseurl = "http://localhost:" + port + "/delete/{dealerid}";
        }
        @Test
        void givenfinddealerbyid_GetdealerbyidEndpoint_ShouldReturndetailsofthatparticulardealer(){
            String baseurl = "http://localhost:" + port + "/finddealer/{dealerid}";
        }
        @Test
        void givenupdatebyid_PutupdatebyidEndpoint_ShouldReturndealerupdatedwithid(){
            String baseurl = "http://localhost:" + port + "/update/{id}";
        }
        @Test
        void giveneditbyid_PuteditbyidEndpoint_ShouldReturndealereditedwithid(){
            String baseurl = "http://localhost:" + port + "/edit/{id}";
        }
        @Test
        void givenviewbyid_PutviewbyEndpoint_ShouldReturndealerisviewinghisprofilewithid(){
            String baseurl = "http://localhost: + port + /view/{id}";
        }
        @Test
        void giveninactivatebyid_PutinactivatebyidEndpoint_ShouldReturndealerinactivatedwithid(){
            String baseurl = "http://localhost: + port + /inactivate/{id}";
        }
        @Test
        void givenactivatebyid_PutactivatebyidEndpoint_ShouldReturndealeractivatedwithid(){
            String baseurl = "http://localhost: + port + /activate/{id}";
        }




    }
