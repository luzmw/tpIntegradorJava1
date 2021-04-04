package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utilitario extends  Automotor implements Registrable, VehiculoACombustion{



    public Utilitario() {
    }

    public Utilitario(Propietario propietario) {
        super(propietario);
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
        Utilitario u = new Utilitario();

        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new ArrayList<>();



        //datos propietario
        System.out.println("Nombre del propietario");
        p.agregarARegistro();
        u.setPropietario(p);

        //asignar patenta y fecha de alta
        LocalDate fechaDeAlta= LocalDate.now();
        u.setFechaDeAlta(fechaDeAlta);

        //boolean o if tiene conductores
        int op = 0;
        do {
            System.out.println("Ingre el nombre del conductor autorizado, sino, ingrese 0");
            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= Integer.parseInt(scanner.nextLine());
        }while (op!=0);
        u.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+u.verDetalles());

    }

    @Override
    public String verDetalles() {
        return null;
    }


    @Override
    public void indicarlitrosNafta() {

    }
}
