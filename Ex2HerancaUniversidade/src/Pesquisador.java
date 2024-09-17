public class Pesquisador extends Professor{
    private int cargaHorariaDepesquisa;

    public Pesquisador(String nome, double salarioBase, int cargaHorariaSemanal, int cargaHorariaDepesquisa) {
        super(nome, salarioBase, cargaHorariaSemanal);
        this.cargaHorariaDepesquisa = cargaHorariaDepesquisa;
    }

    public int getCargaHorariaDePesquisa() {
        return cargaHorariaDepesquisa;
    }

    @Override
    public int getCargaHorariaSemanal(){
        return super.getCargaHorariaSemanal()+getCargaHorariaDePesquisa();
    }
}
