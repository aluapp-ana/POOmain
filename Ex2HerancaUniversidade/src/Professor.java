public class Professor extends Funcionario{
    private int cargaHorariaSemanal;

    public Professor(String nome, double salarioBase, int cargaHorariaSemanal) {
        super(nome, salarioBase);
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public int getCargaHorariaSemanal(){ return cargaHorariaSemanal; }

    @Override
    public double calculaSalarioLiquido(){
        double valorHora = getSalarioBase() / 44;
        return (valorHora*getCargaHorariaSemanal()) - calculaInss();
    }
}
