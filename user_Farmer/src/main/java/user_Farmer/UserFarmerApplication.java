package user_Farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import user_Farmer.model.Farmer;
import user_Farmer.repository.FarmerRepository;

@SpringBootApplication
public class UserFarmerApplication implements CommandLineRunner {
	@Autowired
	private FarmerRepository FR;
	public static void main(String[] args) {
		SpringApplication.run(UserFarmerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(FR.findAll().isEmpty()) {
			FR.save(new Farmer(1,"FirstFarmer",55555,"F1@gmail.com"));
			FR.save(new Farmer(2,"SecondFarmer", 88776,"F2@gmail.com"));
			FR.save(new Farmer(4,"FourthFarmer",99966,"F4@gmail.com"));
		}
	}
}
