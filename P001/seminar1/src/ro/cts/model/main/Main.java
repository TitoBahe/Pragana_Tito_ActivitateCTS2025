package ro.cts.model.main;

import ro.cts.model.personal.Assistent;
import ro.cts.model.personal.Lector;
import ro.cts.model.personal.Professor;
import ro.cts.model.personal.Student;
import ro.cts.model.plataforma.Curs;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Mihai", 20, 1, 900));
        studenti.add(new Student("Ana", 19, 2, 365));

        Curs curs = new Curs("CTS", 4, new Professor("Adrian", 40, 30, 4000, 0.35f), studenti);
        curs.sustineExamen("05/06/2025");

        curs.getProfessor().preda();
        System.out.println("Venitul profesorului " + ((Professor)curs.getProfessor()).calculareVenit());
        curs.setProfessor(new Assistent("Popescu", 26, 23, 5000));
        curs.sustineExamen("18/05/2025");
        Lector lector = new Lector("Gigel", 50);
        lector.preda();
        curs.setProfessor(lector);
        curs.sustineExamen("12/10/2025");
    }
}