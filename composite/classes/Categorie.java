package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{

    private List<Optiune> lista;
    private String nume;

    public Categorie(String nume) {
        this.lista = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        lista.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        lista.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("descriere lista: " + lista);
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "lista=" + lista +
                ", nume='" + nume + '\'' +
                '}';
    }
}
