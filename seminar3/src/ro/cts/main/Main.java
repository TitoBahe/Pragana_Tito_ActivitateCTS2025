package ro.cts.main;

import ro.cts.clase.AutoritatereglementareMasiniEager;
import ro.cts.clase.AutoritatereglementariMasiniLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutoritatereglementareMasiniEager autoritate = AutoritatereglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritatereglementareMasiniEager autoritate2 = AutoritatereglementareMasiniEager.getInstance();
        autoritate2.setWebsite("ceva.com");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModel("Pagani");

        System.out.println(autoritate);

        System.out.println("\n");

        AutoritatereglementariMasiniLazy autoritate_Lazy = AutoritatereglementariMasiniLazy.getInstance("autoritate1", "www.autoritate1.com");
        System.out.println(autoritate_Lazy);

        AutoritatereglementariMasiniLazy autoritate2_Lazy = AutoritatereglementariMasiniLazy.getInstance("autoritate2", "www.autoritate2.com");
        autoritate2_Lazy.setWebsite("ceva.com");
        System.out.println(autoritate2_Lazy);
        System.out.println(autoritate_Lazy);

    }
}