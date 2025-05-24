package composite.main;


import composite.classes.Categorie;
import composite.classes.Item;
import composite.classes.Optiune;

//Este un design patterns structural folosit atunci când este necesară
//crearea unei structuri ierahice sau o structură arborescentă prin
//compunerea de obiecte.

//TODO RESUME:
//apenas tres classes, uma interface que vai se usada sempre, queremos tudo desse tipo. Uma classe de criar items e
//uma classe de criar categoria que vai ter uma lista de items mas usando o tipo Optiune no lugar.
public class Main {
    public static void main(String[] args) throws Exception {
        Optiune sopas = new Categorie("sopa");
        Optiune doces = new Categorie("doces");

        Optiune cebola = new Item("sopa de cebola");
        Optiune cenoura = new Item("Sopa de cenoura");

        sopas.adaugaNod(cebola);
        sopas.adaugaNod(cenoura);

        System.out.println(sopas.toString());
    }
}
