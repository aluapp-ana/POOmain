import java.time.LocalDate;

public class Executiva extends Passagem{
   
    public Executiva(LocalDate data, int nroVoo, double custoBase,int qtdadeBagagem){
        super(data,nroVoo,custoBase,qtdadeBagagem,false);
        if (getQtdadeBagagem() > 1){
            throw new IllegalArgumentException("Quantidade de bagagens invalida");
        }
    }

    @Override
    public double custoFinal(){
        return this.getCustoBase() * 1.3;
    }
}
