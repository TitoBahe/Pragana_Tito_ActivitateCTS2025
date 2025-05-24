package proxy.main;

import proxy.classes.Persoana;
import proxy.classes.Proxy;

//simples demais, usamos quando queremos uma verificao. entao chamamos um meotod do proxy ao inves da class concreta.

// Să se implementeze un nivel intermediar care să permită realizarea
//rezervării doar pentru persoanele cu vârsta peste 65 de ani.
public class Main {
    public static void main(String[] args){
        Persoana p = new Persoana("tito", 65);
        Proxy proxy = new Proxy(p);
        proxy.descreiere();
    }
}
