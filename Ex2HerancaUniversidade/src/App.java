public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Tecnico tec = new Tecnico(10,5000);
        Professor prof = new CarroFerroviario(10,5000);
        Funcionario func = new CarroFerroviario(10,5000);

        System.out.println(tec);
        System.out.println(prof);
        System.out.println(func);
    }
}
