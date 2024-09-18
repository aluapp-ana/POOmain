import java.time.LocalDate;

public class PassagemExecutiva extends Passagem {
    public PassagemExecutiva(LocalDate data, String numeroVoo, double custoBase) {
        super(data, numeroVoo, custoBase);
        this.quantidadeMalas = 1; 
    }

    @Override
    public double calcularCusto() {
        return custoBase + (custoBase * 0.30); 
    }
}
