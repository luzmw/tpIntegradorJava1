package ada.TP.proyectos;

import java.util.Scanner;

public class Propietario extends Persona implements Registrable {
    private String licPropiedad;
    Scanner scanner= new Scanner(System.in);

    public Propietario(String nombre, String direccion, String dni, String licPropiedad) {
        super(nombre, direccion, dni);
        this.licPropiedad = licPropiedad;
    }

    public Propietario() {
    }

    public String getLicPropiedad() {
        return licPropiedad;
    }

    public void setLicPropiedad(String licPropiedad) {
        this.licPropiedad = licPropiedad;
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
        System.out.println("ingrese el nombre del propietario");
        String nombre= scanner.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingrese el dni del propietario");
        String dni = scanner.nextLine();
        this.setDni(dni);
        System.out.println("Ingrese dirección");
        String direccion = scanner.nextLine();
        this.setDireccion(direccion);
        System.out.println("nro de lic de propiedad");
        String licprop = scanner.nextLine();
        this.setLicPropiedad(licprop);
    }

    @Override
    public String verDetalles() {
        String nombre = super.getNombre();
        String dni= super.getDni();
        String direccion = super.getDireccion();
        String licpropiedad= this.getLicPropiedad();
        return "datos del propietario: nombre "+nombre+ "  dni  "+dni+" direccion " +direccion+ "nro de lic propietaria"+licpropiedad;
    }
}
