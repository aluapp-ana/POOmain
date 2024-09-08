import java.util.ArrayList;

public class Trem {
    private int id;
    private Locomotiva locomotiva;
    private ArrayList<Vagao> vagoes = new ArrayList<>();

    public Trem(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Locomotiva getLocomotiva() {
        return locomotiva;
    }

    public void setLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }

    public ArrayList<Vagao> getVagoes() {
        return vagoes;
    }

    public void engatarLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }

    public void desengatarLocomotiva() {
        this.locomotiva = null;
    }

    public void engatarVagao(Vagao vagao) {
        if (locomotiva != null) {
            vagoes.add(vagao);
        } else {
            System.out.println("Não é possível engatar vagão sem uma locomotiva.");
        }
    }

    public void desengatarUltimoVagao() {
        if (!vagoes.isEmpty()) {
            vagoes.remove(vagoes.size() - 1);
        } else {
            System.out.println("Não há vagões para desengatar.");
        }
    }

    public int calcularPesoTotal() {
        int pesoTotal = 0;
        for (Vagao vagao : vagoes) {
            pesoTotal += vagao.getCapacidadeMaxCarga();
        }
        return pesoTotal;
    }
}
