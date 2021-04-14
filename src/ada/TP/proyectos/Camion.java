package ada.TP.proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camion extends  Automotor implements  Registrable , VehiculoACombustion{
    private double tara;
    private double mma;
    Scanner scanner = new Scanner(System.in);

    public Camion() {
    }

    public Camion(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, double tara) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tara = tara;
    }

    public Camion(Propietario propietario, List<Conductor> conductoresAutorizados, TipoDeUso tipoDeUso, String patente, LocalDate fechaDeAlta, double tara, double mma) {
        super(propietario, conductoresAutorizados, tipoDeUso, patente, fechaDeAlta);
        this.tara = tara;
        this.mma = mma;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getMma() {
        return mma;
    }

    public void setMma(double mma) {
        this.mma = mma;
    }

    @Override
    public void asignarDiaDeAlta() {
        super.asignarDiaDeAlta();
    }

    @Override
    public void asignarPatente() {
        super.asignarPatente();
    }

    //TODO VALIDAR Y AGREGAR SI DESEA AGREGAR MAS CAMIONES y indicar nafta
    @Override
    public void agregarARegistro() {
        Propietario p = new Propietario();
        Conductor caut = new Conductor();
        List<Conductor> autorizados = new ArrayList<>();

        System.out.println("Indique la tara ");
        tara= Double.parseDouble(scanner.nextLine());
        this.setTara(tara);

        System.out.println("Indique mma");
        mma=Double.parseDouble(scanner.nextLine());
        this.setMma(mma);

        //datos propietario
        System.out.println("Nombre del propietario");
        p.agregarARegistro();
        this.setPropietario(p);

        //asignar patenta y fecha de alta
        LocalDate fechaDeAlta= LocalDate.now();
        this.setFechaDeAlta(fechaDeAlta);

        //boolean o if tiene conductores
        int op = 0;
        do {
            System.out.println("Ingre el nombre del conductor autorizado, sino, ingrese 0");
            caut.agregarARegistro();
            autorizados.add(caut);

            System.out.println("quiere agregar otro conductor? 1-si 0- no");
            op= Integer.parseInt(scanner.nextLine());
        }while (op!=0);
        this.setConductoresAutorizados(autorizados);


        System.out.println("se agrego "+this.verDetalles());


    }

    @Override
    public String verDetalles() {
        Double mma = this.mma;
        Double tara= this.tara;
        String fechaAlta = super.getFechaDeAlta().toString();
        //patente
        String autorizados = "";
        String propietario= super.getPropietario().verDetalles();

        for(Conductor c :super.getConductoresAutorizados()){
            // c.verDetalles() // tenés que completar este método
            autorizados += c.getNroLicenciaConducir()+" "+c.verDetalles();
        }
        return "Datos del vehículo Camión: tara  " + tara+ "  mma "+mma+ " puertas, fecha: " + fechaAlta+ " - autorizados: " +propietario;
    }

    @Override
    public int indicarlitrosNafta() {
        return super.indicarlitrosNafta();
    }
}
