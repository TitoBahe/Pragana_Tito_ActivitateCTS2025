package builder.as_attribute.classes;

public class PachetTransport {
    private boolean wifi;
    private int animaleDeCompanie;
    private int locuriFumatori;
    private boolean aerConditionat;
    private boolean televizor;

    protected PachetTransport(boolean wifi, int animaleDeCompanie, int locuriFumatori, boolean aerConditionat, boolean televizor) {
        this.wifi = wifi;
        this.animaleDeCompanie = animaleDeCompanie;
        this.locuriFumatori = locuriFumatori;
        this.aerConditionat = aerConditionat;
        this.televizor = televizor;
    }

    protected void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    protected void setAnimaleDeCompanie(int animaleDeCompanie) {
        this.animaleDeCompanie = animaleDeCompanie;
    }

    protected void setLocuriFumatori(int locuriFumatori) {
        this.locuriFumatori = locuriFumatori;
    }

    protected void setAerConditionat(boolean aerConditionat) {
        this.aerConditionat = aerConditionat;
    }

    protected void setTelevizor(boolean televizor) {
        this.televizor = televizor;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "wifi=" + wifi +
                ", animaleDeCompanie=" + animaleDeCompanie +
                ", locuriFumatori=" + locuriFumatori +
                ", aerConditionat=" + aerConditionat +
                ", televizor=" + televizor +
                '}';
    }
}
