package ClasseAstatta;


public class Cerchio extends Figura {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    
    public double calcolaArea() {
        return PI_GRECO * raggio * raggio;
    }
}

