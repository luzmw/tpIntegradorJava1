package ada.TP.proyectos;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class  Registro {
    private List<Registrable> automotores;
    private int seccional; //nro de seccional
    Scanner sc = new Scanner(System.in);
    private HashSet patentes;
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
        List<Registrable> automotores = new ArrayList<>();
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
        seccional = seccional;
    }

    public void mostrarAutomotores() {
        for (Registrable automotor : automotores)
            System.out.println(automotor.verDetalles());
    }



   public void agregarARegistro() {
       Registro registro = new Registro();
       String nombreSeccional= "";
       System.out.println("Ingrese el numero de seccional; 1- norte 2- sur 3 este 4- oeste");

       //setear lista de automotores
       int seccional= Integer.parseInt(sc.nextLine());
       switch (seccional){
           case 1: nombreSeccional = "norte";
           break;

           case 2: nombreSeccional="sur";
           break;

           case 3: nombreSeccional="este";
           break;

           case 4: nombreSeccional="oeste";
           break;
       }
       registro.setSeccional(seccional);
       System.out.println("la seccional "+ seccional+" : "+nombreSeccional);

       //crear automotor
       Automotor a = new Automotor();
       a.agregarARegistro();
       registro.setAutomotores(automotores);

       List<Registro> registrosSeccionales=  new ArrayList<>();
       registrosSeccionales.add(registro);


   }



    //TODO falta mostrar nombre de seccional
    public String verElementosRegistrados() {
        String automotores = "";
        for (Registrable r : this.getAutomotores()) {
            automotores += r.verDetalles();

        }
        return automotores;
    }
    //todo stream?
    public  String listarPropietarios(){
       List<Camion> camiones = new ArrayList<>();
       List<String> propietarios = new ArrayList<>();

        for (Registrable aut :automotores){
            if (aut instanceof Camion){
                Camion c = (Camion) aut;
                camiones.add(c);

            }

        }
        for (Camion ca: camiones){
             propietarios.add(ca.getPropietario().getNombre());
        }
        Collections.sort(propietarios);
        for (String a :propietarios){
            System.out.println(a);}
        return "";
    }

    public String ListarAutos (List<Registrable> automotores){
       String autos ="";
            for (Registrable aut : automotores){
                if (aut instanceof Auto){
                    Auto una = (Auto) aut;
                    autos+= una.verDetalles();
                }
            }return autos ;
        }


    public void modificarElementoRegistrado() {
        Automotor aut = new Automotor();
        System.out.println("Ingrese la fecha del último alta del vehículo ");
        System.out.println("Ingrese año");
        int anioDeAlta= sc.nextInt();

        System.out.println("Ingrese mes");
        int mes = sc.nextInt();

        System.out.println("Ingrese día");
        int dia = sc.nextInt();
        LocalDate ultimoAlta= LocalDate.of(anioDeAlta, mes, dia);

        LocalDate nuevaAlta =LocalDate.now();
        //long tiempoDesdeElAlta= Duration.between(nuevaAlta,ultimoAlta).toDays();
        if (ChronoUnit.YEARS.between(nuevaAlta,ultimoAlta)>0){
            System.out.println("Está habilitado el cambio de propietario");
            aut.modificarItem();
           /* Registro registro = new Registro();
            List<Registrable> registrados = registro.getAutomotores();
            Registrable r = registrados.get(0);

            */
            /*
            if (r.getClass().getSimpleName().equals("Propietario")) {
                Propietario cambioProp = (Propietario) r;
                cambioProp.modificarItem();
            }
            //  registrados.set(r, registrable);        }else {
           // System.out.println("no puede cambiar de propietario espero "+ tiempoDesdeElAlta+ " para la modificación");
        }

             */



    }




    }}




