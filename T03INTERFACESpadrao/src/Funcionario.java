public class Funcionario<T> implements Comparable<Funcionario<T>>{//<T> para criar um parametro na classe, recebe por parametro um tipo T, se deixar <>vazio assume parametro object
    private T matricula;// nem sempre é int,ao inves de ser int, é T
    private String nome;
    private double valorHora;
    private int cargaHorariaSemanal;

    public Funcionario(T matricula,String nome, double valorHora, int chs) {
        this.matricula = matricula;
        this.nome = nome;
        this.valorHora = valorHora;
        this.cargaHorariaSemanal = chs;
    }

    public T getMatricula(){ return matricula; }
    public String getNome() { return nome; }
    public double getValorHora() { return valorHora; }
    public int getCargaHorariaSemanal() { return cargaHorariaSemanal; };
    public double salarioLiquido(){return valorHora*cargaHorariaSemanal;}

    @Override
    public String toString() {
        return getClass()+": [matr:" + getMatricula() + ", nome:" + getNome() + ", valor hora:"//getClass para pegar o nome da classe
                + getValorHora() + ", CHSem:" + getCargaHorariaSemanal() +", salario liquido:" + salarioLiquido() + "]";
    }

    public int compareTo(Funcionario<T> outro){//met compareTo deve retornar 0, >0 ou <0
        //return this.getNome().compareTo(outro.getNome());//para nomes

        if(this.getCargaHorariaSemanal() < outro.getCargaHorariaSemanal()){return -1;}//para cargahorariasemanal
        if(this.getCargaHorariaSemanal() == outro.getCargaHorariaSemanal()){return 0;}
        return 1;
        
        //return this.getCargaHorariaSemanal() == outro.getCargaHorariaSemanal();
    } 
}
        