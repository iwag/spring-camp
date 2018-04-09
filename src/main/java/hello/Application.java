package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(UserRepository repository) {
//        return args -> {
//
//            repository.save(new User("Jack", "Bauer"));
//            repository.save(new User("Chloe", "O'Brian"));
//            repository.save(new User("Kim", "Bauer"));
//            repository.save(new User("David", "Palmer"));
//            repository.save(new User("Michelle", "Dessler"));
//
//            log.info("findAll");
//            for (User u : repository.findAll()) {
//                log.info(u.toString());
//            }
//
//            log.info("findById(1L)");
//            repository.findById(1L).ifPresent(
//                    user -> {
//                        log.info(user.toString());
//                    }
//            );
//
//            log.info("findbyname(Bauer)");
//            repository.findByLastName("Bauer").forEach(
//                    user -> {
//                        log.info(user.toString());
//                    }
//            );
//
//        };
//    }
}
