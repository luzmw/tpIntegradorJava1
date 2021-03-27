package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Utilitario extends  Automotor implements Registrable{



    public Utilitario() {
    }

    public Utilitario(Persona propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
    }

    @Override
    public void asignarDiaDeAlta() {

    }

    @Override
    public void asignarLicencia() {

    }

    @Override
    public void asignarPatente() {

    }

    @Override
    public void agregarARegistro() {

    }

    @Override
    public String verDetalles() {
        return null;
    }
}
