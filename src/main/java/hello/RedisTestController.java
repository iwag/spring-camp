package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    RedisCache cache;

    @RequestMapping("/redis")
    public String hello(@RequestParam(name = "name", defaultValue = "test") String name, @RequestParam(name = "value", defaultValue = "", required = false) String value) {
        if (value.isEmpty()) {
            return cache.get(value);
        } else {
            cache.set(name, value);
            return value;
        }
    }

}
