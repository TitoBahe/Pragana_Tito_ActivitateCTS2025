package templateMethod.classes;

public class PachetCazare extends PachetTuristic{

    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    void cautaCazare() {
        System.out.println("Cazare gasita pt pachet "+ getCodPachet());
    }

    @Override
    void cautaTransport() {

    }

    @Override
    void rezervaPachet() {
        System.out.println("Pachet rezervat PachetCazare");
    }

    @Override
    void vindePachet() {
        System.out.println("Pachet vanzut PacheteCazare");
    }
}
