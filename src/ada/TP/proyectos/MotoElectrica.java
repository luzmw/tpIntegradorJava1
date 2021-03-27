package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class MotoElectrica extends Automotor implements VehiculoElectrico, Registrable {


    public MotoElectrica(Persona propietario) {
        super(propietario);
    }

    public MotoElectrica() {
    }

    @Override
    public double indicarVoltaje() {
        return 0;
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
