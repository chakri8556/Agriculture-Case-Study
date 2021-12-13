package com.crop.crop_list.resource;

import com.crop.crop_list.model.Crop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

class CropResourceTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    private Object HttpStatus;
    private Object FirstFarmer;

    @Test
    void givenfindAllcrop_GetfindAllcropEndpoint_ShouldReturncropList(){
        String baseurl = "http://localhost:" + port + "/findAllcrop";
        ResponseEntity<Crop[]> response = restTemplate.getForEntity(baseurl, Crop[].class);
    }

    private void assertThat(org.springframework.http.HttpStatus response) {
    }
    @Test
    void givenNewcrop_PostadddcropEndpoint_ShouldAddNewcrop(){
        String baseurl = "http://localhost:" + port + "/addcrop";
        ResponseEntity<Crop[]> response = restTemplate.postForEntity(baseurl, FirstFarmer, Crop[].class);

    }
    @Test
    void givenDeletecrop_DeleteExistingcropEndpoint_ShouldDeleteExistingcrop(){
        String baseurl = "http://localhost:" + port + "/delete/{cropid}";
    }
    @Test
    void givenfindcropbyid_GetcropbyidEndpoint_ShouldReturndetailsofthatparticularcrop(){
        String baseurl = "http://localhost:" + port + "/findcrop/{cropid}";
    }
    @Test
    void givenupdatebyid_PutupdatebyidEndpoint_ShouldReturncropupdatedwithid(){
        String baseurl = "http://localhost:" + port + "/update/{id}";
    }
    @Test
    void giveneditbyid_PuteditbyidEndpoint_ShouldReturncropeditedwithid(){
        String baseurl = "http://localhost:" + port + "/edit/{id}";
    }

}