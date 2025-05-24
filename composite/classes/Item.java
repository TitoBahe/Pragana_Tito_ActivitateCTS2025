package composite.classes;

public class Item implements Optiune{

    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("adaugaNod nu este implementata");
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("stergeNod nu este implementata");
    }

    @Override
    public Optiune getNod(int index) {
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Item descriere.....");
    }

    @Override
    public String toString() {
        return "Item{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
