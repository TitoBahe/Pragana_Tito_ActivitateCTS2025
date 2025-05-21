package builder.as_class.classes;

public class PachetTransport {
    private int animaleDeCompania;
    private boolean wifi;
    private int LocuriPentruFumatori;
    private boolean aerConditionat;
    private boolean televizor;

    public PachetTransport(int animaleDeCompania, Boolean wifi, int locuriPentruFumatori, Boolean televizor, Boolean aerConditionat) {
        this.animaleDeCompania = animaleDeCompania;
        this.wifi = wifi;
        LocuriPentruFumatori = locuriPentruFumatori;
        this.televizor = televizor;
        this.aerConditionat = aerConditionat;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "animaleDeCompania=" + animaleDeCompania +
                ", wifi=" + wifi +
                ", LocuriPentruFumatori=" + LocuriPentruFumatori +
                ", aerConditionat=" + aerConditionat +
                ", televizor=" + televizor +
                '}';
    }
}
