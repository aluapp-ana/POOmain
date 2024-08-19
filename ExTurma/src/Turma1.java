public class Turma1 {

    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.quantidadeAlunos = 0;
    }

    public void informarNota(int matricula, double nota) {
        Aluno aluno = recuperarAluno(matricula);
        if (aluno != null) {
            aluno.setNota(nota);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public Aluno recuperarAluno(int matricula) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getMatricula() == matricula) {
                return new Aluno(alunos[i].getMatricula()); // retorna uma cópia
            }
        }
        return null; // aluno não encontrado
    }

    public Aluno[] retornarTodosAlunos() {
        Aluno[] copia = new Aluno[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            copia[i] = new Aluno(alunos[i].getMatricula()); // retorna cópia para garantir encapsulamento
            copia[i].setNota(alunos[i].getNota());
        }
        return copia;
    }

    public Aluno[] retornarAprovados(double notaMin) {
        int contadorAprovados = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNota() >= notaMin) {
                contadorAprovados++;
            }
        }

        Aluno[] aprovados = new Aluno[contadorAprovados];
        int index = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNota() >= notaMin) {
                aprovados[index] = new Aluno(alunos[i].getMatricula());
                aprovados[index].setNota(alunos[i].getNota());
                index++;
            }
        }
        return aprovados;
    }

    public Aluno[] retornarReprovados(double notaMin) {
        int contadorReprovados = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNota() < notaMin) {
                contadorReprovados++;
            }
        }

        Aluno[] reprovados = new Aluno[contadorReprovados];
        int index = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNota() < notaMin) {
                reprovados[index] = new Aluno(alunos[i].getMatricula());
                reprovados[index].setNota(alunos[i].getNota());
                index++;
            }
        }
        return reprovados;
    }


}
