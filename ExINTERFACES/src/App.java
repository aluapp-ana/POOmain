import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        
        Tecnico tec = new Tecnico("Ze", 7000, 4);
        ProfessorBrigadista profBrig = new ProfessorBrigadista("Primo do Ze", 15000, 30, 3);
        PesquisadorBrigadista pesqBrig = new PesquisadorBrigadista("Pesquisador Brigadista", 15000, 30, 5, 2);
        Pesquisador pesq = new Pesquisador("Amigo do Ze", 15000, 30, 5);
        ProfessorAdministrador profAdm = new ProfessorAdministrador("Diretor", 20000, 40, "Diretor", 0.2);
    
        
        List<Brigadista> brigadistas = new ArrayList<>();
        brigadistas.add(profBrig);
        brigadistas.add(pesqBrig);
    
        List<Professor> professores = new ArrayList<>();
        professores.add(profBrig);
        professores.add(profAdm);
    
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(tec);
        funcionarios.add(profBrig);
        funcionarios.add(pesqBrig);
        funcionarios.add(pesq);
        funcionarios.add(profAdm);
    
        
        System.out.println("=== Contar Brigadistas ===");
        contarBrigadistas(brigadistas);
    
        System.out.println("\n=== Salário Médio dos Administradores ===");
        salarioMedioAdm(professores);
    
        System.out.println("\n=== Contar Brigadistas entre Funcionários ===");
        contarBrigadistasEntreFuncionarios(funcionarios);
    }

    public static void contarBrigadistas(List<Brigadista> brigadistas) {
        int professores = 0;
        int pesquisadores = 0;

        for (Brigadista b : brigadistas) {
            if (b instanceof ProfessorBrigadista) {
                professores++;
            } else if (b instanceof PesquisadorBrigadista) {
                pesquisadores++;
            }
        }

        System.out.println("Professores Brigadistas: " + professores);
        System.out.println("Pesquisadores Brigadistas: " + pesquisadores);
    }

    
    public static void salarioMedioAdm(List<Professor> professores) {
        double somaSalarios = 0;
        int contador = 0;

        for (Professor p : professores) {
            if (p instanceof Administrador) {
                somaSalarios += p.calculaSalarioLiquido();
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaSalarios / contador;
            System.out.println("Salário médio dos Administradores: " + media);
        } else {
            System.out.println("Nenhum professor administrador encontrado.");
        }
    }

    
    public static void contarBrigadistasEntreFuncionarios(List<Funcionario> funcionarios) {
        int contadorBrigadistas = 0;

        for (Funcionario f : funcionarios) {
            if (f instanceof Brigadista) {
                contadorBrigadistas++;
            }
        }

        System.out.println("Total de Brigadistas: " + contadorBrigadistas);
    }


    /* 
    public static void impFuncionario(Funcionario f){
        System.out.print(f.getNome()+" R$");
        System.out.println(f.calculaSalarioLiquido());
        if (f instanceof Pesquisador){
            System.out.print("É um pesquisador, chp=");
            Pesquisador aux = (Pesquisador)f;
            System.out.println(aux.getCargaHorariaDePesquisa());
        }
    }
    */
    
}

