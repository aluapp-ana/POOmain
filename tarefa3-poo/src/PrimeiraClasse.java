import java.time.LocalDate;

public class PrimeiraClasse extends ClasseExecutiva{
    private double custoOpPri;
    private int quantMalasPri;
    private boolean prioritarioPri;

    public PrimeiraClasse (LocalDate data, int numVoo, int custoBase){
        super(data, numVoo, custoBase); 
        this.custoOpPri = super.custoTotalEx() * 0.50;
        this.quantMalasPri = 3; 
        this.prioritarioPri = true; 
    }

    public double getCustoOpPri() {
        return custoOpPri;
    }

    public void setCustoOpPri(double custoOpPri) {
        this.custoOpPri = custoOpPri;
    }

    public int getQuantMalasPri() {
        return quantMalasPri;
    }

    public void setQuantMalasPri(int quantMalasPri) {
        this.quantMalasPri = quantMalasPri;
    }

    public boolean isPrioritarioPri() {
        return prioritarioPri;
    }

    public void setPrioritarioPri(boolean prioritarioPri) {
        this.prioritarioPri = prioritarioPri;
    }

    public double custoTotalPri(){
        return getCustoBase() + getCustoOpPri(); 
    }

    @Override
    public String toString() {
        return "Data: " + getData() + ", Número do voo: " + getNumVoo() + 
        ", Quantidade de malas: " + getQuantMalasPri() + ", Acesso prioritário: " 
        + prioritarioPri + ", Custo: " + custoTotalPri();
    }  
}