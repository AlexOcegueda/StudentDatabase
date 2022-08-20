package FirstProject.springbootstarter.springbootstarterhi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*
     *
     *  this tells the framework that whenever there's a request
     *  for /hello to redirect it to this
     *
     */
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
