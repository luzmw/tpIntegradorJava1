package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Automotor {
    Persona  propietario;
    List<Persona> conductoresAutorizados;
    String tipoDeUso;
    String patente;
    LocalDate fechaDeAlta;


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }




    public Automotor(Persona propietario) {
        this.propietario = propietario;
    }


}
