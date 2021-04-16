package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camion extends  Automotor implements  Registrable , VehiculoACombustion{
    private double tara;
    private double mma;
    Scanner scanner = new Scanner(System.in);

    public Camion() {
    }

    public Camion(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, double tara) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tara = tara;
    }

    public Camion(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, double tara, double mma) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tara = tara;
        this.mma = mma;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getMma() {
        return mma;
    }

    public void setMma(double mma) {
        this.mma = mma;
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
        System.out.println("Indique la tara ");
        tara= Double.parseDouble(scanner.nextLine());
        this.setTara(tara);

       // System.out.println("Indique mma");
       // mma=scanner.nextDouble();
      // if(Utilitaria.esDecimal(mma)) {
       //    this.setMma(mma);
      // }else{
       //    System.out.println("Ingrese nuevamente  e valor");}
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
        Double mma = this.mma;
        Double tara = this.tara;
            return super.verDetalles()+"- mma"+mma+"  -  tara "+tara;
    }



    @Override
    public int indicarlitrosNafta() {
        return super.indicarlitrosNafta();
    }

    @Override
    public String stringgetPatente() {
        this.patente= patente;
        return patente;
    }
}
