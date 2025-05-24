package flyweight.main;

//Este utilizat atunci când trebuie să construim foarte multe obiecte/instanțe
//ale unei clase, însă majoritatea obiectelor au o parte comună, sau
//permanentă.

//Partea care diferă de la un obiect la altul este salvată într-o altă clasă și
//este adăugat după construirea obiectelor.

//Agenția organizează excursii și cu grupuri. Toate pachetele celor din grup
//vor avea același hotel de cazare, aceeași destinație și toți vor avea sau
//nu mic dejun inclus. Identificarea realizându-se după codul pachetului.
//Opțional fiecare persoană, dacă dorește, poate să aibă cina inclusă în
//pachet și numărul de excursii în care să meargă în zilele libere.

//-> Să se implementeze modulul care asigură gestiunea de pachete turistice
//pentru cienții agenției, ținându-se cont de faptul că memoria trebuie
//folosită în mod optim.

//TODO RESUMO:
//PALAVRAS CHAVES: consumo otimo de memoria. acelasi ceva e uma unica coisa diferente.

// COMO FAZER:
//1. criar uma interface
//2. uma classe concreta de um item
//3. uma classe que vai ter um map<int, Interface> e uma funcao que cria um item caso o index nao exista no map. -> chamamos de factory
//4. uma classe Optionale que vamos usar em um metodo da classe Item para printar o pacote inteiro, incluido o opcional.

import flyweight.classes.Optional;
import flyweight.classes.PachetTuristic;
import flyweight.classes.PacheteTuristiceFabric;

public class Main {
    public static void main(String[] args){
        PacheteTuristiceFabric pacheteTuristiceFabric = new PacheteTuristiceFabric();
        PachetTuristic pachet = pacheteTuristiceFabric.getPachet(1);
        Optional optional = new Optional(3, false);
        Optional optional_2 = new Optional(1, true);
        Optional optional_3 = new Optional(5, false);
        pachet.descriere(optional);
        pachet.descriere(optional_2);
        pachet.descriere(optional_3);
    }
}
