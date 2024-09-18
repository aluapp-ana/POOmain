import java.time.LocalDate;

public class ClasseEconomica extends Passagens{
    private double custoOpEco;
    private int quantMalasEco; 
    private boolean prioritarioEco; 

    public ClasseEconomica (LocalDate data, int numVoo, double custoBase) {
        super(data, numVoo, custoBase); 
        this.custoOpEco = getCustoBase()*0.10; 
        this.quantMalasEco = 0; 
        this.prioritarioEco = false;
    }

    public double getCustoOpEco() {
        return custoOpEco;
    }

    public int getQuantMalasEco() {
        return quantMalasEco;
    }

    public boolean isPrioritarioEco() {
        return prioritarioEco;
    }

    public double custoTotalEco (){
        return getCustoBase() + getCustoOpEco(); 
    }

    @Override
    public String toString() {
        return super.toString() + " Acesso prioritário: " + prioritarioEco + 
        ", Quantidade de malas: " + getQuantMalasEco() + ", Custo: " + custoTotalEco();
    }
}