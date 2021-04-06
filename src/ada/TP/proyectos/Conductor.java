package ada.TP.proyectos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conductor extends Persona implements Registrable {
    Scanner scanner= new Scanner(System.in);
    private String nroLicenciaConducir;


    public Conductor(String nombre, String direccion, String dni, String nroLicenciaConducir) {
        super(nombre, direccion, dni);
        this.nroLicenciaConducir = nroLicenciaConducir;
    }

    public Conductor() {
    }

    public String getNroLicenciaConducir() {
        return nroLicenciaConducir;
    }

    public void setNroLicenciaConducir(String nroLicenciaConducir) {
        this.nroLicenciaConducir = nroLicenciaConducir;
    }


    @Override
    public void asignarDiaDeAlta() {

    }



    @Override
    public void asignarPatente() {

    }


    //TODO validar
    @Override
    public void agregarARegistro() {
        int op = 0;
            Conductor c = new Conductor();

            System.out.println("ingrese el nombre del conductor autorizado");
            String nombre = scanner.nextLine();
            c.setNombre(nombre);
            System.out.println("Ingrese el dni del conductor autorizado");
            String dni = scanner.nextLine();
            c.setDni(dni);
            System.out.println("Ingrese dirección");
            String direccion = scanner.nextLine();
            c.setDireccion(direccion);
            System.out.println("nro de lic de conducir");
            String licconducir = scanner.nextLine();
            c.setNroLicenciaConducir(nroLicenciaConducir);




    }

    @Override
    public String verDetalles() {
        String nombre= super.getNombre();
        String direccion= super.getDireccion();
        String dni = super.getDni();
        String nroLicenciaConducir = this.getNroLicenciaConducir();

        return "nombre: "+nombre+" direccion: "+direccion+ "dni "+dni+"nro licencia "+nroLicenciaConducir;
        }

    @Override
    public void modificarItem() {

    }
}