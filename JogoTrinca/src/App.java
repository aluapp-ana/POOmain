public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jogo de trinca!");

        Carta c = new Carta(Naipe.COPAS,Valor.CINCO);
        System.out.println(c.toString());
        Carta c1 = new Carta(Naipe.ESPADAS,Valor.REI);
        System.out.println(c1.toString());

        System.out.println(Valor.DAMA.ordinal());
        System.out.println(Valor.DAMA.getValor());


        while (baralho.estaVazio()){
            System.out.println(b.PegaUma);
        }
        /*
        Deck d = new Deck(s);
        Carta c = new Carta (Naipe.COPAS, Valor.AS)
        */
    }
}
