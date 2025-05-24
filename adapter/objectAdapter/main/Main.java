package adapter.objectAdapter.main;





// TODO RESUMO:
// Essa e a mesma coisa que a classAdapter mas nao extendemos da classe MasinaInchiriata. Temos um atributo que e um objeto dessa classe,
// e passamos ele para o adpter pelo constructor.


import adapter.objectAdapter.turistic.MasinaInchiriataAdapter;
import adapter.objectAdapter.masina.Masina;
import adapter.objectAdapter.masina.MasinaInchiriata;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina(123, "Ferrari");
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        MasinaInchiriataAdapter masinaInchiriataAdapter= new MasinaInchiriataAdapter(masinaInchiriata);
        masinaInchiriataAdapter.rezervaPachet();
        masinaInchiriataAdapter.descriere();
    }
}