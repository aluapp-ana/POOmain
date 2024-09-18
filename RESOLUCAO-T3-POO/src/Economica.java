import java.time.LocalDate;

public class Economica extends Passagem{
    public Economica(LocalDate data, int nroVoo, double custoBase){
        super(data,nroVoo,custoBase,0,false);
    }

    @Override
    public double custoFinal(){
        return this.getCustoBase() * 1.1;
    }
}
