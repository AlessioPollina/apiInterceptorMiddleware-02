package co.develhope.apiInterceptorMiddleware02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("")
    public String welcomeMessage(){
        return "Welcome!";
    }
}
