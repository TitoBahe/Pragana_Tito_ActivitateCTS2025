package ro.cts.main;

import ro.cts.registrySingleton.Autoritate;
import ro.cts.registrySingleton.Reglementare;

import java.util.Date;

public class MainRegistry {
    public static void main(String[] args){
        Autoritate autoritate = Autoritate.getInstance("nao sei", "www.nustiu.com");
        Reglementare reglementare1 = autoritate.reglementareModel("dacia logan");
        Reglementare reglementare2 = autoritate.reglementareModel("Cybertruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);
        Reglementare reglementare3 = autoritate.reglementareModel("dacia logan");
        System.out.println(reglementare3);

    }
}
