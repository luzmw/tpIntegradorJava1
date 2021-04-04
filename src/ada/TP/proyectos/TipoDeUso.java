package ada.TP.proyectos;

public enum TipoDeUso {
    PROFESIONAL ("prof",1),
    PARTICULAR ("part",2),
    MIXTO ("m",3),
    ;
    private  String abreviatura;
    private int codigo;


    TipoDeUso(int abrev, String abreviatura) {
        this.codigo = codigo;
        this.abreviatura = abreviatura;
    }

    TipoDeUso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAbreviatura() {
        return abreviatura;
    }


    @Override
    public String toString() {
        return super.toString() System.out.println("tipo de uso: "+ abreviatura+" código: "+codigo);;
    }
}
