import java.time.LocalDate;

public class PassagemPrimeiraClasse extends PassagemExecutiva {
    public PassagemPrimeiraClasse(LocalDate data, String numeroVoo, double custoBase) {
        super(data, numeroVoo, custoBase);
        this.quantidadeMalas = 3; 
        this.acessoPrioritario = true; 
    }

    @Override
    public double calcularCusto() {
        return super.calcularCusto() * 1.50; // 50% a mais que a executiva
    }
}
