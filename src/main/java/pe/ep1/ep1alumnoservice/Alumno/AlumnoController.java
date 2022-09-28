package pe.ep1.ep1alumnoservice.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Alumno> getAll(){

        Alumno alumno= Alumno.builder()
                .ID(1)
                .nombre("Daniel")
                .apellido("Guevara")
                .dni("72548509")
                .curso("Integracion Aplicaciones")
                .build();

        Alumno alumno2= Alumno.builder()
                .ID(2)
                .nombre("Rodrigo")
                .apellido("Lovera")
                .dni("72548579")
                .curso("Desarrollo Ios")
                .build();


      return List.of(alumno,alumno2);
    }

}
