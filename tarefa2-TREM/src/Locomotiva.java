public class Locomotiva {
    private int id;
    private int pesoMaxPuxar;
    private int numeroMaxVagoes;

    public Locomotiva(int id, int pesoMaxPuxar, int numeroMaxVagoes) {
        if(id<0) {throw new IllegalArgumentException("Numero de identificação inválido: " +id);}
        if(pesoMaxPuxar<0) {throw new IllegalArgumentException("Peso máximo de toneladas inválido: " +pesoMaxPuxar);}
        if(numeroMaxVagoes<0) {throw new IllegalArgumentException("Numero máximo de vagões inválido: " +numeroMaxVagoes);}
        this.id = id;
        this.pesoMaxPuxar = pesoMaxPuxar;
        this.numeroMaxVagoes = numeroMaxVagoes;
    }

    public int getId() {
        return id;
    }

    public int getPesoMaxPuxar() {
        return pesoMaxPuxar;
    }

    public int getNumeroMaxVagoes() {
        return numeroMaxVagoes;
    }
}
