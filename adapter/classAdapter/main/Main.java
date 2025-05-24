package adapter.classAdapter.main;


import adapter.classAdapter.masina.Masina;
import adapter.classAdapter.masina.MasinaInchiriata;
import adapter.classAdapter.turistic.MasinaInchiriataAdapter;

//Uma classe Adapter é apenas uma classe que extende uma outra classe que nao posso mudar. Na vida real,
// seria uma classe de uma API ou biblioteca, e implementa tmb a interface de outra classe que quero conectar.
// Assim, terei uma classe que herda e tem acesso de tudo da classe que nao posso tocar e vai ser tmb do mesmo tipo
// da outra classe.

// No nosso exemplo, a classe MasinaINchiriataAdapter faz isso de cima, assim, podemos usa-la como um PachetTuristic
// ja que tmb extendemos a interface pachetTuristic.

// Uso isso no dia a dia, quando pego um metodo de outra classe do WAHA API e crio uma classe como a classe sessao
// Assim, posso criar uma abstracao ao chamar os meus metodos antes das do WAHA.

// TODO RESUMO:
// Um class Adapter é apenas uma classe que herda de outra classe que não posso tocar e implementa uma interface.
// Para ser tmb de outro tipo.

// Exemplo de enunt:

//Clasele din softul achiziționat nu sunt asemănătoare cu clasele din softul
//deținut de agenție.

//Să se rezolve problema, astfel încât, cele două soft-uri să poată fi folosite
//împreună, însă fără a modifica clasele din cele două soft-uri.

//Sempre dizendo que nao sao parecidas e que "precisamos criar uma ponte para serem usados juntos".

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina(123, "Renault");
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);
        masinaInchiriata.masinaInchiriataInfo();

        MasinaInchiriataAdapter masinaInchiriataAdapter = new MasinaInchiriataAdapter(masina);

        masinaInchiriataAdapter.masinaInchiriataInfo();

        masinaInchiriataAdapter.descriere();
        masinaInchiriataAdapter.rezervaPachet();
    }
}