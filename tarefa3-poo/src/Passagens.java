import java.time.LocalDate;
import java.time.format.DateTimeParseException;

class Passagens {
    private LocalDate data;
    private int numVoo;
    private double custoBase;
    
    public Passagens(LocalDate data, int numVoo, double custoBase){
        this.data = data;
        this.numVoo = numVoo;
        this.custoBase = custoBase;
    }

    public LocalDate validadeDaData(String data) {
        try {
            return LocalDate.parse(data); 
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, informe o ano, o mês e o dia.");
            return null; 
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(int custoBase) {
        this.custoBase = custoBase;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", Número do voo: " + numVoo;
    }

}