package Façade.main;

//TODO RESUME:
//E uma classe que tem um metodo que faz tudo que a questao pede de ua vez. Entao ao inves de chamar diversos metoodos
// e criar diversos objetos, tu faz isso tudo apenas em um metodo da classe Facade

//Exemplo de Enunt:
//Să se realizeze un modul care să simplifice procesul de rezervare pentru
//operator.

//În momentul în care un client vine la recepție pentru o cameră,
//recepționistul trebuie să verifice dacă are camera liberă, apoi să verifice
//dacă acea cameră a fost curățată de la plecarea ultimului client, de
//asemenea trebuie să verifice dacă au fost puse prosoape noi în cameră.
//Managerul hotelului dorește realizarea unui modul care să simplifice
//munca recepționistului și să nu mai fie nevoit să verifice în toate locurile ci
//să verifice într-un singur loc.

import Façade.classes.Facade;

// Ou seja, sempre dizendo que tem que simplificar.
public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.rezervaPachetCazareTransport("Recufe", "Bucharest");

    }
}
