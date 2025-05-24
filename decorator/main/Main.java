package decorator.main;

// Agenția de turism dorește să ofere pentru o perioadă de trei luni
//posibilitatea de anulare a pachetelor rezervate. Această ofertă expiră în
//trei luni. Managerul agenției nu dorește să modifice codul, deoarece
//după trei luni trebuie să modifice iar codul sursă.
// Să se implementeze modulul care asigură oferta agenției fără a se
//modifica codul existent.

//-> Sempre e algo ou para deixar se executar durante o runtime ou para nao mexer no restante do codigo

//TODO RESUMO
//Isso aqui é um wrapper, ele vai implementar a interface maior em uma classe abstrata e criar novas funcoes,
//Fazmos isso pq a patir de agora, todas as outras classes serao criadas a partir desse decorator. Entao
// meio que essa classe abstracta se torna a interface mae.

// a classe tem que ser abstrata pq nao queremos criar instancias dela, e sim classes, que ai criam instancias.
//Entao meior que criamos um NovoPachetTuristic e um novo PachetCazare
public class Main {
    public static void main(String[] args){

    }
}
