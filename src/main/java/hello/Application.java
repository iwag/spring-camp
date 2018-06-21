package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



//    @Bean
//    public CommandLineRunner commandLineRunner(UserRepository hello.repository) {
//        return args -> {
//
//            hello.repository.save(new User("Jack", "Bauer"));
//            hello.repository.save(new User("Chloe", "O'Brian"));
//            hello.repository.save(new User("Kim", "Bauer"));
//            hello.repository.save(new User("David", "Palmer"));
//            hello.repository.save(new User("Michelle", "Dessler"));
//
//            log.info("findAll");
//            for (User u : hello.repository.findAll()) {
//                log.info(u.toString());
//            }
//
//            log.info("findById(1L)");
//            hello.repository.findById(1L).ifPresent(
//                    user -> {
//                        log.info(user.toString());
//                    }
//            );
//
//            log.info("findbyname(Bauer)");
//            hello.repository.findByLastName("Bauer").forEach(
//                    user -> {
//                        log.info(user.toString());
//                    }
//            );
//
//        };
//    }


}
