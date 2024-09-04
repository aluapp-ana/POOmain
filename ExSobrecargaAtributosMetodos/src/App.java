public class App {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(20,25);
        Ponto p3 = new Ponto(p2);
        Ponto p4 = new Ponto(100, 200);

        double dist1 = Ponto.distancia(p1,p2);
        double dist2 = p4.distancia(p2);
        System.out.println("Distancia: "+dist1);
        System.out.println("Distancia: "+dist2);

    }
}
