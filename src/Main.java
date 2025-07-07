import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        crearElectrodomesticos();
    }
    public static void crearElectrodomesticos(){
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Electrodomestico("NEVERA", "SAMSUNG", 2.2));
        electrodomesticos.add(new Electrodomestico("HORNO", "FAGOR", 3.4));
        electrodomesticos.add(new Lavadora("Cecotec", 2.8, 500, true));
        electrodomesticos.add(new Lavadora("Hibense", 1.8, 400, false));
        System.out.println("Catalogo Original: " + electrodomesticos);
        for(Electrodomestico e: electrodomesticos){
            System.out.println(electrodomesticos);
        }

        Collections.sort(electrodomesticos);
        System.out.println("\nCatalogo ordenado por potencia");
        for(Electrodomestico e: electrodomesticos){
            System.out.println(electrodomesticos);
        }
        Collections.sort(electrodomesticos, new ComparadorPorMarca()) {

        });

    }






}