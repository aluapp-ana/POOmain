public abstract class Funcionario{//transformei a classe concreta em abstrata
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return nome;}

    public double getSalarioBase() { return salarioBase; }

    public double calculaInss(){ return salarioBase * 0.05; }

    public abstract double calculaSalarioLiquido(); //lembrar: desenvolvimento do metodo abstract sempre em alguma subclasse concreta(que nao é abstrata)

    @Override
    public String toString() {
        return this.getClass().getName()+": nome = " + getNome() + 
               ", salarioBase = " + getSalarioBase() +
               ", salarioLiquido = " +calculaSalarioLiquido();
    }
}