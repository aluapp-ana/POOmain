import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Tecnico tec = new Tecnico("Zezinho",7000,4);
        Professor prof = new Professor("Primo do Zezinho",15000,30);
        Pesquisador pesq = new Pesquisador("Amigo do Zezinho", 15000, 30, 5);

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(tec);
        lista.add(prof);
        lista.add(pesq);

        for (Funcionario local : lista ){
            System.out.println("-----------------------------");
            System.out.println("Nome: " + local.getNome());
            System.out.println("Salario Liquido: " + String.format("%.2f", local.calculaSalarioLiquido()));//usei string.format para truncar um pouco o valor do salario liq, pois ficou muito extenso
            System.out.println("-----------------------------");
            System.out.println("\n");
        }

        /*System.out.println();
        System.out.println(tec);
        System.out.println(prof);
        System.out.println(pesq);
        */

    }
}
