public class App {
    public static void main(String[] args) throws Exception {
        Tecnico tec = new Tecnico("Ze",7000,4);
        Professor prof = new Professor("Primo do Ze",15000,30);
        Pesquisador pesq = new Pesquisador("Amigo do Ze", 15000, 30, 5);

        System.out.println();
        System.out.println(tec);
        System.out.println(prof);
        System.out.println(pesq);
    }
}
