package ada.TP.proyectos;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automotor implements Registrable {
    private Propietario propietario;
    private List<Conductor> conductoresAutorizados;
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

        this.setFechaDeAlta(fechaDeAlta);

        // nuevo alta
        }


    @Override
    public void asignarLicencia() {

    }

    //TODO RANDOM
    @Override
    public void asignarPatente() {
        /*
        [17:40, 23/3/2021] Jazmin java: private String generarPatenteRandomNueva() {
        String numeros = "";
        String letrasInicio = "";
        String letrasFin ="";

        for(int i = 1; i <= 3; i++) {
            int n = (int)(Math.random()*9+0);
            numeros = n+numeros;
            int l = (int)(Math.random()*(90-65+1)+65);
            letrasInicio = (char)l + letrasInicio;
            l = (int)(Math.random()*(90-65+1)+65);
            letrasFin = (char)l + letrasFin;
        }

        patente = letrasInicio.substring(0,2)+numeros+letrasFin.substring(0,2);
        return patente;
    }
[17:40, 23/3/2021] Jazmin java: Luz, aca la info de la patente
[17:40, 23/3/2021] Jazmin java: genero numeros random del 0 al 9
[17:40, 23/3/2021] Jazmin java: algunos los voy concatenando como numeros y otros los voy concatenando como letras mayusculas
[17:41, 23/3/2021] Jazmin java: despues armo la patente
[17:42, 23/3/2021] Jazmin java: patente = letrasInicio.substring(0,2)+numeros+letrasFin.substring(0,2);
Aca vas a ver que de las cadenas de letras solo tomo dos letras con un substring porque hago todo con un ciclo for que da tres vueltas, entonces me saca de mas
[17:45, 23/3/2021] Jazmin java: int l = (int)(Math.random()*(90-65+1)+65);
            letrasInicio = (char)l + letrasInicio;
aca tomo un numero random del 65 al 90 porque cuando lo casteo a CHAR se vuelve una letra mayuscula de la A a la Z
[17:46, 23/3/2021] Luz☀️: aah weee

dale, no es dificil, tiene un ciclo de repeticion de 3 vueltas, donde se va generando un numero aleatorio del 0 al 9 (que queda como numero) y un aleatorio del 65 al 90 (que casteo con el CHAR a letra mayuscula). En cada vuelta, lo voy concatenando y despues armo la palabra completa
         */

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



