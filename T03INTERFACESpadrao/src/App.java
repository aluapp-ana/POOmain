import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class App {

    public static void impFuncionarios(List<Funcionario> funcionarios){
        for(Funcionario f:funcionarios){
            System.out.println(f.toString());
        }
    }
    public static void main(String[] args) throws Exception {
        //List<String> nomes = new ArrayList<>();
        List<String> nomes = new LinkedList<>();
        //ArrayList<String> nomes = new ArrayList<>();

        System.out.println("\nNomes: ");
        nomes.add("José Maria");
        nomes.add("Lisiane Souto");
        nomes.add("Carla Azambuja");
        nomes.add("Araon Fischman");
        nomes.add("Berenice Andrade");

        Collections.sort(nomes);//ordena a lista de nomes
        
        for(String nome:nomes){
            System.out.println(nome);
        }

        System.out.println("\nFuncionarios:");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario(100,"José Maria",120,40));
        funcionarios.add(new Funcionario(90,"Lisiane Souto",150,36));
        funcionarios.add(new Funcionario(120,"Carla Azambuja",100,40));
        funcionarios.add(new Funcionario(180,"Araon Fishman",180,30));
        funcionarios.add(new Funcionario(90,"Berenice Andrade",160,20));

        Collections.sort(funcionarios);
        impFuncionarios(funcionarios);

        
        System.out.println("");
        Collections.sort(funcionarios,new ComparadorFuncionarioT());
        impFuncionarios(funcionarios);

        Collections.sort(funcionarios, new Comparator<Funcionario>() {//classe aninhada anonima,criada na hora em que vai ser usada e n tem nome
            public int compare (Funcionario o1, Funcionario o2){
                return o1.getMatricula() - o2.getMatricula();//vai dar <0 >0 =0
            }
            
        });
        
        System.out.println("");

    }
}
