import java.util.Random;

public class Baralho {
    private Deck cartas;
    private int qtdadeBaralhos;

    public Baralho(int qtdade){
        if (qtdade < 1){
            throw new IllegalArgumentException("Quantidade de baralhos inválida");
        }
        this.qtdadeBaralhos = qtdade;
        cartas = new Deck(52*qtdade);

        // Gera todas as cartas
        for(Naipe naipe:Naipe.values()){
            for(Valor valor:Valor.values()){
                cartas.insereEmbaixo(new Carta(naipe,valor));
            }
        }
    }

    public int quantidade(){
        return cartas.quantidade();
    }

    public boolean estaVazio(){
        return quantidade() == 0;
    }

    public Carta pegaUma(){
        if (cartas.quantidade() == 0){
            throw new UnsupportedOperationException("Baralho vazio!");
        }
        return cartas.retiraDebaixo();
    }

    public void embaralha(){
        Random r = new Random();

        for(int i=0;i<=(3000*qtdadeBaralhos);i++){
            int p1 = r.nextInt(52);
            int p2 = r.nextInt(52);
            cartas.trocaPos(p1, p2);
        }
    }

}
