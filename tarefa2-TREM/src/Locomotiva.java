public class Locomotiva {
    private int id;
    private int pesoMaxPuxar;
    private int numeroMaxVagoes;

    public Locomotiva(int id, int pesoMaxPuxar, int numeroMaxVagoes) {
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
