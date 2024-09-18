import java.time.LocalDate;

public class ClasseExecutiva extends Passagens{
    private double custoOpEx;
    private int quantMalasEx;
    private boolean prioritarioEx;

    public ClasseExecutiva(LocalDate data, int numVoo, double custoBase){
        super(data, numVoo, custoBase); 
        this.custoOpEx = getCustoBase() * 0.30;
        this.quantMalasEx = 1;
        this.prioritarioEx = false; 
    }

    public double getCustoOpEx() {
        return custoOpEx;
    }

    public void setCustoOpEx(double custoOp) {
        this.custoOpEx = custoOp;
    }

    public int getQuantMalasEx() {
        return quantMalasEx;
    }

    public void setQuantMalasEx(int quantMalas) {
        this.quantMalasEx = quantMalas;
    }

    public boolean isPrioritarioEx() {
        return prioritarioEx;
    }

    public void setPrioritarioEx(boolean prioritario) {
        this.prioritarioEx = prioritario;
    }

    public double custoTotalEx(){
        return getCustoBase() + getCustoOpEx(); 
    }

    @Override
    public String toString() {
        return super.toString() + " Quantidade de malas: " + getQuantMalasEx() + 
        ", Acesso prioritário: " + prioritarioEx + ", Custo: " + custoTotalEx();
    }  
}