import java.util.Comparator;

public class ComparadorFuncionarioT implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2){
        return f1.getCargaHorariaSemanal() - f2.getCargaHorariaSemanal();
    }
}
