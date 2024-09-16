public class App {
    public static void main(String[] args) throws Exception {
        CarroFerroviario cf = new CarroFerroviario(10,5000);
        System.out.println(cf);

        Locomotiva l = new Locomotiva(10,5000, 20);
        System.out.println(l.toString());

        Vagao v = new Vagao(20,4000, true);
    }

}
