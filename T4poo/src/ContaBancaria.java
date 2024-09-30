public class ContaBancaria {
    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valor){
        if (valor <= 0.0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean retirada(double valor){
        if (valor <= 0.0 || saldo-valor < 0.0){
            return false;
        }
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "ContaBancaria: numero=" + getNumero() + ", nome=" + getNome() + ", saldo=" + getSaldo();
    }
}
