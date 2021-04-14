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
        AutoElectrico ae= new AutoElectrico();
        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new ArrayList<>();



        //datos propietario
        System.out.println("Nombre del propietario");
        p.agregarARegistro();
        ae.setPropietario(p);

        //asignar patenta y fecha de alta
        LocalDate fechaDeAlta= LocalDate.now();
        ae.setFechaDeAlta(fechaDeAlta);

        //boolean o if tiene conductores
        int op = 0;
        do {
            System.out.println("Ingre el nombre del conductor autorizado, sino, ingrese 0");
            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= Integer.parseInt(scanner.nextLine());
        }while (op!=0);
        ae.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+ae.verDetalles());

    }

    @Override
    public String verDetalles() {
        return super.verDetalles();
    }
}
