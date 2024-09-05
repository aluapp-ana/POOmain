public class ContaCorrenteQ1{
    private int numero;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrenteQ1(int numero, String nomeCorrentista) {
        if (numero < 0){
            throw new IllegalArgumentException("Numero de conta invalido: "+numero);
        }
        if (nomeCorrentista == null || nomeCorrentista.length() < 2){
            throw new IllegalArgumentException("Nome inválido: "+nomeCorrentista);
        }
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        if (valor <=0){
            throw new IllegalArgumentException("Deposito: valor invalido: "+valor);
        }
        saldo += valor;
    }

    public void retirada(double valor){
        if (valor <=0){
            throw new IllegalArgumentException("Deposito: valor invalido: "+valor);
        }
        if ( saldo - valor < 0){
            throw new IllegalArgumentException("Saldo insuficiente! Saldo: "+saldo);
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente [numero=" + numero + ", nomeCorrentista=" + nomeCorrentista + ", saldo=" + saldo + "]";
    }

    

    
}