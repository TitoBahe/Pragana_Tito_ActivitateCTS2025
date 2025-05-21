package test_1.factory.simple_factory.classes;

public class SimpleFactory {
    public Cidades getCidade(CidadesEnum cidadesEnum) throws Exception {
        switch (cidadesEnum){
            case Recife: return new Recife();
            case JoaoPessoa: return new JoaoPessoa();
            default: throw new Exception("Type not available");
        }
    }
}
