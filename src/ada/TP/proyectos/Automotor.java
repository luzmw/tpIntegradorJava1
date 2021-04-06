package ada.TP.proyectos;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;

public class Automotor implements Registrable {
    private Propietario propietario;
    private List<Conductor> conductoresAutorizados;//todo linkedlist
    protected TipoDeUso tipoDeUso;
    protected String patente;
    protected LocalDate fechaDeAlta;
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
        //dia de alta
        System.out.println("Ingrese el año en curso");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el mes en curso (con números");
        int mes = scanner.nextInt();

        System.out.println("ingrese el día");
        int dia = scanner.nextInt();

        LocalDate fechaDeAlta = LocalDate.of(anio, mes, dia);


        // nuevo alta
        }





    @Override
    public void asignarPatente() {
            String letras = "";
           String numeros = "";
            String letras2 = "";
            String patente="";

            for (int i = 1; i <= 2; i++) {
                int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
                letras = letras + (char) codigoAscii;
            }
            String letrasInicio = letras.toUpperCase();

        for (int i = 1; i <= 3; i++) {
            int num = (int) (Math.random()*9+0);
            numeros= num + numeros;
          }
        for (int i = 1; i <= 2; i++) {
            int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
            letras2 = letras2 + (char) codigoAscii;
        }
        String letrasfinal = letras.toUpperCase();

        patente = letrasInicio+numeros+letrasfinal;
        HashSet<String> patentesasignadas = new HashSet<>();
        if (patentesasignadas.add(patente)){
            System.out.println("se asigno la patente: "+ patente);

        }else{
            System.out.println("no se udo asignar, intente nuevamente");
        }
     }

    @Override
    public void agregarARegistro() {
        List<Registrable> automotores= new ArrayList<>();
        int op = 0;

        do {
            System.out.println("Qué tipo de automotor desea dar de alta?");
            System.out.println("Ingre 1- camión, 2-auto, 3-auto electrico." +
                    " 4- colectivo, 5-moto , 6- moto eléctrica , 7- Utilitario, 0-terminar");

            op = scanner.nextInt();
            switch (op) {

                case 1:
                    Camion c = new Camion();
                    c.agregarARegistro();
                    automotores.add(c);
                    break;
                case 2:Auto a = new Auto();
                        a.agregarARegistro();
                        automotores.add(a);
                    break;

                case 3: AutoElectrico ae = new AutoElectrico();
                        ae.agregarARegistro();
                        automotores.add(ae);
                    break;
                case 4: Colectivo co = new Colectivo();
                        co.agregarARegistro();
                        automotores.add(co);
                    break;
                case 5: Moto m= new Moto();
                        m.agregarARegistro();
                        automotores.add(m);
                    break;
                case 6: MotoElectrica me = new MotoElectrica();
                        me.agregarARegistro();
                        automotores.add(me) ;
                    break;
                case 7: Utilitario u = new Utilitario();
                        u.agregarARegistro();
                        automotores.add(new MotoElectrica());
                    break;
            }
        } while (op != 0);
    }

    //datos propietario


    //asignar patenta y fecha de alta


    public void setTipoDeUso(TipoDeUso tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    //TODO HERENCIA REVISAR
    // TODO imprimir fecha y patente
    @Override
    public String verDetalles() {
       // String Autorizados;
        String tipoDeUso = this.tipoDeUso.toString();
        String patente= this.getPatente();
        String fechaDeAlta= this.getFechaDeAlta().toString();
        String propietario = this.getPropietario().verDetalles();
        return patente+fechaDeAlta+propietario;
    }

    @Override
    public void modificarItem() {
        System.out.println("modificar el propietario");
        propietario.modificarItem();

    }

    public void consultarFechaXPatente(){
        String patente2 ="";


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



