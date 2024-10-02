public class Tecnico extends Funcionario {
    private int categoria;

    public Tecnico(String nome, double salarioBase, int categoria) {
        super(nome, salarioBase);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    @Override
    public double calculaSalarioLiquido(){
        double sal = super.calculaSalarioLiquido();
        if (categoria >=3){
            sal *= 1.05;
        }
        return sal;
    }

    @Override
    public String toString() {
        return super.toString() + ", categoria=" + categoria;
    }
}