package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.List;

public class Moto extends Automotor  implements  VehiculoACombustion, Registrable{
    private String tipoMoto;

    public Moto() {
    }

    public Moto(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, String tipoMoto) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tipoMoto = tipoMoto;
    }

    public Moto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public int indicarlitrosNafta() {
        return this.getLitrosDeNafta();

    }

    @Override
    public void asignarDiaDeAlta() {

    }


    @Override
    public void asignarPatente() {

    }

    @Override
    public void agregarARegistro() {
        System.out.println("escriba el tipo de ciclomotor");
        tipoMoto= scanner.nextLine();
        this.setTipoMoto(tipoMoto);
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
       return super.verDetalles()+"- tipo de moto ;  "+tipoMoto;
    }

    @Override
    public String stringgetPatente() {
        return super.stringgetPatente();
    }
}
