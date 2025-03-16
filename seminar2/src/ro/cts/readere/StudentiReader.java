package ro.cts.readere;

import ro.cts.clase.Aplicant;
import ro.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{

    public List<Aplicant> readStudents(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
//            String nume = input.next();
//            String prenume = (input.next()).toString();
//            int varsta = Integer.valueOf(input.nextInt());
//            int punctaj = Integer.valueOf(input.nextInt());
//            int nr = Integer.valueOf(input.nextInt());
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input.next();
            super.citesteAplicant(input, student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            student.setAn_studii(an_studii);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }

    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        return List.of();
    }
}
