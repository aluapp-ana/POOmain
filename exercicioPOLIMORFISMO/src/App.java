import java.util.ArrayList;

public class App {
    public static void deposita (ArrayList<ContaBancaria> contas, double valor){
        for(ContaBancaria cb: contas){
            cb.deposito(valor);
        }
        
    }
    


    public static void main(String args[]){
        
        ContaLimite cl = new ContaLimite(100, "Luizinho", 3000, 1500, 0.15);
        cl.retirada(3500);
        System.out.println(cl.toString());
        cl.deposito(1200);
        System.out.println(cl.toString());
        ContaRemunerada cr = new ContaRemunerada(120,"Lala Pato", 2500, 0.05);
        cr.deposito(4000);
        System.out.println(cr.toString());
        
    }

    public void sla(){
        //ArrayList <ContaCorrente> = 
        /*
         * contas.add(numero, nome , saldo, txRemunerecao);
         * contas.add(numero, nome , saldo, txRemunerecao);
         * contas.add(numero, nome , saldo, txRemunerecao);
         * contas.add(numero, nome , saldo, txRemunerecao);
         * 
         * 
        */
    }
}
