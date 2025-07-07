public class Lavadora extends Electrodomestico {
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("LAVADORA",marca, potencia);
        this.precio = 0;
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super("LAVADORA", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLavadora-> " +
                "\nPrecio: " + precio +
                "\nAguaCaliente: " + aguaCaliente;


    }
}
