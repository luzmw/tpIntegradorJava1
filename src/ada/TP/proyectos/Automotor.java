package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automotor implements Registrable {
    private Propietario propietario;
    private List<Conductor> conductoresAutorizados;
    private TipoDeUso tipoDeUso;
    private String patente;
    private LocalDate fechaDeAlta;
    Scanner scanner = new Scanner(System.in);


    public Automotor() {
    }

    public Automotor(Propietario propietario) {
        this.propietario = propietario;
    }

    public Automotor(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso,
                     String patente, LocalDate fechaDeAlta) {
        this.propietario = propietario;
        this.conductoresAutorizados = new ArrayList<>();
        this.tipoDeUso = tipoDeUso;
        this.patente = patente;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<Conductor> getConductoresAutorizados() {
        return conductoresAutorizados;
    }

    public void setConductoresAutorizados(List<Conductor> conductoresAutorizados) {
        this.conductoresAutorizados = conductoresAutorizados;
    }

    public TipoDeUso getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUsoUso(String tipoDeUsoUso) {
        this.tipoDeUso = tipoDeUso;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
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
        int op = 0;

        do {
            System.out.println("Qué tipo de automotor desea dar de alta?");
            System.out.println("Ingre 1- camión, 2-auto, 3-auto electrico." +
                    " 4- colectivo, 5-utilitario. 6- moto . 7- moto eléctrica, 0-terminar");

            op = scanner.nextInt();
            switch (op) {

                case 1:
                    Camion c = new Camion();
                    c.agregarARegistro();
                    // automotores.add(c);
                    break;
               /* case 2:automotores.add(new Auto());
                    break;

                case 3:automotores.add(new AutoElectrico());
                    break;
                case 4:automotores.add(new Colectivo());
                    break;
                case 5:automotores.add(new Utilitario());
                    break;
                case 6:automotores.add(new Moto()) ;
                    break;
                case 7: automotores.add(new MotoElectrica());
                    break;*/
            }
        } while (op != 0);


    }

    //datos propietario


    //asignar patenta y fecha de alta


    public void setTipoDeUso(TipoDeUso tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    @Override
    public String verDetalles() {
        return null;
    }
}


           /* @Override
            public String verDetalles{
                String Autorizados;
                String tipoDeUso = this.tipoDeUso.toString();
                String patente;
                String fechaDeAlta;
                String propietario = this.getPropietario().verDetalles();

                return null;
            }

            */



