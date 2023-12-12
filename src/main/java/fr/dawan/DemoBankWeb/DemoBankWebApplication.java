package fr.dawan.DemoBankWeb;

import fr.dawan.demobank.DemoBankApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBankWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBankWebApplication.class, args);
		DemoBankApplication.activateDiscordBot(args[0]);
	}

}
