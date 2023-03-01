package co.develhope.apiInterceptorMiddleware02.Controllers;

import co.develhope.apiInterceptorMiddleware02.Entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("")
    public Month getMonth(HttpServletRequest request){
        Month month = (Month) request.getAttribute("monthNumber");
        return month;
    }
}
