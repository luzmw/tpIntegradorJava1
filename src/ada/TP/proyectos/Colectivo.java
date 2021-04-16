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

    public Colectivo(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, Integer cantidadAsientos) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.cantidadAsientos = cantidadAsientos;
    }

    public Integer getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(Integer cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public int indicarlitrosNafta() {
        return this.getLitrosDeNafta();

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
        System.out.println("indique la cantidad de asientos");
        cantidadAsientos = scanner.nextInt();
        this.setCantidadAsientos(cantidadAsientos);
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
        return super.verDetalles()+ "-  cantidad de asientos  "+cantidadAsientos;
    }
}



