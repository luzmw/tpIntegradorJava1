package ada.TP.proyectos;

import javax.security.auth.login.AccountExpiredException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Auto extends  Automotor implements Registrable , VehiculoACombustion {
    //TODO automotor private Int litrosDenafta;
    private Integer cantidadPuertas;
    Scanner scanner = new Scanner(System.in);

    public Auto() { }

    public Auto(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, Integer cantidadPuertas) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto(Propietario propietario, Integer cantidadPuertas) {
        super(propietario);
        this.cantidadPuertas = cantidadPuertas;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
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

        System.out.println("INgrese la cantidad de puertas");
        cantidadPuertas = Integer.parseInt(scanner.nextLine());

        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new LinkedList<>();
        //tipo de uso
        int op =0;

            System.out.println("indique el tipo de uso : 1 profesional, 2 particular, 3 mixto ");
            op= scanner.nextInt();

            switch (op){
            case 1: this.setTipoDeUso(TipoDeUso.PROFESIONAL);
            break;
            case 2: this.setTipoDeUso(TipoDeUso.PARTICULAR);
            break;
            case 3: this.setTipoDeUso(TipoDeUso.MIXTO);
        }

        System.out.println("tipo de uso ");


        //datos propietario
        System.out.println("Datos del propietario ");
        p.agregarARegistro();
        this.setPropietario(p);


        this.asignarDiaDeAlta();
        this.setFechaDeAlta(super.getFechaDeAlta());


      //asignar patente
        this.asignarPatente();

        //boolean o if tiene conductores
        System.out.println("desea agregar conductores autorizados? 1-si  0- no");
        op=scanner.nextInt();
        while (op== 1){

            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= scanner.nextInt();
        }
        this.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+this.verDetalles());

    }

    @Override
    public int indicarlitrosNafta() {
        return super.indicarlitrosNafta();
    }

    @Override
    public String verDetalles() {

        return super.verDetalles()+ this.getCantidadPuertas();
    }




}

