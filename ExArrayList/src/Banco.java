import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaCorrenteQ2> contas;

    public Banco(){
        contas = new ArrayList<>();
    }

    public void cadastraConta(ContaCorrenteQ2 novaConta){
        contas.add(novaConta);
    }

    public ContaCorrenteQ2 recuperaConta(int nro){
        for(ContaCorrenteQ2 conta:contas){
            if (conta.getNumero() == nro){
                return conta;
            }
        }
        return null;
    }
}
