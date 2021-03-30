package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class MotoElectrica extends Automotor implements VehiculoElectrico, Registrable {


    public MotoElectrica(Propietario propietario) {
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
        String fechaAlta = super.getFechaDeAlta().toString();
        //patente
        String autorizados = "";
        String propietario= super.getPropietario().verDetalles();

        for(Conductor c :super.getConductoresAutorizados()){
            // c.verDetalles() // tenés que completar este método
            autorizados += c.getNroLicenciaConducir()+" "+c.verDetalles();
        }
        return "el auto tiene  " + " puertas, fecha: " + fechaAlta+ " - autorizados: " +propietario;
    }
}
