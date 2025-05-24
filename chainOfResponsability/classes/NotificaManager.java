package chainOfResponsability.classes;

public class NotificaManager extends Notificator{

    public NotificaManager(Notificator nexNotificator) {
        super(nexNotificator);
    }

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Client: "+ client.toString() +"n-are o forma de a intra in contact");
    }
}
