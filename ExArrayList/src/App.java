import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        ContaCorrenteQ1 c1 = new ContaCorrenteQ1(-200,"Ze");
        c1.deposito(1000);
        c1.retirada(285);
        c1.deposito(450);
        System.out.println(c1.toString());
        
        ContaCorrenteQ2 c2 = new ContaCorrenteQ2(200,"Ze");
        c2.deposito(1000);
        c2.retirada(285);
        c2.retirada(165);
        c2.deposito(450);
        c2.retirada(35);
        c2.retirada(122);
        c2.retirada(22);
        System.out.println(c2.toString());
        ArrayList<String> extrato = c2.geraExtrato();
        for(String s:extrato){
            System.out.println(s);
        }
        */ 
        Banco eca = new Banco();
        eca.cadastraConta(new ContaCorrenteQ2(10, "Ze"));
        eca.cadastraConta(new ContaCorrenteQ2(15, "Primo do Ze"));
        eca.cadastraConta(new ContaCorrenteQ2(35, "Amigo do Ze"));

        ContaCorrenteQ2 aux = eca.recuperaConta(15);
        aux.deposito(1000);
        aux.retirada(285);
        aux.retirada(165);
        aux.deposito(450);
        aux.retirada(35);
        aux.retirada(122);
        aux.retirada(22);

        aux = eca.recuperaConta(10);
        aux.deposito(8000);
        aux.retirada(2850);
        aux.retirada(1650);
        aux.deposito(3450);
        aux.retirada(35);

        ArrayList<String> extrato = eca.recuperaConta(15).geraExtrato();
        for(String s:extrato){
            System.out.println(s);
        }
    }
}
