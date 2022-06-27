package edu.escuelaing.arsw.Controller;

import javax.annotation.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class DrawController {
    
    @Resource
    private HttpServletRequest request;

    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = "application/json")
    public String status() {
        sessionManagement();
        String name = (String) request.getSession().getAttribute("name");
        return "{\"status\":\"Greetings from Spring Boot. "
                + name + " , "
                + java.time.LocalDate.now() + ", "
                + java.time.LocalTime.now()
                + ". " + "The server is Runnig!\"}";
    }

    @GetMapping("/setname")
    public String setName(@RequestParam(value = "name", defaultValue = "Anónimo") String name) {
        request.getSession().setAttribute("name", name);
        return String.format("Hello %s!", name);
    }

    public void sessionManagement() {
        System.out.println(request.getSession(true).getId());
    }
}
