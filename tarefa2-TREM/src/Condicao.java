import java.util.ArrayList;

public class Condicao {

    public static void exibirStatus(Garagem garagem) {
        System.out.println("Condição da garagem:");
        garagem.listarLocomotivasLivres();
        garagem.listarVagoesLivres();
    }

    public static void exibirTrens(ArrayList<Trem> trens) {
        if (trens.isEmpty()) {
            System.out.println("Nenhum trem no pátio.");
        } else {
            System.out.println("Trens no pátio:");
            for (Trem trem : trens) {
                System.out.println("Trem ID: " + trem.getId());
                if (trem.getLocomotiva() != null) {
                    System.out.println("Locomotiva: " + trem.getLocomotiva().getId());
                } else {
                    System.out.println("Nenhuma locomotiva engatada.");
                }

                if (!trem.getVagoes().isEmpty()) {
                    System.out.println("Vagões engatados:");
                    for (Vagao vagao : trem.getVagoes()) {
                        System.out.println("Vagão ID: " + vagao.getId());
                    }
                } else {
                    System.out.println("Nenhum vagão engatado.");
                }
                System.out.println("-------------------");
            }
        }
    }
}
