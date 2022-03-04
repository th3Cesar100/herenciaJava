package herenciaJava.com.softtools.app;
import  herenciaJava.com.softtools.app.domain.*;

public class Main {

    public static void main(String[] args) {
        SeleccionFutbol seleccionfutbol = new SeleccionFutbol();
        System.out.println(seleccionfutbol);
        System.out.println("_____________");

        Futbolista futbolista = new Futbolista();
        System.out.println(futbolista);
        System.out.println("_____________");

        Masajista masajista = new Masajista();
        System.out.println(masajista);
        System.out.println("_____________");

        Entrenador entrenador = new Entrenador();
        System.out.println(entrenador);
    }
    
}
