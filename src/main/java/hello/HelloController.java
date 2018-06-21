package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hello.repository.KusaRecordResository;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello!!!";
    }

}
