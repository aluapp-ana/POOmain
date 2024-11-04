public class Estudante {
    private static int gerMatr = 0;
    private int matricula;
    private String nome;
    private Curso curso;
    private int idade;

    public Estudante(String nome, Curso curso, int idade) {
        this.matricula = ++gerMatr;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Matricula:" + getMatricula() + ", Nome:" + getNome() + ", Curso:" + getCurso()
                + ", Idade:" + getIdade();
    }
}