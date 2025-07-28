package Banca;

public class ContoBancario {
    private double saldo;           // Campo privato: incapsulato
    private String numeroConto;     

    // Costruttore
    public ContoBancario(String numeroConto, double saldoIniziale) {
        this.numeroConto = numeroConto;
        this.saldo = saldoIniziale;
    }

    // Metodo per depositare denaro
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        }
    }

    // Metodo per prelevare denaro
    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
        }
    }

    // Metodo per ottenere il saldo corrente
    public double getSaldo() {
        return saldo;
    }

    // Metodo per ottenere il numero del conto
    public String getNumeroConto() {
        return numeroConto;
    }
}

