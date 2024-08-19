public class App1 {
    public static void main(String[] args) {
        Turma turma = new Turma(5);

        turma.addAluno(1);
        turma.addAluno(2);
        turma.addAluno(3);

        turma.infoNota(1, 8.1);
        turma.infoNota(2, 4.0);
        turma.infoNota(3, 9.7);

        //todos os alunos
        Aluno[] todos = turma.retornarTodosAlunos();
        for (int i = 0; i < todos.length; i++) {
            System.out.println("Matrícula: " + todos[i].getMatricula() + ", Nota: " + todos[i].getNota());
        }

        //alunos aprovados
        Aluno[] aprovados = turma.retornarAprovados(7.0);
        System.out.println("Aprovados:");
        for (int i = 0; i < aprovados.length; i++) {
            System.out.println("Matrícula: " + aprovados[i].getMatricula() + ", Nota: " + aprovados[i].getNota());
        }

        //alunos reprovados
        Aluno[] reprovados = turma.retornarReprovados(7.0);
        System.out.println("Reprovados:");
        for (int i = 0; i < reprovados.length; i++) {
            System.out.println("Matrícula: " + reprovados[i].getMatricula() + ", Nota: " + reprovados[i].getNota());
        }
    }
}
