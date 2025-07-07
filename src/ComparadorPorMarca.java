import java.util.Comparator;

public class ComparadorPorMarca implements Comparator<Electrodomestico> {
    public int compare(Electrodomestico e1, Electrodomestico e2) {
        return e1.getMarca().compareTo(e2.getMarca());
    }
}
