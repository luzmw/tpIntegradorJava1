package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Moto extends Automotor  implements  VehiculoACombustion, Registrable{
    private String tipoMoto;

    public Moto() {
    }

    public Moto(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, String tipoMoto) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tipoMoto = tipoMoto;
    }

    public Moto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public int indicarlitrosNafta() {
        return this.getLitrosDeNafta();

    }

    @Override
    public void asignarDiaDeAlta() {

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

    @Override
    public String stringgetPatente() {
        return super.stringgetPatente();
    }
}
