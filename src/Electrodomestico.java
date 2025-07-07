public class Electrodomestico implements Comparable<Electrodomestico>,Facturable {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getConsumo(int horas) {
        return potencia * horas;
    }

    public double getCosteTotal(int horas, double precioKwHora) {
        return potencia * horas * precioKwHora;
    }

    public int compareTo(Electrodomestico o) {
        return Double.compare(this.getPotencia(), o.getPotencia());
    }

    @Override
    public String toString() {
        return "Electrodomestico-> " +
                "\nTipo='" + tipo +
                "\nMarca='" + marca +
                "\nPotencia=" + potencia;

    }

}
