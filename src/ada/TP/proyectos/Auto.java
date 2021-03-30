package ada.TP.proyectos;

import javax.security.auth.login.AccountExpiredException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Auto extends  Automotor implements Registrable , VehiculoACombustion {
    private Integer cantidadPuertas;

    public Auto() {
    }

    public Auto(Propietario propietario, Integer cantidadPuertas) {
        super(propietario);
        this.cantidadPuertas = cantidadPuertas;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
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
    public void indicarlitrosNafta() {

    }
//TODO mostrar objeto
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
        return "el auto tiene  " + cantidadPuertas+ " puertas, fecha: " + fechaAlta+ " - autorizados: " +propietario;
    }
}

