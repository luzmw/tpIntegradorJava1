package ada.TP.proyectos;

public class MotoElectrica extends Automotor implements VehiculoElectrico{

    public MotoElectrica() {
    }

    @Override
    public double indicarVoltaje() {
        return 0;
    }
}
