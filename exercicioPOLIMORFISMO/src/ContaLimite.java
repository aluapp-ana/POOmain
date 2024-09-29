public class ContaLimite extends ContaBancaria {
    private double limite;
    private double taxaJuros;
    private double jurosDevidos;

    public ContaLimite(int numero, String nome, double saldo, double limite, double taxaJuros) {
        super(numero, nome, saldo);
        this.limite = limite;
        this.taxaJuros = taxaJuros;
        this.jurosDevidos = 0.0;
        deposito(limite);
    }

    public double getLimite() {
        return limite;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public double getJurosDevidos(){
        return this.jurosDevidos;
    }

    @Override
    public double getSaldo(){
        return super.getSaldo() - limite;
    }

    @Override
    public boolean retirada(double valor){
        boolean aux = super.retirada(valor);
        if (aux == false){
            return aux;
        }
        if (getSaldo() < 0.0){
            double juros = Math.abs(getSaldo()) * this.taxaJuros;
            this.jurosDevidos += juros;
        }
        return aux;
    }

    public boolean quitaJuros(){
        if (getSaldo() - getJurosDevidos() > 0){
            retirada(getJurosDevidos());
            jurosDevidos = 0;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return super.toString()+", juros devidos: "+this.getJurosDevidos();
    }
}
