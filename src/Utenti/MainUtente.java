package Utenti;

public class MainUtente {

    public static void main(String[] args) {
        Utente utente1 = new Utente("Michele", "Fortunato");
        Utente utente2 = new Utente("Luca", "Turco");
        Utente utente3 = new Utente("Francesco", "Totti");

        System.out.println(utente1);
        System.out.println(utente2);
        System.out.println(utente3);

        System.out.println("Numero totale di utenti: " + Utente.getNumeroUtenti());
    }

        
    }


