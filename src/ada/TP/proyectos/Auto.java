package ada.TP.proyectos;

import javax.security.auth.login.AccountExpiredException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auto extends  Automotor implements Registrable , VehiculoACombustion {
    private Integer cantidadPuertas;
    Scanner scanner = new Scanner(System.in);
    public Auto() {
    }

    public Auto(Propietario propietario, Integer cantidadPuertas) {
        super(propietario);
        this.cantidadPuertas = cantidadPuertas;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
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
        Auto a = new Auto();

        System.out.println("INgrese la cantidad de puertas");
        cantidadPuertas = Integer.parseInt(scanner.nextLine());

        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new ArrayList<>();
        //tipo de uso
        int op =0;
        do {
        System.out.println("indique el tipo de uso : 1 profesional, 2 particular, 3 mixto");
        switch (op){
            case 1: a.setTipoDeUso(TipoDeUso.PROFESIONAL);
            break;
            case 2: a.setTipoDeUso(TipoDeUso.PARTICULAR);
            break;
            case 3: a.setTipoDeUso(TipoDeUso.MIXTO);
        }
        }while (op!=0);


        //datos propietario
        System.out.println("Nombre del propietario");
        p.agregarARegistro();
        a.setPropietario(p);

        //asignar patenta y fecha de alta
        System.out.println("Ingrese el año en curso");
        int anio =Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el mes en curso (con números");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.println("ingrese el día");
        int dia = Integer.parseInt(scanner.nextLine());

        LocalDate fechaDeAlta=LocalDate.of(anio, mes, dia);

        a.setFechaDeAlta(fechaDeAlta);
      System.out.println("el alta es"+ a.getFechaDeAlta().toString());


        //boolean o if tiene conductores

        do {
            System.out.println("Ingre el nombre del conductor autorizado, sino, ingrese 0");
            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= Integer.parseInt(scanner.nextLine());
        }while (op!=0);
        a.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+a.verDetalles());

    }

    @Override
    public void indicarlitrosNafta() {

    }
//TODO mostrar objeto
    @Override

    public String verDetalles() {
        String fechaAlta = super.getFechaDeAlta().toString();
        //patente
        String autorizados = "";
        String propietario= super.getPropietario().verDetalles();
        String tipoDeUso = super.getTipoDeUso().toString();
        for(Conductor c :super.getConductoresAutorizados()){
            // c.verDetalles() // tenés que completar este método
            autorizados += c.getNroLicenciaConducir()+" "+c.verDetalles();
        }
        return "el auto tiene  " + cantidadPuertas+ " puertas, fecha de alta : " + fechaAlta+ " - autorizados: " +autorizados
                +" propietario: "+propietario+ "patente: "+"tipo de uso : "+tipoDeUso;
    }
}

