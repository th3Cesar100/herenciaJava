package herenciaJava.com.softtools.app.domain;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;
    private int idFutbolista;
    private static int contadorFutbolista;

    public Futbolista(){
        this.idFutbolista = ++Futbolista.contadorFutbolista;

    }

    public Futbolista(int dorsal , String demarcacion){
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        this.idFutbolista = ++Futbolista.contadorFutbolista;
        
    }
    public Futbolista(int dorsal , String demarcacion,String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        this.idFutbolista = ++Futbolista.contadorFutbolista;
        
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista [demarcacion=" + demarcacion + ", dorsal=" + dorsal + ", idFutbolista=" + idFutbolista + 
        super.toString() + "]";
    }

    
    
}
