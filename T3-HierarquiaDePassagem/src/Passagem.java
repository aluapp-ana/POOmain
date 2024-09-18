import java.time.LocalDate;

public class Passagem {
    protected LocalDate data;
    protected String numeroVoo;
    protected double custoBase;
    protected int quantidadeMalas;
    protected boolean acessoPrioritario;

    public Passagem(LocalDate data, String numeroVoo, double custoBase) {
        this.data = data;
        this.numeroVoo = numeroVoo;
        this.custoBase = custoBase;
        this.quantidadeMalas = 0; 
        this.acessoPrioritario = false; 
    }

    public double calcularCusto() {
        return custoBase;
    }

    public int getQuantidadeMalas() {
        return quantidadeMalas;
    }

    public boolean getAcessoPrioritario() {
        return acessoPrioritario;
    }

    public void exibirDetalhes() {
        System.out.println("Voo: " + numeroVoo);
        System.out.println("Data: " + data);
        System.out.println("Custo Total: R$ " + calcularCusto());
        System.out.println("Quantidade de Malas: " + quantidadeMalas);
        System.out.println("Acesso Prioritário: " + (acessoPrioritario ? "Disponivel" : "Não disponivel"));
    }
}
