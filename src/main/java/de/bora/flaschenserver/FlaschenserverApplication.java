package de.bora.flaschenserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FlaschenserverApplication {

	private static final Logger logger = LoggerFactory.getLogger(FlaschenserverApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(FlaschenserverApplication.class, args);



	}
	@Bean
	protected CommandLineRunner demoFlaschenEinfügen(FlascheRepository flascheRepository){
		return args -> {
			FlascheEntity f1= new FlascheEntity("Cola",0.25);
			FlascheEntity f2= new FlascheEntity("Clubmate",0.18);
			FlascheEntity f3= new FlascheEntity("Paderborner",0.08);

			flascheRepository.save(f1);
			logger.info("Demoflasche eingefügt:{}",f1);
			flascheRepository.save(f2);
			logger.info("Demoflasche eingefügt:{}", f2);
			flascheRepository.save(f3);
			logger.info("Demoflasche eingefügt:{}", f3);

		};
	}

}
