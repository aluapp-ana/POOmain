import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //formatei a data para o padrão brasileiro
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataVoo = null;
        
        while (dataVoo == null) {
            System.out.print("Digite a data do voo (formato DD-MM-YYYY): ");
            String dataVooEntrada = entrada.nextLine();
            try {
                dataVoo = LocalDate.parse(dataVooEntrada, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data inválido! Tente novamente no formato DD-MM-YYYY.");
            }
        }

        System.out.print("Digite o número do voo: ");
        String numeroVoo = entrada.nextLine();
        while (numeroVoo.trim().isEmpty()) {
            System.out.print("Número do voo inválido! Tente novamente: ");
            numeroVoo = entrada.nextLine();
        }
        
        System.out.print("Digite o custo base da passagem: ");
        double custoBase = entrada.nextDouble();
        entrada.nextLine(); 
        while (custoBase <= 0) {
            System.out.print("Digite o custo base da passagem (valor positivo): ");
            custoBase = entrada.nextDouble();
            entrada.nextLine(); 
        }

        int escolhaClasse = 0;
        while (escolhaClasse < 1 || escolhaClasse > 3) {
            System.out.println("Escolha a classe da passagem:");
            System.out.println("[1] Econômica");
            System.out.println("[2] Executiva");
            System.out.println("[3] Primeira Classe");
            System.out.print("Classe escolhida: ");
            if (entrada.hasNextInt()) {
                escolhaClasse = entrada.nextInt();
                entrada.nextLine(); 
                if (escolhaClasse < 1 || escolhaClasse > 3) {
                    System.out.println("Opção inválida! Escolha entre 1 e 3.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número entre 1 e 3.");
                entrada.nextLine(); 
            }
        }

        
        Passagem passagem = null;
        switch (escolhaClasse) {
            case 1:
                passagem = new PassagemEconomica(dataVoo, numeroVoo, custoBase);
                break;
            case 2:
                passagem = new PassagemExecutiva(dataVoo, numeroVoo, custoBase);
                break;
            case 3:
                passagem = new PassagemPrimeiraClasse(dataVoo, numeroVoo, custoBase);
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        
        System.out.println("\nDetalhes da Passagem:");
        passagem.exibirDetalhes();

        entrada.close();
    }
}
