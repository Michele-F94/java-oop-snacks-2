package ClasseAstatta;

public class MainFigura {
    public static void main(String[] args) {
        Figura cerchio = new Cerchio(5);
        Figura rettangolo = new Rettangolo(4, 6);

        System.out.println("Area Cerchio: " + cerchio.calcolaArea());
        System.out.println("Area Rettangolo: " + rettangolo.calcolaArea());

        // Metodo final
        Rettangolo r = new Rettangolo(3, 8);
        System.out.println(r.descrizione());
    }
}


