package test_1.factory.simple_factory.classes;

public class Recife implements Cidades{
    @Override
    public void describe() {
        System.out.println("Recife");
    }

    @Override
    public String toString() {
        return "Recife{}";
    }
}
