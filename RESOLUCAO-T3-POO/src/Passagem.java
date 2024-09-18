import java.time.LocalDate;

public class Passagem{
    private LocalDate data;
    private int nroVoo;
    private double custoBase;
    private int qtdadeBagagem;
    private boolean prioridade;

    public Passagem(LocalDate data, int nroVoo, double custoBase, int qtdadeBagagem,boolean prioridade) {
        this.data = data;
        this.nroVoo = nroVoo;
        this.custoBase = custoBase;
        this.qtdadeBagagem = qtdadeBagagem;
        this.prioridade = prioridade;
    }

    public LocalDate getData() {
        return data;
    }

    public int getNroVoo() {
        return nroVoo;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public int getQtdadeBagagem() {
        return qtdadeBagagem;
    }

    public boolean isPrioridade(){
        return prioridade;
    }

    public void setPrioridade(boolean prioridade){
        this.prioridade = prioridade;
    }

    public double custoFinal(){
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "data=" + data + ", nroVoo=" + nroVoo + ", custoBase=" + custoBase + ", qtdadeBagagem="
                + qtdadeBagagem+", prioridade="+prioridade+", custoFinal R$"+this.custoFinal();
    }

    
    
}