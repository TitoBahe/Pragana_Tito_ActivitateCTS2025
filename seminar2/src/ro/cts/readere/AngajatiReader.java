package ro.cts.readere;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader{

    public List<Aplicant> readAngajati(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
//            String nume = input2.next();
//            String prenume = input2.next();
//            int varsta = input2.nextInt();
//            int punctaj = input2.nextInt();
//            int nr = input2.nextInt();
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input2.next();
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            super.citesteAplicant(input2, angajat);
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }

    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        return List.of();
    }
}
