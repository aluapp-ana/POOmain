import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class App {

    public static void impFuncionarios(List<Funcionario<Integer>> funcionarios){
        for(Funcionario<Integer> f:funcionarios){
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
        ArrayList<Funcionario<Integer>> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario<Integer>(100,"José Maria",120,40));
        funcionarios.add(new Funcionario<Integer>(90,"Lisiane Souto",150,36));
        funcionarios.add(new Funcionario<Integer>(120,"Carla Azambuja",100,40));
        funcionarios.add(new Funcionario<Integer>(180,"Araon Fishman",180,30));
        funcionarios.add(new Funcionario<Integer>(90,"Berenice Andrade",160,20));

        Collections.sort(funcionarios);
        impFuncionarios(funcionarios);

        System.out.println("");
        Collections.sort(funcionarios,new ComparadorFuncionario<Integer>());
        impFuncionarios(funcionarios);
        
        System.out.println("");

    }
}
