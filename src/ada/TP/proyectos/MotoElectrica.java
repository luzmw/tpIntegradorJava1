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
        MotoElectrica me = new MotoElectrica();
        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new ArrayList<>();

        //datos propietario
        System.out.println("Nombre del propietario");
        p.agregarARegistro();
        me.setPropietario(p);

        //asignar patenta y fecha de alta
        LocalDate fechaDeAlta= LocalDate.now();
        me.setFechaDeAlta(fechaDeAlta);

        //boolean o if tiene conductores
        int op = 0;
        do {
            System.out.println("Ingre el nombre del conductor autorizado, sino, ingrese 0");
            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= Integer.parseInt(scanner.nextLine());
        }while (op!=0);
        me.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+me.verDetalles());

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
