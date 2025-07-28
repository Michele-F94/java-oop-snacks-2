package Utenti;

public class Utente {


    private String nome;
    private String cognome;

    private static int numeroUtenti = 0;
    private int idUtente;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.idUtente = ++numeroUtenti; // Incrementa il contatore e assegna l'ID
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getIdUtente() {
        return idUtente;
    }
    public static int getNumeroUtenti() {
        return numeroUtenti;
    }
    @Override
    public String toString() {
        return "Utente{" +"nome='" + nome + '\'' +", cognome='" + cognome + '\'' +", idUtente=" + idUtente +'}';
    }
}
