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
            .filter(e -> e.getCurso() == Curso.COMPUTACAO)
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
         long quantAlunosDireito = estudantes.stream()//uso do long por segunranca
            .filter(d -> d.getCurso() == Curso.DIREITO)
            .count();

        System.out.println("\n Quantidade de alunos do curso de Direito: " +quantAlunosDireito);


        // Media de idade dos alunos do curso de computação
        double MediaComp = estudantes.stream()
            .filter(alunos -> alunos.getCurso() == Curso.COMPUTACAO)
            .mapToDouble(alunos -> alunos.getIdade())//map transforma um obj de entrada para um obj de tal tipo de saida - pode usar .mapToInt
            .average()
            .getAsDouble();//.orElse(0.0) usado apenas quando Optional

        System.out.println("\nMedia de idade dos alunos de Computacao: " +MediaComp);

        // Nome do primeiro aluno de computação com mais de 18 anos
        String Adezoito = estudantes.stream()
            .filter(dezoito -> dezoito.getCurso() == Curso.COMPUTACAO)
            .filter(dezoito -> dezoito.getIdade() > 18)
            //.sorted((e1,e2) -> (e1.getNome()).compareTo(e2.getNome())) //para ordenar alfabeticamente
            .findFirst()
            .map(dezoito -> dezoito.getNome())
            .orElse("Ninguem...");//findFirst pode nao encontrar ninguem

        System.out.println("\nPrimeiro aluno de computacao com mais de 18 anos: " + Adezoito);

        // Nome de um aluno de computação com mais de 18 anos
        String qualquerAluno = estudantes.stream()
            .filter(aluno -> aluno.getCurso() == Curso.COMPUTACAO)
            .filter(aluno -> aluno.getIdade() > 18)
            .map(aluno -> aluno.getNome())
            .findAny()
            .orElse("Ninguem");

        System.out.println("\nNome de qualquer aluno de computacao com mais de 18 anos: " +qualquerAluno);
           
        // Se existe um aluno de medicina com mais de 25 anos
        boolean alunoMed25anos = estudantes.stream()
            .filter(aluno -> aluno.getCurso() == Curso.MEDICINA)
            .anyMatch(aluno -> aluno.getIdade() > 25);

        System.out.println("\nExiste um aluno de medicina com mais de 25 anos? " + alunoMed25anos);


        // Se todos alunos do direito tem mais de 17 anos
        boolean alunosDireito = estudantes.stream()
            .filter(alunos -> alunos.getCurso() == Curso.DIREITO)
            .allMatch(alunos -> alunos.getIdade() > 17);

        System.out.println("\nTodos alunos do direito tem mais de 17 anos? " + alunosDireito);


        // Mapa separando os estudantes por curso
        Map <Curso, List<Estudante>> cursos = estudantes.stream()
            .collect(Collectors.groupingBy(e -> e.getCurso())); //agrupa os estudantes por curso aqui

        System.out.println("\nMapa separando os estudantes por c'1urso: " +cursos);
        System.out.println("\n" +cursos.get(Curso.COMPUTACAO));
        System.out.println("\n" +cursos.get(Curso.DIREITO));
        System.out.println("\n" +cursos.get(Curso.MEDICINA));

    

        // Lista com os nomes de uma comissão composta pelos 2 estudantes mais moços de cada curso
        List<String> maisJovens = cursos.values().stream()
            //flatMap pega 3 listas e unifica
            .flatMap(e -> e.stream()
                .sorted(Comparator.comparingInt(Estudante::getIdade))
                .limit(2)
                .map(es -> es.getNome()+ "/"+ es.getCurso())
            )
            .sorted()
            .toList();
          System.out.println(maisJovens);
    }
}

