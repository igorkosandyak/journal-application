package pac;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pac.models.Journal;
import pac.repository.JournalRepository;

@SpringBootApplication
public class JournalApplication {

    @Bean
    InitializingBean saveData(JournalRepository journalRepository) {
        System.out.println("saveData() called.");
        return () -> {
          journalRepository.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2018"));
          journalRepository.save(new Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", "05/01/2018"));
          journalRepository.save(new Journal("Spring Boot Reading", "Read more about Spring Boot", "19/03/2018"));
          journalRepository.save(new Journal("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "05/05/2018"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(JournalApplication.class, args);
    }
}
