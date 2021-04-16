package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utilitario extends  Automotor implements Registrable, VehiculoACombustion{


    public Utilitario(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
    }

    public Utilitario() {
    }


    public Utilitario(Propietario propietario) {
        super(propietario);
    }

    @Override
    public void asignarDiaDeAlta() {
        super.asignarDiaDeAlta();
    }



    @Override
    public void asignarPatente() {
        super.asignarPatente();
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
        return null;
    }


    @Override
    public int indicarlitrosNafta() {
        return this.getLitrosDeNafta();
    }
}
