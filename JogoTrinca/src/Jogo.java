import java.util.Scanner;

public class Jogo {
    private Baralho monte;
    private Deck mao;
    //private Deck mesa;
    private int movimentacoes;
    private Scanner teclado;

    public Jogo(){
        // Cria componentes auxiliares
        teclado = new Scanner(System.in);
        // Cria as entidades do jogo
        monte = new Baralho(2);
        monte.embaralha();
        mao = new Deck(10);
        //mesa = new Deck(104);
        // Inicializa contador de movimentacoes
        movimentacoes = 0;
        // Entrega 9 cartas para o jogador
        for(int i=0;i<9;i++){
            Carta carta = monte.pegaUma();
            mao.insereEmbaixo(carta);
        }
    }

    private void exibeMao(){
        System.out.println("\nCartas na mão do jogador:");
        System.out.println(mao.toString());
        System.out.println("-------------------");
    }

    private int selecionaOpcao(){
        System.out.println("Quantidade de movimentos: "+this.movimentacoes);
        System.out.println("<1> - Comprar uma carta");
        System.out.println("<2> - Descartar uma carta");
        System.out.println("<3> - Trocar cartas de posição");
        System.out.println("<4> - Verificar vitória");
        System.out.println("<5> - Desistir");
        int opcao = 0;
        while(opcao < 1 || opcao > 5){
            System.out.print("Entre sua opçao: ");
            opcao = Integer.parseInt(teclado.nextLine());
            if (opcao >= 1 && opcao <= 5){
                System.out.println("");
                return opcao;
            }else{
                System.out.println("\nOpção inválida! Tente novamente!");
            }
        }
        return 5;
    }

    private int solicitaPosCarta(String msg){
        int pos = 0;
        while(pos < 1 || pos > 10){
            System.out.print(msg);
            pos = Integer.parseInt(teclado.nextLine());
            if (pos >= 1 && pos <= 10){
                System.out.println("");
                return pos;
            }else{
                System.out.println("Posicao invalida: tente novamente!");
            }
        }
        return 0;
    }

    private void comprarUmaCarta(){
        if (mao.quantidade() >= 10){
            System.out.println("Você precisa descartar antes de poder comprar novamente!\n");
            return;
        }
        if (monte.estaVazio()){
            System.out.println("Terminaram as cartas.");
        }
        Carta carta = monte.pegaUma();
        mao.insereEmbaixo(carta);
    }

    private void descartarUmaCarta(){
        if (mao.quantidade() !=10){
            System.out.println("Você só pode descartar se estiver com 10 cartas\n");
            return;
        }
        int posCarta = solicitaPosCarta("Entre a psicao da carta a ser descartada (1 a 10)");
        mao.retira(posCarta-1);
    }

    private void trocarCartasDeLugar(){
        System.out.println("Trocando duas cartas de lugar entre si:");
        int pc1 = solicitaPosCarta("Indique a posiçao da primeira carta: ");
        if (pc1 < 1 || pc1 > mao.quantidade()){
            System.out.println("\nPosição inválida!");
            return;
        }
        int pc2 = solicitaPosCarta("Indique a posiçao da segunda carta: ");
        if (pc2 < 1 || pc2 > mao.quantidade()){
            System.out.println("\nPosição inválida!");
            return;
        }
        mao.trocaPos(pc1-1, pc2-1);
    }

    private boolean ganhou(){
        /*Carta c1 = mao.olha(0);
        Carta c2 = mao.olha(1);
        Carta c3 = mao.olha(2);

        if ((c1.getValor() == c2.getValor()) && (c2.getValor() == c3.getValor())) {
            return true;

        }else{
            return false;
        }
       // System.out.println("Falta fazer !!!");
       //return true;
        */
        return (mao.olha(0).getValor() == mao.olha(1).getValor()) && 
        (mao.olha(1).getValor() == mao.olha(2).getValor()); 
           
        
    }

    public void jogar(){
        int opcao = 0;
        while(opcao != 5){
            exibeMao();
            opcao = selecionaOpcao();
            switch(opcao){
                case 1 : 
                    comprarUmaCarta();
                    break;
                case 2:
                    descartarUmaCarta();
                    break;
                case 3:
                    trocarCartasDeLugar();
                    break;
                case 4:
                    if (ganhou()){
                        System.out.println("Você venceu!!!");
                        opcao = 5;
                    };
                    break;
                default:
                    break;
            }
            this.movimentacoes++;
        }
        System.out.println("Fim");
    }
}
