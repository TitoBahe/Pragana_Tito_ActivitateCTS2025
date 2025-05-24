package templateMethod.classes;

public class PachetTransport extends PachetTuristic{

    public PachetTransport(int codPachet) {
        super(codPachet);
    }

    @Override
    void cautaCazare() {

    }

    @Override
    void cautaTransport() {
        System.out.println("Transport gasit pt pachet "+ getCodPachet());
    }

    @Override
    void rezervaPachet() {
        System.out.println("Pachet rezervat");
    }

    @Override
    void vindePachet() {
        System.out.println("Pachet vanzut");
    }
}
