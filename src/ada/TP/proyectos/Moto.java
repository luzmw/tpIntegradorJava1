package ada.TP.proyectos;

public class Moto extends Automotor  implements  VehiculoACombustion, Registrable{
    private String tipoMoto;

    public Moto() {
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
    public void indicarlitrosNafta() {

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
