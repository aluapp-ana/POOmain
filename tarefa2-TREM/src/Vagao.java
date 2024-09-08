public class Vagao {
    private int id;
    private int capacidadeMaxCarga;

    public Vagao(int id, int capacidadeMaxCarga) {
        if(id<0) {throw new IllegalArgumentException("Numero de identificação inválido: " +id);}
        if(capacidadeMaxCarga<0) {throw new IllegalArgumentException("Capacidade máxima de carga inválida: " +capacidadeMaxCarga);}
        this.id = id;
        this.capacidadeMaxCarga = capacidadeMaxCarga;
    }

    public int getId() {
        return id;
    }

    public int getCapacidadeMaxCarga() {
        return capacidadeMaxCarga;
    }
}
