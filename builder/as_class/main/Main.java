package builder.as_class.main;

import builder.as_class.classes.ConcreteBuilder;
import builder.as_class.classes.PachetTransport;

public class Main {
    public static void main(String args[]){
        ConcreteBuilder builder = new ConcreteBuilder();
        PachetTransport pt = builder
                .setLocuriFumatori(2)
                .setAerConditionat(true)
                .setAnimaleDeCompanie(2)
                .setTelevizor(false)
                .setLocuriFumatori(2)
                .setWifi(true)
                .build();

        PachetTransport pt_2  = builder.build();

        System.out.println(pt.toString());
        System.out.println(pt_2.toString());
    }
}
