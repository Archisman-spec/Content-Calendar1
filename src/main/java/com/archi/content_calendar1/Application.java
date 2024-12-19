package com.archi.content_calendar1;

import com.archi.content_calendar1.model.Content;
import com.archi.content_calendar1.model.Status;
import com.archi.content_calendar1.model.Type;
import com.archi.content_calendar1.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content content = new Content(null,
					"Arch blog post",
					"My 2nd blog post",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}

}
