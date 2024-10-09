import java.util.Comparator;

public class ComparadorFuncionario<T> implements Comparator<Funcionario<T>> {
    @Override
    public int compare(Funcionario<T> f1, Funcionario<T> f2){
        return f1.getCargaHorariaSemanal() - f2.getCargaHorariaSemanal();
    }
}
