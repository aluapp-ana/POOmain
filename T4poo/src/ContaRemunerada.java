public class ContaRemunerada extends ContaBancaria{
    private double txRemuneracao;

    public ContaRemunerada(int numero, String nome, double saldo, double txRemuneracao) {
        super(numero, nome, saldo);
        defineTaxaRemuneracao(txRemuneracao);
    }

    public double getTxRemuneracao() {
        return txRemuneracao;
    }

    public void defineTaxaRemuneracao(double taxa){
        if (taxa < 0 || taxa > 1.0){
            this.txRemuneracao = 0.0;
        }
        this.txRemuneracao = taxa;
    }
    
    @Override
    public boolean deposito(double valor){
        double valorRemunerado = valor * (this.txRemuneracao+1);
        return super.deposito(valorRemunerado);
    }
}
