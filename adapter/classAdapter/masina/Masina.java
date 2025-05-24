package adapter.classAdapter.masina;

public class Masina {
    private int numar;
    private String marca;

    public Masina(int numar, String marca) {
        this.numar = numar;
        this.marca = marca;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "numar=" + numar +
                ", marca='" + marca + '\'' +
                '}';
    }
}
