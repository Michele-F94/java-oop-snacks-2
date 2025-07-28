package ClasseAstatta;

public class Rettangolo extends Figura {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo che vogliamo rendere final
    public final String descrizione() {
        return "Rettangolo con base " + base + " e altezza " + altezza;
    }

    
    public double calcolaArea() {
        return base * altezza;
    }
}
