package builder.as_attribute.main;

import builder.as_attribute.classes.ConcreteBuilder;
import builder.as_attribute.classes.PachetTransport;

//TODO usado apenas quando queremos apenas um objeto de cada tipo. Pois se alterarmos o valor de um, estaremos alterando o de todos. (DocumentBuilder)
public class Main {
    public static void main(String args[]){
        ConcreteBuilder builder = new ConcreteBuilder();
        PachetTransport pt = builder.setAerConditionat(true).setAnimaleDeCompanie(2).setLocuriFumatori(2).setTelevizor(false).setWifi(false).build();
        System.out.println(pt.toString());

        PachetTransport pt_2 = builder.setAerConditionat(true).setAnimaleDeCompanie(2).setLocuriFumatori(2).setTelevizor(false).setWifi(true).build();

        System.out.println(pt.toString());
        System.out.println(pt_2.toString());
    }
}
