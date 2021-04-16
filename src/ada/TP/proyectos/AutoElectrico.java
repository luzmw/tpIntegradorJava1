package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AutoElectrico  extends Automotor implements VehiculoElectrico, Registrable{

    public AutoElectrico() {
    }

    public AutoElectrico(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
    }

    @Override
    public String indicarVoltaje() {
        return super.indicarVoltaje();
    }

    @Override
    public void asignarDiaDeAlta() {

    }


    @Override
    public void asignarPatente() {

    }

    @Override
    public void agregarARegistro() {
        System.out.println("Vehículo registrado : "+this.verDetalles());
        System.out.println("desea agregar mas vehículos? 1 -si 3-no");
        int op = 0;
        op= scanner.nextInt();
        do{
            super.agregarARegistro();
        }while (op!=0);


    }

    @Override
    public String verDetalles() {
        return super.verDetalles();
    }
}
