import java.util.Random;

public class Baralho {
 
    private Deck cartas;

    public Baralho(){
        cartas = new Deck(52);
        

        //GERA TODAS AS CARTAS
        for(Naipe naipe: Naipe.values()){
            for(Valor valor: Valor.values()){
                cartas.insereEmbaixo(new Carta (naipe, valor));
            }
        }
        
    }

    public int quantidade(){
        return cartas.quantidade();
    }
    public boolean estaVazio(){
        return quantidade() == 0;
    }

    public Carta PegaUma(){
        if (cartas.quantidade()== 0){
            throw new UnsupportedOperationException("Baralho Vazio!");
        }
        return cartas.retiraDebaixo();
    }   

    public void embaralha(){
        Random r = new Random();

        for(int i = 0; i<2000; i++){
            int p1 = r.nextInt(52);
            int p2 = r.nextInt(52);
            Carta c1 = cartas.retira(p1);
            Carta c2 = cartas.retira(p2);
            cartas.insere(c1, p1);
            cartas.insere(c2, p1);
        }
    }
}
