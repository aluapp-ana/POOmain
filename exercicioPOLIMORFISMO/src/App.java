public class App {
    public static void main(String args[]){
        ContaLimite cl = new ContaLimite(100, "Luizinho", 3000, 1500, 0.15);
        cl.retirada(3500);
        impConta(cl);
        cl.deposito(1200);
        impConta(cl);
        ContaRemunerada cr = new ContaRemunerada(120,"Lala Pato", 2500, 0.05);
        cr.deposito(4000);
        impConta(cr);
    }

    public static void impConta(ContaBancaria conta) {
        System.out.println("Numero da conta: " + conta.getNumero() + " | " + "Nome do titular: " + conta.getNome() + " | " + " Saldo: " + conta.getSaldo());

        if (conta instanceof ContaLimite) {
            ContaLimite contaLimite = (ContaLimite) conta;
            System.out.println("Limite: " + contaLimite.getLimite()+ " | " + "Juros Devidos: " + contaLimite.getJurosDevidos());
        }
        
        System.out.println("\n"); 
    }
    
}
