package ro.cts.model.personal;

public class Professor extends Persoana implements IPredabil {

    private int id;
    private float salariul;
    private float sporVechime;


    public Professor(String nume, int varsta, int id, float salariul, float sporVechime) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariul;
        this.sporVechime = salariul;
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ").append(this.nume).append("preda la curs");
        System.out.println(builder.toString());
    }

    @Override
    public float calculareVenit() {
        return salariul + (salariul * sporVechime);
    }

}
