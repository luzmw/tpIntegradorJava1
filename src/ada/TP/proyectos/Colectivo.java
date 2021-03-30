package ada.TP.proyectos;

public class Colectivo  extends  Automotor implements  VehiculoACombustion, Registrable{
    private Integer cantidadAsientos;

    public Colectivo() {
    }

    public Integer getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(Integer cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public void indicarlitrosNafta() {

    }

    @Override
    public void asignarDiaDeAlta() {
        super.asignarDiaDeAlta();
    }

    @Override
    public void asignarLicencia() {
        super.asignarLicencia();
    }

    @Override
    public void asignarPatente() {
        super.asignarPatente();
    }

    @Override
    public void agregarARegistro() {
        super.agregarARegistro();
    }

    @Override
    public String verDetalles() {
        return super.verDetalles();
    }
}



