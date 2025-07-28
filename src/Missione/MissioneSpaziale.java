package Missione;

public class MissioneSpaziale {

    private String nomeMissione;
    private final int idMissione;

    private static int contatoreId = 0;

    public MissioneSpaziale(String nomeMissione) {
        this.nomeMissione = nomeMissione;
        this.idMissione = ++contatoreId;
    }

    public void stampaDettagli() {
        System.out.println("Missione: " + nomeMissione + ", ID: " + idMissione);
    }
    // Metodo statico per ottenere il numero totale di missioni
    public static int getNumeroMissioniCreate() {
        return contatoreId;
    }



}
