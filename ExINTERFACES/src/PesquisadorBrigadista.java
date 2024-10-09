public class PesquisadorBrigadista extends Pesquisador implements Brigadista {
    public static final int NIVELMAX = 5;
    private int nivelBrigadista;

    public PesquisadorBrigadista(String nome, double salarioBase, int cargaHorariaSemanal, int cargaHorariaDepesquisa, int nivelBrigadista) {
        super(nome, salarioBase, cargaHorariaSemanal, cargaHorariaDepesquisa);
        this.nivelBrigadista = nivelBrigadista;
    }

    @Override
    public int nivelDeFormacao() {
        return nivelBrigadista;
    }

    @Override
    public void incrementaNivelFormacao() {
        if (nivelBrigadista < NIVELMAX) {
            nivelBrigadista++;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Nivel de Brigadista = " + nivelBrigadista;
    }
}
