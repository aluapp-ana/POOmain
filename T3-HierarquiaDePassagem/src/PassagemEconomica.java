import java.time.LocalDate;

public class PassagemEconomica extends Passagem {
    public PassagemEconomica(LocalDate data, String numeroVoo, double custoBase) {
        super(data, numeroVoo, custoBase);
    }

    @Override
    public double calcularCusto() {
        return custoBase + (custoBase * 0.10); 
    }
}

