package ro.cts.model.plataforma;

import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Persoana;
import ro.cts.model.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil professor;
    private List<Student> student;

    public Curs(String numeCurs, int credite, IPredabil professor, List<Student> student) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.professor = professor;
        this.student = student;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfessor() {
        return professor;
    }

    public void setProfessor(IPredabil professor) {
        this.professor = professor;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public void sustineExamen(String data){
        StringBuilder builder = new StringBuilder();
        builder.append("Professorul ").append(((Persoana) this.professor).getNume()).append(" are examen la materia ").append(this.numeCurs).append(" urmatorii studenti: ");
        System.out.println(builder.toString());
        for( Student student : this.student){
            System.out.println(student.getNume());
        }
        System.out.println(data);

    }
}
