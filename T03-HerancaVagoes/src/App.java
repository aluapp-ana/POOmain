public class App {
    public static void main(String[] args) throws Exception {
        Locomotiva l = new Locomotiva(10,50000,20);
        System.out.println(l.toString());

        Vagao v = new Vagao(20,4000,true);
        System.out.println(v);
    }
}
