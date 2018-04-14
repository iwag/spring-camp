package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class GithubController {

    @Autowired
    GithubLookupService service;

    @RequestMapping("/github")
    public GithubUser find(@RequestParam(name = "name", defaultValue = "") String name) throws Exception {
        return service.findUser(name).get();
    }
}
