package chainOfResponsability.classes;

public class NotificatorSMS extends Notificator{
    public NotificatorSMS(Notificator nexNotificator) {
        super(nexNotificator);
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getSMS() == null){
            this.getNexNotificator().notifica(client, mesaj);
            return;
        }
        System.out.println("NotifcatorSms chemat");
    }
}
