package ada.TP.proyectos;

public class AutoElectrico  extends Automotor implements VehiculoElectrico {

    public AutoElectrico() {
    }

    @Override
    public double indicarVoltaje() {
        return 0;
    }
}
