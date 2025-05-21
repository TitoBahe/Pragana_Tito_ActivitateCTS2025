package test_1.singleton.classes;

public class Praia implements JaoaoPessoa{
    private String nome;
    private static Praia praia = null;

    private Praia(String nome) {
        this.nome = nome;
    }
    
    public static synchronized Praia getPraiaInstanta(String nome){
        if(praia == null){
            praia = new Praia(nome);
        }
        return praia;
    }

    @Override
    public void describe() {
        System.out.println("Praia");
    }

    @Override
    public String toString() {
        return "Praia{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
