package chainOfResponsability.classes;

public class NotifcatorEmail extends Notificator{

    public NotifcatorEmail(Notificator nexNotificator) {
        super(nexNotificator);
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() == null){
            this.getNexNotificator().notifica(client, mesaj);
            return;
        }
        System.out.println("NotifcatorEmail chemat");
    }
}
