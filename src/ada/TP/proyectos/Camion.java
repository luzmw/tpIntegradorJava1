package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Camion extends  Automotor implements  Registrable{

    private double tara;
    private double mma;

    public Camion() {
    }

    public Camion(Propietario propietario, double tara) {
        super(propietario);
        this.tara = tara;
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
        Double mma = this.mma;
        Double tara= this.tara;
        String fechaAlta = super.getFechaDeAlta().toString();
        //patente
        String autorizados = "";
        String propietario= super.getPropietario().verDetalles();

        for(Conductor c :super.getConductoresAutorizados()){
            // c.verDetalles() // tenés que completar este método
            autorizados += c.getNroLicenciaConducir()+" "+c.verDetalles();
        }
        return "Datos del vehículo Camión: tara  " + tara+ "  mma "+mma+ " puertas, fecha: " + fechaAlta+ " - autorizados: " +propietario;
    }
}
