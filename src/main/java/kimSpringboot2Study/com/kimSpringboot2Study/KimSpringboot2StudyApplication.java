package kimSpringboot2Study.com.kimSpringboot2Study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KimSpringboot2StudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KimSpringboot2StudyApplication.class, args);
	}

	@GetMapping
	public String Helloworld(){
		return "Hello World";
	}
}