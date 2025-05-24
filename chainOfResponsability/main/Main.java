package chainOfResponsability.main;


import chainOfResponsability.classes.*;
//Usar quando tiver que fazer varias requisicoes simultaneas, tipo, verificar algo, passa pro proximo verifica outra coisa, .. etc
public class Main {
    public static void main(String[] args){
        Client c = new Client("tito", null, null);
        Notificator notificatorEmail = new NotifcatorEmail(null);
        Notificator notificatorSms = new NotificatorSMS(null);
        Notificator notificatorManager = new NotificaManager(null);

        notificatorEmail.setNexNotificator(notificatorSms);
        notificatorSms.setNexNotificator(notificatorManager);

        notificatorEmail.notifica(c, "oieioe");
    }
}
