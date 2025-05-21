package test_1.singleton.classes;

public class Cidade implements JaoaoPessoa{
    private String nome;
    private int tamanho;

    private static Cidade cidade = null;

    private Cidade(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public static synchronized Cidade getInstanta(String nome, int tamanho){
        if(cidade == null){
            cidade = new Cidade(nome, tamanho);
        }
        return cidade;
    }

    @Override
    public void describe() {
        System.out.println("Cidade");
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
