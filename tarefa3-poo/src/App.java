import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate data1 = LocalDate.parse("2024-06-23");
        LocalDate data2 = LocalDate.parse("2024-12-30");
        LocalDate data3 = LocalDate.parse("2024-02-15");

        ClasseEconomica p1 = new ClasseEconomica( data1, 3329 , 200);
        System.out.println("Passagem Econômica: " + p1.toString());

        ClasseExecutiva p2 = new ClasseExecutiva( data2, 2458 , 400);
        System.out.println("Passagem Executiva: " + p2.toString());

        PrimeiraClasse p3 = new PrimeiraClasse( data3, 5746 , 1000);
        System.out.println("Passagem Primeira Classe: " + p3.toString());
    }
}