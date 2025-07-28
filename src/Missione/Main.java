package Missione;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MissioneSpaziale> missioni = new ArrayList<>();

        missioni.add(new MissioneScientifica("Zeus", "Studio della Luna"));
        missioni.add(new MissioneCommerciale("Poseidone", "SpaceX"));
        missioni.add(new MissioneScientifica("Ares", "Ricerca vita su Marte"));
        missioni.add(new MissioneCommerciale("Eros", "Blue Origin"));

        for (MissioneSpaziale missione : missioni) {
            missione.stampaDettagli();
            System.out.println("");
        }

        System.out.println("Numero totale missioni create: " + MissioneSpaziale.getNumeroMissioniCreate());
    }
}
