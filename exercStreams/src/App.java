import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    private static List<String> nomesProprios = List.of("Miguel","Arthur","Gael","Heitor","Theo","Davi","Gabriel","Bernardo","Samuel","João Miguel","Helena","Alice","Laura","Maria Alice","Valentina","Heloísa","Maria Clara","Maria Cecília","Maria Julia","Sophia");
    private static List<String> sobrenomes = List.of("Silva", "Santos", "Oliveira", "Souza", "Rodrigues", "Ferreira", "Alves", "Pereira", "Lima", "Gomes","Carvalho","Dias","Freitas","Ferreira","Marques","Monteiro","Moura","Nascimento","Santana","Teixeira");

    // Gera uma lista aleatória de nomes e sobrenomes
    public static List<String> geraNomes(int qtdade){
        Set<String> nomesCompostos = new HashSet<>();
        Random random = new Random();

        while(nomesCompostos.size() < qtdade){
            String nome = nomesProprios.get(random.nextInt(nomesProprios.size()));
            String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
            nomesCompostos.add(nome + " " + sobrenome);
        }

        return new ArrayList<>(nomesCompostos);
    }

    public static List<Estudante> geraCadastroEstudantes(int qtdade){
        List<String> nomes = geraNomes(qtdade);
        List<Estudante> estudantes = new ArrayList<>(qtdade);
        int curso = 0;
        Random idade = new Random();
        for(int i=0;i<qtdade;i++){
            //Curso.values()[curso] varia de 0 1 2 entre os cursos
            Estudante estudante = new Estudante(nomes.get(i),Curso.values()[curso],idade.nextInt(6)+17);
            estudantes.add(estudante);
            curso = (curso < 2)?curso+1:0;
        }
        return estudantes;
    }

    public static void main(String[] args) throws Exception {
        List<Estudante> estudantes = geraCadastroEstudantes(30);
        
        // Nomes dos estudantes do curso de computação
        List <String> c = estudantes.stream()
            .filter(e -> e.getCurso()== Curso.COMPUTACAO)
            .map( e -> e.getNome()) 
            .toList();
            //.forEach(n -> System.out.println(n))
        
        System.out.println("Estudantes de computacao: " +c);
        //outra maneira de impressao
        //nome.forEach(e -> System.out.println(e));
        //alternativa de impressao sem gerar lista - linha 50

        // Nomes dos estudantes do curso de computação com mais de 20 anos em ordem alfabética
        List <String> c1 = estudantes.stream()
            .filter(e -> e.getCurso() == Curso.COMPUTACAO)
            .filter(e -> e.getIdade() > 20)
            .map( e -> e.getNome())
            .sorted()
            .toList();
        System.out.println("Estudantes de computacao com mais de 20 anos: " +c1);
    

        // Matricula e nome dos estudantes do curso de computação com mais de 20 anos em ordem crescente de matrícula
        List <String> c2 = estudantes.stream()// classe string ja é comparable
            .filter(e -> e.getCurso() == Curso.COMPUTACAO)
            .filter(e -> e.getIdade() > 20)
            .sorted((e1,e2) -> e1.getMatricula() - e2.getMatricula())
            //ou sorted(e1,e2) -> {if ... um maior q outro e if um igual ao outro}
            .map(e -> e.getMatricula() + " : " +e.getNome())
            .toList();
        System.out.println("\nEstudantes de computacao (+20 anos) com matricula em ordem crescente: " +c2);


        // Duas maiores idades do curso de medicina
        List<Integer> m = estudantes.stream()
        .filter(e -> e.getCurso() == Curso.MEDICINA)
        .map(e -> e.getIdade())
        .sorted((i1,i2) -> i2- i1)
        .distinct()//separa os difetentes
        //se fosse idade maxima do curso, era so usar .max
        .limit(2) //devolve apenas 2
        .toList();
    System.out.println("\nDuas maiores idades do curso de medicina: " +m);

        // Quantidade de alunos do curso de direito

        // Media de idade dos alunos do curso de computação

        // Nome do primeiro aluno de computação com mais de 18 anos

        // Nome de um aluno de computação com mais de 18 anos

        // Se existe um aluno de medicina com mais de 25 anos

        // Se todos alunos do direito tem mais de 17 anos

        // Mapa separando os estudantes por curso

        // Lista com os nomes de uma comissão composta pelos 2 estudantes mais moços de cada curso
    }
}
