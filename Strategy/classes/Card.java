package Strategy.classes;

public class Card implements ModPlata{
    @Override
    public void descriere() {
        System.out.println("Card");
    }

    @Override
    public String toString() {
        return "Card{}";
    }
}
