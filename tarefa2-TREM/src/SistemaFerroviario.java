import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFerroviario {
    
    private Garagem garagem = new Garagem();
    private ArrayList<Trem> trens = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public SistemaFerroviario() {
        inicializarSistema();
    }

    private void inicializarSistema() {
        //locomotivas iniciais
        garagem.adicionarLocomotiva(new Locomotiva(1, 100, 10));
        garagem.adicionarLocomotiva(new Locomotiva(2, 200, 7));
        garagem.adicionarLocomotiva(new Locomotiva(3, 500, 5));
        
        //vagões iniciais
        garagem.adicionarVagao(new Vagao(1, 50));
        garagem.adicionarVagao(new Vagao(2, 70));
        garagem.adicionarVagao(new Vagao(3, 90));
        garagem.adicionarVagao(new Vagao(4, 110));
        
        System.out.println("Bem Vindo ao Sistema De Composição de Trens!");
    }

    public void executar() {
        boolean rodando = true;
        while (rodando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar um trem");
            System.out.println("2. Editar um trem");
            System.out.println("3. Listar trens");
            System.out.println("4. Desfazer um trem");
            System.out.println("5. Fim");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    criarTrem();
                    break;
                case 2:
                    editarTrem();
                    break;
                case 3:
                    listarTrens();
                    break;
                case 4:
                    desfazerTrem();
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void criarTrem() {
        System.out.print("Digite o ID do trem: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        Trem trem = new Trem(id);
        trens.add(trem);
        System.out.println("Trem " + id + " criado.");
    }

    private void editarTrem() {
        System.out.print("Digite o ID do trem a ser editado: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        Trem trem = encontrarTremPorId(id);
        if (trem != null) {
            boolean editando = true;
            while (editando) {
                System.out.println("Escolha uma ação:");
                System.out.println("1. Engatar uma locomotiva");
                System.out.println("2. Inserir um vagão");
                System.out.println("3. Remover o último elemento");
                System.out.println("4. Listar locomotivas livres");
                System.out.println("5. Listar vagões livres");
                System.out.println("6. Encerrar edição");
                int acao = scanner.nextInt();
                scanner.nextLine();  

                switch (acao) {
                    case 1:
                        engatarLocomotiva(trem);
                        break;
                    case 2:
                        inserirVagao(trem);
                        break;
                    case 3:
                        removerUltimoElemento(trem);
                        break;
                    case 4:
                        garagem.listarLocomotivasLivres();
                        break;
                    case 5:
                        garagem.listarVagoesLivres();
                        break;
                    case 6:
                        editando = false;
                        System.out.println("Edição do trem " + id + " encerrada.");
                        break;
                    default:
                        System.out.println("Ação inválida.");
                }
            }
        } else {
            System.out.println("Trem não encontrado.");
        }
    }

    private void listarTrens() {
        Condicao.exibirTrens(trens);
    }

    private void desfazerTrem() {
        System.out.print("Digite o ID do trem a ser desfeito: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        Trem trem = encontrarTremPorId(id);
        if (trem != null) {
            if (trem.getLocomotiva() != null) {
                garagem.adicionarLocomotiva(trem.getLocomotiva());
            }
            for (Vagao vagao : trem.getVagoes()) {
                garagem.adicionarVagao(vagao);
            }
            trens.remove(trem);
            System.out.println("Trem " + id + " desfeito.");
        } else {
            System.out.println("Trem não encontrado.");
        }
    }

    private void engatarLocomotiva(Trem trem) {
        garagem.listarLocomotivasLivres();
        System.out.print("Digite o ID da locomotiva a ser engatada: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        Locomotiva locomotiva = garagem.encontrarLocomotivaPorId(id);
        if (locomotiva != null) {
            trem.engatarLocomotiva(locomotiva);
            garagem.removerLocomotiva(locomotiva);
            System.out.println("Locomotiva " + id + " engatada no trem " + trem.getId() + ".");
        } else {
            System.out.println("Locomotiva não encontrada.");
        }
    }

    private void inserirVagao(Trem trem) {
        garagem.listarVagoesLivres();
        System.out.print("Digite o ID do vagão a ser inserido: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        Vagao vagao = garagem.encontrarVagaoPorId(id);
        if (vagao != null) {
            if (trem.getLocomotiva() != null) {
                if (trem.calcularPesoTotal() + vagao.getCapacidadeMaxCarga() <= trem.getLocomotiva().getPesoMaxPuxar()
                        && trem.getVagoes().size() < trem.getLocomotiva().getNumeroMaxVagoes()) {
                    trem.engatarVagao(vagao);
                    garagem.removerVagao(vagao);
                    System.out.println("Vagão " + id + " inserido no trem " + trem.getId() + ".");
                } else {
                    System.out.println("Não é possível inserir o vagão devido às limitações da locomotiva.");
                }
            } else {
                System.out.println("Não é possível inserir vagão sem uma locomotiva.");
            }
        } else {
            System.out.println("Vagão não encontrado.");
        }
    }

    private void removerUltimoElemento(Trem trem) {
        if (!trem.getVagoes().isEmpty()) {
            Vagao vagao = trem.getVagoes().remove(trem.getVagoes().size() - 1);
            garagem.adicionarVagao(vagao);
            System.out.println("Vagão " + vagao.getId() + " desengatado do trem " + trem.getId() + ".");
        } else if (trem.getLocomotiva() != null) {
            Locomotiva locomotiva = trem.getLocomotiva();
            trem.desengatarLocomotiva();
            garagem.adicionarLocomotiva(locomotiva);
            System.out.println("Locomotiva " + locomotiva.getId() + " desengatada do trem " + trem.getId() + ".");
        }
    }

    private Trem encontrarTremPorId(int id) {
        for (Trem trem : trens) {
            if (trem.getId() == id) {
                return trem;
            }
        }
        return null;
    }

    
}
