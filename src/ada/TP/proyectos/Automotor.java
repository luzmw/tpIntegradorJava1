package ada.TP.proyectos;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Automotor implements Registrable , VehiculoACombustion, VehiculoElectrico {
    private Propietario propietario;
    private List<Conductor> conductoresAutorizados;//todo linkedlist
    protected TipoDeUso tipoDeUso;
    protected String patente;
    protected LocalDate fechaDeAlta;
    private String voltaje;
    private int  litrosDeNafta;
    // TODO private LocalDate fechaNuevaAlta;
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

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public int getLitrosDeNafta() {
        return litrosDeNafta;
    }

    public void setLitrosDeNafta(int litrosDeNafta) {
        this.litrosDeNafta = litrosDeNafta;
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
        setFechaDeAlta(fechaDeAlta);
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
        String letrasfinal = letras2.toUpperCase();

        patente = letrasInicio+numeros+letrasfinal;
        HashSet<String> patentesasignadas = new HashSet<>();
        if (patentesasignadas.add(patente)){
            System.out.println("se asigno la patente: "+ patente);

        }else{
            System.out.println("no se udo asignar, intente nuevamente");
        }
        setPatente(patente);
     }
//TODO enum tipodeuso = Enum.valueof(tipouso.class particular) =
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

    public void setTipoDeUso(TipoDeUso tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }


    @Override
    public String verDetalles() {
        String autorizados= "";

        for(Conductor c :conductoresAutorizados){
            autorizados += " "+c.verDetalles();
        }

        String tipoDeUso = this.tipoDeUso.name();
        String patente= this.getPatente();
        String fecha= fechaDeAlta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String propietario = this.getPropietario().verDetalles();

        return "Datos vehículo: patente "+patente+" - fecha de alta : "+fecha+ "-  Uso :"+ tipoDeUso+" -"
                +propietario+ "- conductores autorizados: "+ autorizados;
    }

    @Override
    public String verFechaDeAlta() {
      String  fechaDeAlta = this.getFechaDeAlta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fechaDeAlta;
    }


    public Long consultarTiempoDesdePrimerAlta() {// Todo por patente
        System.out.println("Ingrese la fecha del último alta del vehículo ");
        System.out.println("Ingrese año");
        int anioDeAlta = scanner.nextInt();

        System.out.println("Ingrese mes");
        int mes = scanner.nextInt();

        System.out.println("Ingrese día");
        int dia = scanner.nextInt();
        LocalDate ultimoAlta = LocalDate.of(anioDeAlta, mes, dia);

        LocalDate nuevaAlta = LocalDate.now();
        long tiempoDesdeElAlta = ChronoUnit.YEARS.between(ultimoAlta, nuevaAlta);
        return tiempoDesdeElAlta;
    }

    @Override
    public String stringgetPatente() {
        return patente;
    }

    public void cambiarDePropietario(LocalDate nuevoAlta , Propietario nuevoProp){
       long tiempoDesdeElAlta = this.consultarTiempoDesdePrimerAlta();
        if (tiempoDesdeElAlta >=1) {
           nuevoAlta = LocalDate.now();
           // TODO fechaNuevaAlta= LocalDate.now();
            //TODO hashseet con todas las fechas nuevas
           this.asignarDiaDeAlta();
           this.setPropietario(nuevoProp);
           System.out.println(this.getPropietario().verDetalles());
       }else{
           System.out.println("no está permitido el cambio de propietario");
       }
}

    @Override
    public String indicarVoltaje() {
        return this.getVoltaje();
    }

    @Override
    public int indicarlitrosNafta() {
        return this.getLitrosDeNafta();
    }
}






