package ada.TP.proyectos;

import com.sun.jdi.VMOutOfMemoryException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
La DNRPA (Dirección Nac. Reg. Propiedad del Automotor) necesita un sistema para anotar todos los vehículos registrados en el país.
La DNRPA tiene Registros seccionales.
Cada Registro tiene automotores registrados.

Los automotores pueden ser de uso particular o profesional.
Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones.

Todos los vehículos tienen un único propietario y autorizados a conducir.
De los propietarios y autorizados se sabe el nombre, DNI y dirección.
Herramientas de java obligatorias:
Enums, excepciones, random, listas, interfaces, herencia, Date o LocalDate.
Consignas obligatorias:
1)	Se desea poder listar todos los autos registrados en todas las seccionales.
2)	Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.
3)	Los automotores pueden cambiar de propietario.
4)	Se debe registrar la fecha de cambio de propietario.
5)	Se debe poder dar de alta un nuevo automotor. Registrar esa fecha también.
6)	No se puede cambiar de propietario si pasó menos de 1 año desde la fecha del último cambio de propietario.
Consignas opcionales:
1)	Cada automotor tiene una PATENTE única que se asigna automáticamente al realizar el alta o registro. Formatos de patente: AA123BB o ABC123.
2)	Se puede consultar si pasó un año o más desde el registro o cambio de titular, para un auto en particular (se consulta por patente).


Moto extends Automotor implements VehiculoACombustion
MotoElectrica extends Automotor implements VehiculoElectrico
Autos extends Automotor implements VehiculoACombustion
AutoElectrico extends Automotor implements VehiculoElectrico
Colectivo extends Automotor implements VehiculoACombustion
MotoElectrica me = new MotoElectrica();
AutoElectrico ae = new AutoElectrico();
ae.indicarVoltaje();
me.indicarVoltaje();
o
itnstream aleatorio = aleatorio.ints


 */

// localdate nuevaAlta is after  localdatediaalta plus 365
//diasparanuevaalta= nuevaalta.getdayofthe year -orimeralta.getdayoftheyear
//if dias paranuevaalta es >0 ; puede cambiar, sino todavia no paso un año
//if duration.bettween(alta nuevaalta)= diasquefaltan.getdats>365 o366csetpropietario
//pedir dia mes año por separado al scanner
//localdate diadealta0 localdate,of ()



public class Dnrpa {

    public static void main(String[] args) {
        MotoElectrica me= new  MotoElectrica();
        List<Registro> registrosSeccionales = new ArrayList<>();
        //TODO AgregarAutomotores(new Auto());
        //crear lista de conductores
        List<Conductor> conductores = new ArrayList<>();

        //instanciar conductor
        Conductor unConductor = new Conductor();
        unConductor.setNombre("otroPepe");
        unConductor.setDireccion("cabildo 222");
        unConductor.setNroLicenciaConducir("ffd62365");
        unConductor.setDni("332563256");
        //agregar a lista conductores
        conductores.add(unConductor);

        unConductor.setNombre("pepe");
        unConductor.setDireccion("lujan 555");
        unConductor.setNroLicenciaConducir("afd5865");
        unConductor.setDni("27565369");
        //agregar a lista conductores
        conductores.add(unConductor);

        //instanciar persona propietario
        Persona propietario = new Persona();
        propietario = (Persona) unConductor;


        //propietario.setDni("27565369");
        //propietario.setNombre("pepe");
        //propietario.setDireccion("lujan 555");

        //crear lista de automotores
        List<Automotor> automotores = new ArrayList<>();

        //instanciar automotor
        Auto auto = new Auto();
        //setear propietario
        auto.setPropietario(propietario);
        //setear lista conductores
        auto.setConductoresAutorizados(conductores);
        auto.setCantidadPuertas(5);
        auto.setTipoDeUsoUso("profesional");
        auto.setFechaDeAlta(LocalDate.now());
        auto.setPatente("asd653");
        //agregar automotor a lista de automotores
        automotores.add(auto);
        System.out.println(auto.verDetalles());

        //instanciar registro
        Registro registro = new Registro();
        //setear lista de automotores
        //registro.setAutomotores(automotores);
        registro.setSeccional("carapachay");


        //agregar registro a lista registrosSeccionales
        registrosSeccionales.add(registro);
        Camion c= new Camion();
        c.verDetalles();

        /*
        armar lista de propietarios (personas)
        recorrer for registors seccionales automotores
         */

        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Bienvenido a la DNRPA, ingrese la opción correspondiente");
            System.out.println("1-dar de alta automotor");
            System.out.println("2-cambiar de propietario ");
            System.out.println("3-");
            System.out.println("0- salir");
            op=sc.nextInt();
           /* switch (op)
                case 1: break;
                case 2: break;
                case 3: break;;

            */

        }while (op!=0);


          }

     }

