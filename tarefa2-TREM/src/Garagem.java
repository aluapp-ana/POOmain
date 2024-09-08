import java.util.ArrayList;

public class Garagem {
    private ArrayList<Locomotiva> locomotivasLivres = new ArrayList<>();
    private ArrayList<Vagao> vagoesLivres = new ArrayList<>();

    public void adicionarLocomotiva(Locomotiva locomotiva) {
        locomotivasLivres.add(locomotiva);
    }

    public void adicionarVagao(Vagao vagao) {
        vagoesLivres.add(vagao);
    }

    public void removerLocomotiva(Locomotiva locomotiva) {
        locomotivasLivres.remove(locomotiva);
    }

    public void removerVagao(Vagao vagao) {
        vagoesLivres.remove(vagao);
    }

    public void listarLocomotivasLivres() {
        if (locomotivasLivres.isEmpty()) {
            System.out.println("Nenhuma locomotiva livre.");
        } else {
            System.out.println("Locomotivas livres:");
            for (Locomotiva loc : locomotivasLivres) {
                System.out.println("ID: " + loc.getId() + ", Peso máximo: " + loc.getPesoMaxPuxar() + ", Máximo de vagões: " + loc.getNumeroMaxVagoes());
            }
        }
    }

    public void listarVagoesLivres() {
        if (vagoesLivres.isEmpty()) {
            System.out.println("Nenhum vagão livre.");
        } else {
            System.out.println("Vagões livres:");
            for (Vagao vag : vagoesLivres) {
                System.out.println("ID: " + vag.getId() + ", Capacidade máxima: " + vag.getCapacidadeMaxCarga());
            }
        }
    }

    public Locomotiva encontrarLocomotivaPorId(int id) {
        for (Locomotiva loc : locomotivasLivres) {
            if (loc.getId() == id) {
                return loc;
            }
        }
        return null;
    }

    public Vagao encontrarVagaoPorId(int id) {
        for (Vagao vag : vagoesLivres) {
            if (vag.getId() == id) {
                return vag;
            }
        }
        return null;
    }
}
