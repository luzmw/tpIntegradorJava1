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

        System.out.println("Vehículo registrado : "+this.verDetalles());
        System.out.println("desea agregar mas vehículos? 1 -si 3-no");
        int op = 0;
        op= scanner.nextInt();
        do{
            super.agregarARegistro();
        }while (op!=0);



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

