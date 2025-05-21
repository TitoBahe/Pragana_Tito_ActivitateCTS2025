package builder.as_class.classes;

public class ConcreteBuilder implements AbstractBuilder {
    private int animaleDeCompanie;
    private boolean wifi;
    private int locuriFumatori;
    private boolean aerConditionat;
    private boolean televizor;

    public ConcreteBuilder() {
        this.animaleDeCompanie = 0;
        this.wifi = false;
        this.locuriFumatori = 0;
        this.aerConditionat = false;
        this.televizor = false;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(animaleDeCompanie, wifi, locuriFumatori, televizor, aerConditionat);
    }

    public ConcreteBuilder setAnimaleDeCompanie(int animaleDeCompanie) {
        this.animaleDeCompanie = animaleDeCompanie;
        return this;
    }

    public ConcreteBuilder setWifi(Boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    public ConcreteBuilder setLocuriFumatori(int locuriFumatori) {
        this.locuriFumatori = locuriFumatori;
        return this;
    }

    public ConcreteBuilder setAerConditionat(Boolean aerConditionat) {
        this.aerConditionat = aerConditionat;
        return this;
    }

    public ConcreteBuilder setTelevizor(Boolean televizor) {
        this.televizor = televizor;
        return this;
    }
}
