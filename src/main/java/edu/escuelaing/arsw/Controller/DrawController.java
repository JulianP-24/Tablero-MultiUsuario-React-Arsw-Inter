package edu.escuelaing.arsw.Controller;

import java.util.ArrayList;

import javax.annotation.*;
import java.util.logging.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.escuelaing.arsw.Model.Datos;
import edu.escuelaing.arsw.Service.Memoria;
import com.fasterxml.jackson.core.JsonProcessingException;

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
        Memoria.getInstance().add(name);
        return String.format("Hello %s!", name);
    }

    public void sessionManagement() {
        System.out.println(request.getSession(true).getId());
    }

    @PostMapping("/addData")
    @ResponseBody
    public void addPoint(@RequestParam(value = "data") String x) {
        String name = (String) request.getSession().toString();
        if (x != null && !x.isEmpty()) {
            String[] a = x.split(",");
            Double dx = Double.parseDouble(a[0]);
            Double dy = Double.parseDouble(a[1]);
            Memoria.getInstance().addd(new Datos(name, dx, dy));
        }
        

    }

    @GetMapping("/getdraw")
    public String getDibujo() {
        try {
            ArrayList<Datos> tem = Memoria.getInstance().getDatos();
            String name = (String) request.getSession().toString();
            ArrayList<Datos> enviar = new ArrayList<Datos>();
            enviar.clear();
            ObjectMapper map = new ObjectMapper();

            for (Datos Dat : tem) {
                if (!Dat.getUser().equals(name)) {
                    enviar.add(Dat);
                }
            }
            String jsonString = map.writeValueAsString(enviar);
            return jsonString;

        } catch (JsonProcessingException ex) {
            Logger.getLogger(Memoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "no hay nada";
    }
}
