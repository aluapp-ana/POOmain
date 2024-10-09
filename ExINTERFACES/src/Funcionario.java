public class Funcionario{
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return nome; }

    public double getSalarioBase() { return salarioBase; }

    public double calculaInss(){ return salarioBase * 0.05; }

    public double calculaSalarioLiquido(){ return salarioBase - calculaInss(); }

    @Override
    public String toString() {
        return this.getClass().getName()+": nome = " + getNome() + 
               ", salarioBase = " + getSalarioBase() +
               ", salarioLiquido = " +calculaSalarioLiquido();
    }
}