package ro.cts.model.personal;

public class Student extends Persoana {
    private int idStudent;
    private float bursaStudent;

    public Student(String nume, int varsta, float bursaStudent, int idStudent) {
        super(nume, varsta);
        this.bursaStudent = bursaStudent;
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public float getBursaStudent() {
        return bursaStudent;
    }

    @Override
    public float calculareVenit() {
        return bursaStudent;
    }
}
