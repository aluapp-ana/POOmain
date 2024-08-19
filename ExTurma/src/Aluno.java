public class Aluno {
    private int matricula;
    private double nota;

    public Aluno(int matricula) {
        this.matricula = matricula;
        this.nota = -1.0; 
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
