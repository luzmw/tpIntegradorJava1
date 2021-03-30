package ada.TP.proyectos;

public class AutoElectrico  extends Automotor implements VehiculoElectrico, Registrable{

    public AutoElectrico() {
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
        return super.verDetalles();
    }
}
