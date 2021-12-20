package user_Farmer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import user_Farmer.model.Farmer;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class UserFarmerApplication{

	public static void main(String[] args) {
		SpringApplication.run(UserFarmerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}



