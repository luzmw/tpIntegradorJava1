package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Auto extends  Automotor implements Registrable , VehiculoACombustion {
    private Integer cantidadPuertas;

    public Auto() {
    }

    public Auto(Persona propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, Integer cantidadPuertas) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
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
        Auto auto = new Auto();
        return "el auto " + cantidadPuertas+ super.getFechaDeAlta()+ super.getConductoresAutorizados();
    }
}

