package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringbootValidationApplication {
	
	@RequestMapping("/mainend")
	public String hi() {
		return "Making main application as a controller in SB";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootValidationApplication.class, args);
	}

}
