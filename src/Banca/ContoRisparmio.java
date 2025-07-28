package Banca;

public class ContoRisparmio extends ContoBancario {
    private double tassoInteresse;

    // Costruttore
    public ContoRisparmio(String numeroConto, double saldoIniziale, double tassoInteresse) {
        super(numeroConto, saldoIniziale);  // Chiama il costruttore della superclasse
        this.tassoInteresse = tassoInteresse;
    }

    // Applica gli interessi al saldo attuale
    public void applicaInteressi() {
        double interessi = getSaldo() * (tassoInteresse / 100);
        deposita(interessi);  // Riutilizza il metodo della superclasse
    }
}

