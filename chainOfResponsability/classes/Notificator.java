package chainOfResponsability.classes;

public abstract class Notificator {
    private Notificator nexNotificator;

    public Notificator(Notificator nexNotificator) {
        this.nexNotificator = nexNotificator;
    }

    public abstract void notifica(Client client, String mesaj);

    public Notificator getNexNotificator() {
        return nexNotificator;
    }

    public void setNexNotificator(Notificator nexNotificator) {
        this.nexNotificator = nexNotificator;
    }

}
