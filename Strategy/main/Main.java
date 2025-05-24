package Strategy.main;

import Strategy.classes.Card;
import Strategy.classes.Client;
import proxy.classes.Persoana;
import proxy.classes.Proxy;

//Agenția de Turism dorește implementarea modului de plată al pachetelor
//turistice rezervate. Modul de plată îl decide clientul în momentul în care
//trebuie să facă plata. Plata se poate realiza cu cardul, cash sau prin
//PayPal.

//TODO RESUMO
//coisa mais simples do mundo, diversas formas de fazer algo, usamos uma interface para todo mundo e
//classes para cada forma de pagamento herdando da interface. E no client, temos o metodo para escolho o metodo de pagamento
public class Main {
    public static void main(String[] args) {
        Client c = new Client("ito");
        c.setModPlata(new Card());
        System.out.println(c.toString());
    }
}
