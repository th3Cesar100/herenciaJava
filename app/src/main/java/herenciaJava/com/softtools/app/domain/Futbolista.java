package herenciaJava.com.softtools.app.domain;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;
    private int idFutbolista;
    private static int contadorFutbolista;

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

    
    
}
