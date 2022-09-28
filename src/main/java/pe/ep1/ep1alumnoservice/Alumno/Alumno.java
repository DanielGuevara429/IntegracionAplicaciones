package pe.ep1.ep1alumnoservice.Alumno;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Alumno {
    Integer ID;
    String nombre;
    String apellido;
    String dni;
    String curso;

}
