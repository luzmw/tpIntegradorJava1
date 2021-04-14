package ada.TP.proyectos;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class  Registro {
    private List<Registrable> automotores;
    private int seccional;
    Scanner sc = new Scanner(System.in);
    private HashSet<String> patentesAsignadas;
    //Lista de fechas de alta
    // fechas de cambio de propietario
    //alta de vehiculos con la nueva  patente?

    public Registro(List<Registrable> automotores, int seccional) {
        this.automotores = new ArrayList<>();
        this.seccional = seccional;
    }

    public Registro() {
    }

    public void agregarAutomotor(Registrable automotor) {
        automotores.add(automotor);
    }

    public List<Registrable> getAutomotores() {
        return automotores;
    }

    public void setAutomotores(List<Registrable> automotores) {
        this.automotores = automotores;
    }

    public int getSeccional() {
        return seccional;
    }

    public void setSeccional(int seccional) {
        this.seccional = seccional;
    }

    public void mostrarAutomotores() {
        for (Registrable automotor : automotores)
            System.out.println(automotor.verDetalles());
    }

    public HashSet<String> getPatentesAsignadas() {
        return patentesAsignadas;
    }

    public void setPatentesAsignadas(HashSet<String> patentesAsignadas) {
        this.patentesAsignadas = patentesAsignadas;
    }

    //agregar automotores al registro
    //como agrego el resitro a una lista de registros= dnrpa
    public void agregarARegistro() {
        String nombreSeccional = "";
        System.out.println("Ingrese el numero de seccional; 1- norte 2- sur 3 este 4- oeste");

        //setear lista de automotores
        int seccional = Integer.parseInt(sc.nextLine());
        switch (seccional) {
            case 1:
                nombreSeccional = "norte";
                break;

            case 2:
                nombreSeccional = "sur";
                break;

            case 3:
                nombreSeccional = "este";
                break;

            case 4:
                nombreSeccional = "oeste";
                break;
        }
        this.setSeccional(seccional);
        System.out.println("Seccional de pertenencia:" + seccional + ": " + nombreSeccional);

       //crear automotor
        Automotor a = new Automotor();
        a.agregarARegistro();
        this.setAutomotores(automotores);

        // crear en el main ? List<Registro> registrosSeccionales=  new ArrayList<>();
        //  registrosSeccionales.add(registro);


    }


    //TODO falta mostrar nombre de seccional
    public String verElementosRegistrados() {
        String automotores = "";
        for (Registrable r : this.getAutomotores()) {
            automotores += r.verDetalles();

        }
        return automotores;
    }

    public String listarPropietariosDeCamiones() {
        List<Camion> camiones = new ArrayList<>();
        List<String> propietarios = new ArrayList<>();

        for (Registrable aut : automotores) {
            if (aut instanceof Camion) {
                Camion c = (Camion) aut;
                camiones.add(c);

            }

        }
        for (Camion ca : camiones) {
            propietarios.add(ca.getPropietario().getNombre());
        }
       // TODO no ordena
        Collections.sort(propietarios);
        for (String a : propietarios) {
            System.out.println(a);
        }
        return "";
    }

    public String ListarAutos() {

        String autos = "";
        for (Registrable aut : automotores) {
            if (aut instanceof Auto) {
                Auto una = (Auto) aut;

                autos += aut.verDetalles();
            }
        }
        return autos;
    }


    public void consultarFechaXPatente(String patente, List<Registrable> automotores) {

        for (Registrable aut : automotores)
            if (aut.stringgetPatente().equals(patente)) {
                System.out.println(aut.verFechaDeAlta());
            } else {
                System.out.println("");            }
        }

    }







