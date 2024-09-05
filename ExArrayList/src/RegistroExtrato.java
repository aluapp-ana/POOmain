import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RegistroExtrato {
    private LocalDate data;
    private LocalTime hora;
    private double valor;
    private TipoOperacao tipo;

    public RegistroExtrato(double valor, TipoOperacao tipo) {
        if (valor <=0){
            throw new IllegalArgumentException("Valor invalido: "+valor);
        }
        this.valor = valor;
        this.tipo = tipo;
        data = LocalDate.now();
        hora = LocalTime.now();
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public double getValor() {
        return valor;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "RegistroExtrato [data=" + 
            data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
            ", hora=" + 
            hora.format(DateTimeFormatter.ofPattern("HH:mm:ss")) +
            ", valor=" +
            valor +
            ", tipo=" +
            tipo + "]";
    }
}
