package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colectivo  extends  Automotor implements  VehiculoACombustion, Registrable{
    private Integer cantidadAsientos;
    Scanner scanner = new Scanner(System.in);

    public Colectivo() {
    }

    public Integer getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(Integer cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public void indicarlitrosNafta() {

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
        Colectivo co = new Colectivo();

        System.out.println("Ingrese la cantidad de asientos" );
        cantidadAsientos = Integer.parseInt(scanner.nextLine());
        co.setCantidadAsientos(cantidadAsientos);

        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new ArrayList<>();



        //datos propietario
        System.out.println("Nombre del propietario");
        p.agregarARegistro();
        co.setPropietario(p);

        //asignar patenta y fecha de alta
        LocalDate fechaDeAlta= LocalDate.now();
        co.setFechaDeAlta(fechaDeAlta);

        //boolean o if tiene conductores
        int op = 0;
        do {
            System.out.println("Ingre el nombre del conductor autorizado, sino, ingrese 0");
            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= Integer.parseInt(scanner.nextLine());
        }while (op!=0);
        co.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+co.verDetalles());
    }

    @Override
    public String verDetalles() {
        return super.verDetalles();
    }
}



