package Banca;

  public class Main {
    public static void main(String[] args) {
        // Crea un conto bancario generico
        ContoBancario conto1 = new ContoBancario("333333", 200.0);
        conto1.deposita(500);
        conto1.preleva(200);
        System.out.println("Numero Conto: " + conto1.getNumeroConto());
        System.out.println("Saldo Conto Bancario: " + conto1.getSaldo());
        
        

        // Crea un conto risparmio con tasso d’interesse
        ContoRisparmio conto2 = new ContoRisparmio("3333333", 2000.0, 2.5);
        conto2.applicaInteressi();  // Applica interesse del 2.5%
        System.out.println("Numero Conto: " + conto2.getNumeroConto());
        System.out.println("Saldo Conto Risparmio (dopo interessi): " + conto2.getSaldo());
        
    }
}

