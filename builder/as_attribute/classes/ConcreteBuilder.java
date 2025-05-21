package builder.as_attribute.classes;

public class ConcreteBuilder implements AbstractBuilder{
    private PachetTransport pachetTransport;

    public ConcreteBuilder() {
        this.pachetTransport = new PachetTransport(false, 0, 0, false, false);
    }
    public ConcreteBuilder setWifi(boolean wifi) {
        pachetTransport.setWifi(wifi);
        return this;
    }

    public ConcreteBuilder setAnimaleDeCompanie(int animaleDeCompanie) {
        pachetTransport.setAnimaleDeCompanie(animaleDeCompanie);
        return this;
    }

    public ConcreteBuilder setLocuriFumatori(int locuriFumatori) {
        pachetTransport.setLocuriFumatori(locuriFumatori);
        return this;
    }

    public ConcreteBuilder setAerConditionat(boolean aerConditionat) {
        pachetTransport.setAerConditionat(aerConditionat);
        return this;
    }

    public ConcreteBuilder setTelevizor(boolean televizor) {
        pachetTransport.setTelevizor(televizor);
        return this;
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }
}
