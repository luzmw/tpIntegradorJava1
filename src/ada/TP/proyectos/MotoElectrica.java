package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MotoElectrica extends Automotor implements VehiculoElectrico, Registrable {


    public MotoElectrica(Propietario propietario) {
        super(propietario);
    }

    public MotoElectrica() {
    }

    public MotoElectrica(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
    }

    @Override
    public String indicarVoltaje() {
        return this.getVoltaje();
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
}
