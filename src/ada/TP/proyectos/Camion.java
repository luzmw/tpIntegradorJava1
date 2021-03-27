package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Camion extends  Automotor implements  Registrable{

    private double tara;
    private double mma;

    public Camion() {
    }

    public Camion(Persona propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, double tara, double mma) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tara = tara;
        this.mma = mma;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getMma() {
        return mma;
    }

    public void setMma(double mma) {
        this.mma = mma;
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

        return "camión"+tara + mma+ this.getPropietario();
    }
}
