import java.util.Comparator;

public class ComparadorFuncionario implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2){
        return f1.getCargaHorariaSemanal() - f2.getCargaHorariaSemanal();
    }
}
