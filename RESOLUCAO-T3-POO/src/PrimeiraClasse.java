import java.time.LocalDate;

public class PrimeiraClasse extends Passagem {

    public PrimeiraClasse(LocalDate data, int nroVoo, double custoBase, int qtdadeBagagem) {
        super(data, nroVoo, custoBase, qtdadeBagagem,true);
        if (this.getQtdadeBagagem() > 3){
            throw new IllegalArgumentException("Quantidade de bagagens invalida!");
        }
    }
    
    @Override
    public double custoFinal(){
        return (super.getCustoBase()*1.3)*1.5;
    }
}
